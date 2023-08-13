public class VideoJuego implements Entregable
{
    private String title;
    private double stimatedHours;
    private boolean committed;
    private String gender;
    private String company;
    private static final double STIMATED_HOURS_DEF = 10;
    private static final boolean COMMITED_DEF = false;
    
    public VideoJuego(){
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
    
    public double getStimatedHours(){
        return stimatedHours;
    }
    
    @Override
    public void deliver(){
        committed = true;
    }
    @Override 
    public void repay(){
        committed = false;
    }
    @Override 
    public boolean isDelivered(){
        return committed;
    }
    @Override
    public boolean compare(Object a){
        if(a instanceof VideoJuego){
            VideoJuego a1 = (VideoJuego) a;
            return (stimatedHours > a1.getStimatedHours()) ? true : false;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "VideoJuego{Titulo:" + title + ", Horas estimadas:" + stimatedHours + ", Subido:"+ committed + ", Genero:" + gender +", Compañia:" +company +"}";
    }
}
