import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Concessionaria c = new Concessionaria();
        Veicolo v1 = new Veicolo("Ford","Fiesta",3000);
        Veicolo v2 = new Veicolo("Audi","rs7",140000);
        c.addVeicolo(v1);
        c.addVeicolo(v2);
        try{
            System.out.println("inserisci il modello della macchina da cambiare");
            String modello = sc.nextLine();
            System.out.println("Inserisci il nuovo prezzo dell'auto");
            double prezzo = sc.nextDouble();
            Concessionaria.modificaPrezzo(modello, prezzo);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(v1);
        System.out.println(c.numeroVeicoli());
    }
}