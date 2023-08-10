public class VideoJuego
{
    private String title;
    private double stimatedHours;
    private boolean committed;
    private String gender;
    private String company;
    private static final double STIMATED_HOURS_DEF = 10;
    private static final boolean COMMITED_DEF = false;
    
    private VideoJuego(){
        this("", STIMATED_HOURS_DEF, "", "");
    }
    public VideoJuego(String title, double stimatedHours){
        this(title, stimatedHours, "", "");
    }
    public VideoJuego(String title, double stimatedHours, String gender, String company){
        this.title = title;
        this.stimatedHours = stimatedHours;
        this.gender = gender;
        this.company = company;
    }
    
    @Override
    public String toString(){
        return "VideoJuego{Titulo:" + title + ", Horas estimadas:" + stimatedHours + ", Subido:"+ committed + ", Genero:" + gender +", Compañia:" +company +"}";
    }
}
