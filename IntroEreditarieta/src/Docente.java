public class Docente extends Persona{

    private String discipline;

    public Docente(String nome, String cognome,int eta,String luogoDiNascita,String colore,String squadraDelCuore){
        super(nome,cognome,eta,luogoDiNascita,colore,squadraDelCuore);
    }

    @Override
    public String toString() {
        return super.presentazione() + " e sono anche un docente";
    }
}
