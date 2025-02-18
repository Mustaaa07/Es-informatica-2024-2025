import java.util.Random;

public class Dado {
    private int nFacce;
    private Random random;
    public Dado(int nFacce) {
        this.nFacce = nFacce;
        this.random = new Random();
    }

    public int getnFacce() {
        return nFacce;
    }

    public void setnFacce(int nFacce) {
        this.nFacce = nFacce;
    }

    // Metodo che simula il lancio del dado
    public int lancia() {
        return random.nextInt(nFacce) + 1;  // Restituisce un numero casuale tra 1 e 6
    }
}
