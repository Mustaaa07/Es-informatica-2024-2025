public class Giocatore {
    private String nome;
    private int vittorie;

    public Giocatore(String nome) {
        this.nome = nome;
        this.vittorie = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVittorie() {
        return vittorie;
    }

    // Incrementa il punteggio di vittorie del giocatore
    public void incrementaVittorie() {
        this.vittorie++;
    }

    // Resetta il punteggio di vittorie
    public void resetVittorie() {
        this.vittorie = 0;
    }
}
