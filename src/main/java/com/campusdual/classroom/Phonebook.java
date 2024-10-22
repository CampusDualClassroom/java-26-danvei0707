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
        System.out.println("Lista de contactos:");
        // Iterar los elementos de la lista de contactos
        for (Map.Entry<String, Contact> cEntry: contactList.entrySet()){
            System.out.print("\t");
            cEntry.getValue().showContactDetails();
        }
        System.out.println("Fin de la lista");
    }

    // Poder crear y añadir un contacto
    @Override
    public void addContact(Contact contact) {
        // Añadir el código de contacto (key) y el contacto (value)
        contactList.put(contact.getCode(), contact);
        System.out.print("Contacto añadido: ");
        contact.showContactDetails();
    }

    // Eliminar un contacto
    @Override
    public void deleteContact(String contactCode) {
        System.out.print("Eliminando contacto: " + contactCode + "..." );
        contactList.remove(contactCode);
        System.out.println(" OK");
    }

    // ¿Seleccionar un contacto y mostrar su menú de opciones?
    @Override
    public Map<String, Contact> getData() {
        return this.contactList;
    }



}
