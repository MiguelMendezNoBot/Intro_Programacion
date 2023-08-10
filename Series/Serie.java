public class Serie
{
    private String title;
    private int numSeasons;
    private boolean committed;
    private String gender;
    private String creator;
    private static final int NUM_SEASONS_DEF = 3;
    private static final boolean COMMITTED_DEF = false;
    
    public Serie(){
        this("", NUM_SEASONS_DEF, "", "");
    }
    public Serie(String title, String creator){
        this(title, NUM_SEASONS_DEF, null, creator); 
    }
    public Serie(String title, int numSeasons, String gender, String creator){
        this.title = title;
        this.numSeasons = numSeasons;
        this.gender = gender;
        this.creator = creator;
    }
    
    @Override
    public String toString(){
        return "Serie{Titulo:" + title + ", Temporadas:" + numSeasons +  
               ", Subido:" + committed + ", Genero:" + gender + ", Creador: " + creator + "}";   
    }
}
