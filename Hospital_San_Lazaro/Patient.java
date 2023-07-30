public class Patient extends Human
{
    private String gender;
    private int age;
    int numConsul = 0;
    
    public Patient(String gender, int age, int numConsul, String name){
        super(name);
        this.gender = gender;
        this.age = age;
        this.numConsul += numConsul;
    }
    
    public Patient(){
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
    public void setNumConsul(int numConsul){
        this.numConsul += numConsul;
    }
    public int getNumConsul(){
        return numConsul;
    }
}
