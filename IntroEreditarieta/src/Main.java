public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pippo", "Pluto", 99, "Rovigo", "Rosso", "Inter");
        Studente s = new Studente("Bazaj", "Francesco", 33, "Napoli", "Nero", "Milan");

        //System.out.println(s.getSquadraDelCuore());
        //System.out.println(p.presentazione());
        //System.out.println(s.presentazione2());

        Persona p3;
        p3 = s;
        //Up-casting--------------------------------------------------------------------------------------------------------------------------------
        // posso assegnare un oggetto di una sottoclasse ad una variabile della superclasse, cast implicito
        // (trasformare un tipo in un altro tipo, trasformo il tipo studente in tipo persona).
        System.out.println(p3.metodoGenerico());

        Persona p4 = new Studente("Guezam","Aboussnar",102,"Palermo", "Nero", "Napoli");
        System.out.println(p4.metodoGenerico());

        //Down-Casting-------------------------------------------------------------------------------------------------------------------------------

        Persona p5= new Persona("Vittorio", "Alfieri", 2, "Rovigo", "Giallo","Juve");
        Studente s5;

        s5 = (Studente) p5; //Down-Casting (Casting esplicito), !! Operazione non possibile
        System.out.println(s5.metodoNuovo());

        //Binding Dinamico: A runtime chiama il metodo corretto
        Persona p10 = new Studente("Alessandro", "Manzoni", 22, "Firenze", "Viola","Fiorentina");
        Persona p20 = new Docente("Gino", "Angela", 221, "Ferrara", "Marrone","Inter");
        System.out.println(p10.presentazione());
        System.out.println(p20.presentazione());
    }
}