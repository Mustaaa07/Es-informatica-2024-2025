import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del Giocatore 1: ");
        String nomeGiocatore1 = scanner.nextLine();
        System.out.print("Inserisci il nome del Giocatore 2: ");
        String nomeGiocatore2 = scanner.nextLine();

        Giocatore giocatore1 = new Giocatore(nomeGiocatore1);
        Giocatore giocatore2 = new Giocatore(nomeGiocatore2);

        System.out.print("Quanti round vuoi giocare? ");
        int numeroRound = Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci facce dado");
        Dado dado = new Dado(scanner.nextInt());
        Gara gara = new Gara(giocatore1, giocatore2, numeroRound,dado);

        while (!gara.isFineGara()) {
            gara.round();
        }

        System.out.println("La gara è terminata!  " + gara.getWinner());
        
    }
}
