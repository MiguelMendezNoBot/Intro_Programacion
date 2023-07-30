public class Doctor extends Human
{
    private String specialty;
    
    public Doctor(String specialty, String name){
        super(name);
        this.specialty = specialty; 
    }
    
    public Doctor(){
    }
    
    public String getSpecialty(){
        return specialty;
    }
    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
}
