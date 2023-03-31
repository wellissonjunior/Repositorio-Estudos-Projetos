package videocassete;

public class Aparelho {

    private String liga;
    private String play;
    private String stop;
    private String ff;
    private String rf;
    private String rec;
    private String eject;

    public String getLiga() {
        System.out.println("Aparelho ligado!");
        return liga;
    }
    public void setLiga(String liga) {
        this.liga = liga;
    }
    public String getEject() {
        System.out.println("Retirando a Fita");
        return eject;
    }
    public void setEject(String eject) {
        this.eject = eject;
    }
    public String getPlay() {
        System.out.println("O filme vai começar!");
        return play;
    }
    public void setPlay(String play) {
        this.play = play;
    }
    public String getStop() {
        System.out.println("O filme parou.");
        return stop;
    }
    public void setStop(String stop) {
        this.stop = stop;
    }
    public String getFf() {
        System.out.println("Adiantando o filme...");
        return ff;
    }
    public void setFf(String ff) {
        this.ff = ff;
    }
    public String getRf() {
        System.out.println("Voltando o filme...");
        return rf;
    }
    public void setRf(String rf) {
        this.rf = rf;
    }
    public String getRec() {
        System.out.println("Você está gravando o que está passando na TV");
        return rec;
    }
    public void setRec(String rec) {
        this.rec = rec;
    }
    
    
}