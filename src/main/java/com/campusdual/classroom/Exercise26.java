package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        Contact user = new Contact("Daniel", "Veiga Amor", "666666666");
        System.out.println(user.codify(user.getName(), user.getSurnames()));

        // Contactos de prueba
//        Contact j = new Contact("Javier", "López", "643927845");
//        Contact c = new Contact("Carlos", "Fernández-Simón", "651873409");
//        Contact jm = new Contact("Jose Manuel", "Soria", "667823010");
//        Contact s = new Contact("Santiago", "Fernández Rocha", "669124589");
//        Contact e = new Contact("Esteban", "Serrano del Río", "678493726");
//        Contact fm = new Contact("Fernando Miguel", "Juan de los Santos Requejo León", "656839201");

        // Test códigos
//        System.out.println(j.codify(j.getName(), j.getSurnames()));
//        System.out.println(c.codify(c.getName(), c.getSurnames()));
//        System.out.println(jm.codify(jm.getName(), jm.getSurnames()));
//        System.out.println(s.codify(s.getName(), s.getSurnames()));
//        System.out.println(e.codify(e.getName(), e.getSurnames()));
//        System.out.println(fm.codify(fm.getName(), fm.getSurnames()));

    }
}
