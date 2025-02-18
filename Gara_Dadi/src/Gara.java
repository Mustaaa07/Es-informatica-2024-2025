
public class Gara {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Dado dado;
    private int numeroRound;
    private int roundCorrente;

    public Gara(Giocatore giocatore1, Giocatore giocatore2, int numeroRound,Dado dado) {
        this.giocatore1 = giocatore1;
        this.giocatore2 = giocatore2;
        this.numeroRound = numeroRound;
        this.dado = dado;
        this.roundCorrente = 0;
    }

    // Proprietà per verificare se la gara è finita
    public boolean isFineGara() {
        return roundCorrente >= numeroRound;
    }

    // Proprietà per determinare il vincitore o la condizione di parità
    public String getWinner() {
        if (isFineGara()) {
            if (giocatore1.getVittorie() > giocatore2.getVittorie()) {
                return giocatore1.getNome();
            } else if (giocatore2.getVittorie() > giocatore1.getVittorie()) {
                return giocatore2.getNome();
            } else {
                return "Parità";
            }
        } else {
            return "Partita in corso";
        }
    }

    // Esegui un round della partita
    public void round() {
        if (isFineGara()) {
            System.out.println("La gara è già finita!");
            return;
        }

        roundCorrente++;

        int lancioGiocatore1 = dado.lancia();
        int lancioGiocatore2 = dado.lancia();

        System.out.println("Round " + roundCorrente + ":");
        System.out.println(giocatore1.getNome() + " ha lanciato " + lancioGiocatore1);
        System.out.println(giocatore2.getNome() + " ha lanciato " + lancioGiocatore2);

        if (lancioGiocatore1 > lancioGiocatore2) {
            giocatore1.incrementaVittorie();
            System.out.println(giocatore1.getNome() + " vince il round!");
        } else if (lancioGiocatore2 > lancioGiocatore1) {
            giocatore2.incrementaVittorie();
            System.out.println(giocatore2.getNome() + " vince il round!");
        } else {
            // Parità, entrambi guadagnano una vittoria
            giocatore1.incrementaVittorie();
            giocatore2.incrementaVittorie();
            System.out.println("Parità nel round! Entrambi guadagnano una vittoria.");
        }

        System.out.println();
    }

    // Resetta la gara
    public void resetGame() {
        roundCorrente = 0;
        giocatore1.resetVittorie();
        giocatore2.resetVittorie();
    }
}
