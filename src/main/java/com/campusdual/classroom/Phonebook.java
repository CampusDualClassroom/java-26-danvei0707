package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Phonebook implements ContactListActions{
    // El key es el código generado en cada contacto
    protected Map<String, Contact> contactList = new HashMap<String, Contact>();

    public Map<String, Contact> getContactList() {
        return contactList;
    }

    @Override
    public void showPhonebook() {
        // Iterar los elementos de la lista de contactos
        for (Map.Entry<String, Contact> contact: contactList.entrySet()){
            System.out.println("Contacto! Sin definir");
        }
    }

    // Poder crear y añadir un contacto
    @Override
    public void addContact(Contact contact) {
        // Añadir el código de contacto (key) y el contacto (value)
        //contactList.put();
    }

    // Eliminar un contacto
    @Override
    public void deleteContact(String contactCode) {

    }

    // Seleccionar un contacto y mostrar su menú de opciones ????
    @Override
    public Map<String, Contact> getData() {
        return this.contactList;
    }



}
