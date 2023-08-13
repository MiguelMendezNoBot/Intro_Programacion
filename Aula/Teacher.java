public class Teacher extends Human
{
    private Subject subject;

    public Teacher(String name, int age){
        super(name, age);
        didCame();
        subject = setSubject();
        setGender();
    }
    public Subject setSubject(){
        int op = (int) (Math.random()*3) + 1;
        switch(op){
            case 1: {return Subject.MATHS;}
            case 2: {return Subject.PSYCHOLOGY;}
            default: {return Subject.FISICS;}
        }
    }
    public void didCame(){
        if((int) (Math.random()*100)+1 <= 20){
            setCame(true);
        }
    }

    public Subject getSubject(){
        return subject;
    }
    
    @Override
    public String toString(){
        return "Profesor{Nombre:" + getName() + ", Genero:" + getGender() + ", Materia:" + subject + ", Edad:" + getAge() + ", Vino:" + getCame() + "}";
    }
}
