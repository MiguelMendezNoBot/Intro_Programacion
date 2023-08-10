public class Roots
{
    private int a; 
    private int b;
    private int c;
    
    public Roots(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void getRoots(){
        System.out.println("Respuesta 1: " + ((-b+Math.sqrt(getDiscriminant()))/(2*a)));
        System.out.println("Respuesta 2: " + ((-b-Math.sqrt(getDiscriminant()))/(2*a)));
    }
    public void getRoot(){
        System.out.println("Respuesta unica:" + ((-b+Math.sqrt(getDiscriminant()))/(2*a)));
    }
    public double getDiscriminant(){
        return (b*b) - (4*a*c);
    }
    public boolean hasRoots(){
        return getDiscriminant() >= 0;
    }
    public boolean hasRoot(){
        return getDiscriminant() == 0;
    }
    public void calc(){
        if(hasRoot()){
            getRoot();
        }else if(hasRoots()){
            getRoots();
        }else{
            System.out.println("No existen soluciones");
        }
    }
}
