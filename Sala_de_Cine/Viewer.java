public class Viewer
{
    private String name;
    private int age;
    private double money;
    
    public Viewer (String name, int age, double money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
    
    public double getMoney(){
        return money;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        return "Espectador{Nombre:" + name + ", Edad:" + age + ", Dinero:" + money +"}";
    }
}
