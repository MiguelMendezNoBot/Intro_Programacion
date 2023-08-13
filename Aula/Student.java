public class Student extends Human
{
    private int score;
    
    public Student(String name, int age, int score){
        super(name, age);
        this.score = score;
        didCame();
        setGender();
    }
    
    public void didCame(){
        if((int) (Math.random()*100) <= 50){
            super.setCame(true);
        }
    }
    public boolean isApproved(){
        return (score > 50) ? true : false;
    }
    
    @Override
    public String toString(){
        return "Estudiante{Nombre:" + getName() + ", Genero:" + getGender() + ", Nota:" + score + ", Edad:" + getAge() + ", Vino:" + getCame() + "}";
    }
}
