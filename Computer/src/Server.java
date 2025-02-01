public class Server extends PcFissi{

    private int numeroProcessori;
    private boolean dischiRAID;

    public Server(String tipoProcessore, int memoriaRam, int memoriaDiMassa, String marca, String modello, String sistemaOperativo, int numeroProcessori, boolean dischiRAID) {
        super(tipoProcessore, memoriaRam, memoriaDiMassa, marca, modello, sistemaOperativo);
        this.numeroProcessori = numeroProcessori;
        this.dischiRAID = dischiRAID;
    }
}
