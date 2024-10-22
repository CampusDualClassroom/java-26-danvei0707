package com.campusdual.classroom;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Contact implements ICallActions{

    // INICIALIZACIÓN VARIABLES Y CONSTRUCTOR

    protected String name;
    protected String surnames; // Puede ser más de uno, separado por espacios
    protected String phone;
    protected String code;

    public String codify(String name, String surnames){
        StringBuilder code = new StringBuilder();
        StringBuilder n = new StringBuilder(name);
        StringBuilder s = new StringBuilder(surnames);

        // Name logics
        code.append( n.charAt(0)); // 1ª letra

        // Surnames logics
        if (s.indexOf(" ") == -1){
            code.append(surnames); // Si solo hay un apellido, añadirlo entero
        } else {
            // Crear una lista que guarde los diferentes apellidos
            List<String> sList = new ArrayList<String>();

            // Añadir los diferentes apellidos a la lista (según espacios)
            while (s.indexOf(" ") != -1) {
                sList.add(s.substring(0,s.indexOf(" ")));
                s.delete(0, s.indexOf(" ") + 1);
            }
            sList.add(s.toString()); // Añadir el último apellido

            // Finalmente, añadir los elementos de la lista al código
            for (int i = 0; i < sList.size(); i++) {
                StringBuilder sx = new StringBuilder(sList.get(i)); // Extraer apellido
                if (i == 0){ code.append(sx.charAt(0)); } // El primer apellido solo incluye 1 letra
                else { code.append(sList.get(i)); } // El resto de apellidos van enteros
            }
        }
        return normalice(code.toString());
    }

    public Contact(String name, String surnames, String phone) {
        this.name = name.trim();
        this.surnames = surnames.trim();
        this.phone = phone.trim();
        // this.code = codify(name, surnames);
        /*
            Uso de trim para evitar conflictos al crear el código
            Fuente: https://www.tutorialspoint.com/trim-a-string-in-java-to-remove-leading-and-trailing-spaces
        */
    }


    // ACCIONES DE CONTACTO (Métodos requeridos)

    @Override
    public void callMyNumber() {
        // Especificar que te estás llamando a ti mismo y mostrar número
        System.out.println("Llamándote a ti mismo. Marcado: " + this.phone);
    }

    @Override
    public void callOtherNumber(String number) {
        // Especificar que llamas a otro contacto, mostrar número
        System.out.println("Llamando al contacto. Marcado: " + number);

    }

    @Override
    public void showContactDetails() {
        // Mostrar detalles del contacto por pantalla
        System.out.println("Información" + " de " + this.code);
        System.out.println("\t" + this.name);
        System.out.println("\t" + this.surnames);
        System.out.println("\t" + this.phone);
    }

    // UTILS
    protected String normalice(String text){
        return Normalizer
                .normalize(text, Normalizer.Form.NFD) // Separa el acento de la letra (á: a + ´)
                .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")  // REGEX: Elimina los símbolos de acentos
                .toLowerCase(); // Pasar el texto a minúsculas

        // Fuente (lógica acentos): https://stackoverflow.com/questions/15190656/easy-way-to-remove-accents-from-a-unicode-string
    }



    // GETTERS - ! No necesitamos setters que modifiquen

    public String getName() {
        return name;
    }


    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }


    public String getCode() {
        return code;
    }
}
