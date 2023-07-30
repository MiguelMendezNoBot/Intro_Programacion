public class ClinicalSheet  
{
    private int consulRoom = 0; 
    private boolean intern;
    private int numBed; 
    private String typeAnalysis;
    private String treatment;
    
    public ClinicalSheet(int consulRoom, boolean intern, int numBed, String typeAnalysis, String treatment){
        this.consulRoom = consulRoom;
        this.intern = intern;
        this.numBed = numBed;
        this.typeAnalysis = typeAnalysis;
        this.treatment = treatment;
    }
    public ClinicalSheet(){
    }
    
    public int getConsulRoom(){
        return consulRoom;
    }
    public void setConsulRoom(int consulRoom){
        this.consulRoom = consulRoom;
    }
    public boolean getIntern(){
        return intern;
    }
    public void setIntern(boolean intern){
        this.intern = intern;
    }
    public int getNumBed(){
       return numBed; 
    }
    public void setNumBed(int numBed){
        this.numBed = numBed;
    }
    public String getTypeAnalysis(){
        return typeAnalysis;
    }
    public void setTypeAnalysis(String typeAnalysis){
        this.typeAnalysis = typeAnalysis;
    }
    public String getTreatment(){
        return treatment;
    }
    public void setTreatment(String treatment){
        this.treatment = treatment;
    }
}
