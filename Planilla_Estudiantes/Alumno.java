public class Alumno{
    
    String name;
    String gender;
    int par1;
    int par2;
    int exFinal;
    int segInst;
    
    public Alumno(String name, String gender, int par1, int par2, int exFinal, int segInst){
        this.name = name;
        this.gender = gender;
        this.par1 = par1;
        this.par2 = par2;
        this.exFinal = exFinal;
        this.segInst = segInst;
    }
    
    public Alumno(){
        this.name = name;
        this.gender = gender;
        this.par1 = par1;
        this.par2 = par2;
        this.exFinal = exFinal;
        this.segInst = segInst;
    }
    public boolean aprobOrNot(){
        boolean bb = false;
        if((par1 + par2)/2 > 50){
            bb = true;
        }
        if(exFinal > 50 || segInst > 50){
            bb = true;
        }
        return bb;
    }
    
    public void reset(){
        name = null;
        gender = null;
        par1 = 0;
        par2 = 0;
        exFinal = 0;
        segInst = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;   
    }        
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;   
    }
    
    public int getPar1(){
        return par1;
    }
    
    public void setPar1(int par1){
        this.par1 = par1;
    }
    
    public int getPar2(){
        return par2;
    }
    
    public void setPar2(int par2){
        this.par2 = par2;
    }
    
    public int getExFinal(){
        return exFinal;
    }
    
    public void setExFinal(int ExFinal){
        this.exFinal = ExFinal;
    }
    
    public int getSegInst(){
        return segInst;
    }
    
    public void setSegInst(int SegInst){
        this.segInst = SegInst;
    }
}
