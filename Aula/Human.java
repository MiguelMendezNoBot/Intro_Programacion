public abstract class Human
{
    private String name;
    private Gender gender;
    private int age;
    private boolean came;
    
    public abstract void didCame();
    
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setCame(boolean came){
        this.came = came;
    }
    public boolean getCame(){
        return came;
    }
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public void setGender(){
        int op = (int) (Math.random()*2)+1;
        switch(op){
            case 1: {gender = Gender.MALE;
                    break;}
            case 2: {gender = Gender.FEMALE;
                    break;}
        }
    }
}
