package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.Arrays;

public class Exercise26 {
    static Contact user = new Contact("Daniel", "Veiga Amor", "666666666");

    public static void main(String[] args) {
        // Crear la agenda y los contactos
        System.out.println("\n______ Inicialización _________________________________");
        Phonebook agenda = new Phonebook();
        populateAgenda(agenda);
        agenda.addContact(user);

        // Hacer llamadas
        System.out.println("\n______ Realización de llamadas ________________________");
        user.callMyNumber();
        user.callOtherNumber("669876453");

        // Listar agenda y comprobar modificaciones
        System.out.println("\n______ Agenda ANTES de las modificaciones _____________");
        agenda.showPhonebook();

        System.out.println("\n______ Modificaciones _________________________________");
        agenda.deleteContact("jlopez");
        agenda.deleteContact("jsoria");
        agenda.deleteContact("fjdelossantosrequejoleon");

        System.out.println("\n______ Agenda DESPUÉS de las modificaciones _____________");
        agenda.showPhonebook();

    }

    private static void populateAgenda(Phonebook agenda){
        // Contactos de prueba
        Contact j = new Contact("Javier", "López", "643927845");
        Contact c = new Contact("Carlos", "Fernández-Simón", "651873409");
        Contact jm = new Contact("Jose Manuel", "Soria", "667823010");
        Contact s = new Contact("Santiago", "Fernández Rocha", "669124589");
        Contact e = new Contact("Esteban", "Serrano del Río", "678493726");
        Contact fm = new Contact("Fernando Miguel", "Juan de los Santos Requejo León", "656839201");

        ArrayList<Contact> data = new ArrayList<Contact>(Arrays.asList(j, c, jm, s, e, fm));

        for (Contact ct : data) {
            agenda.addContact(ct);
        }

    }
}
