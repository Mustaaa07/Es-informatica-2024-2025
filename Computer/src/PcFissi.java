import static utility.Tools.*;
import java.util.Scanner;

public class PcFissi {

    private String tipoProcessore;
    private int memoriaRam;
    private int memoriaDiMassa;
    private String marca;
    private String modello;
    private String sistemaOperativo;
    private Contenitore tipoContenitore;

    public PcFissi(String tipoProcessore, int memoriaRam, int memoriaDiMassa, String marca, String modello, String sistemaOperativo) {
        this.tipoProcessore = tipoProcessore;
        this.memoriaRam = memoriaRam;
        this.memoriaDiMassa = memoriaDiMassa;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTipoProcessore() {
        return tipoProcessore;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getMemoriaDiMassa() {
        return memoriaDiMassa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public Contenitore getTipoContenitore() {
        return tipoContenitore;
    }

    public void setTipoProcessore(String tipoProcessore) {
        this.tipoProcessore = tipoProcessore;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setMemoriaDiMassa(int memoriaDiMassa) {
        this.memoriaDiMassa = memoriaDiMassa;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTipoContenitore(Scanner sc){
        String [] opzioni={"Tipo contenitore: "," 1-GRANDE"," 2-MEDIO "," PICCOLO "};
        switch (Menu(opzioni,sc)){
            case 1->{
                tipoContenitore = Contenitore.GRANDE;
            }
            case 2->{
                tipoContenitore = Contenitore.MEDIO;
            }
            case 3->{
                tipoContenitore = Contenitore.PICCOLO;
            }
        }
    }
}
