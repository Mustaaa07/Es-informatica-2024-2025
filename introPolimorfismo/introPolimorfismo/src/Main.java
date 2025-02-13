public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("Fabio", "Cucu", 756, "Napoli", "Marrone", "Napoli");
        Studente s1 = new Studente("Bazaj", "Francesco", 33, "Napoli", "Nero", "Milan");
        Studente s2 = new Studente("Riccardo", "Gianesella", 33, "Napoli", "Nero", "Milan");
        Teatro t = new Teatro();
        try {
            t.entrataTeatro(d1);
            t.entrataTeatro(s1);
            t.entrataTeatro(s2);
            t.stampaAVideo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //con clone rispettiamo l'incapsulamento
        s1.setColorePreferito("Giallo");
        System.out.println(s1.getColorePreferito());
        System.out.println("****");
        t.stampaAVideo();  //con clone non rispettiamo l'incapsulamento...
        Libro l = new Libro("autore1","titolo1");
        Studente s4F = new Studente ("nome4F", "cognome4F", 104, "Rovigo", "Indaco", "Redi",l);
        try {
            t.entrataTeatro(s4F);
            t.stampaAVideo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}