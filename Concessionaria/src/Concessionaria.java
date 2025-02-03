
import java.util.ArrayList;

public class Concessionaria {
    private static ArrayList<Veicolo> officina = new ArrayList<>();

    public void addVeicolo(Veicolo v){
        officina.add(v);
    }
    public int numeroVeicoli(){
        return officina.size();
    }

    public static void modificaPrezzo(String modello, double prezzo)throws Exception{
        boolean trovato = false;
        for(Veicolo v : officina){
            if(v.getModello().equalsIgnoreCase(modello)){
                v.setPrezzo(prezzo);
                trovato = true;
            }
        }
        if(!trovato) {
            throw new Exception();
        }
    }
}
