public class Admin_Alumno{
    
    Obtain_Data od = new Obtain_Data();
    Alumno al = new Alumno();
    
    public Alumno createAlum(){
        System.out.print("Inserte el nombre del alumno: ");
        al.setName(od.obtWord());
        al.setGender(gender(al.getName()));
        System.out.print("Inserte la nota del primer parcial de " + "'" + al.getName() + "': ");
        al.setPar1(od.obtScore());
        System.out.print("Inserte la nota del segundo parcial de " + "'" + al.getName() + "': ");
        al.setPar2(od.obtScore());
        if((al.getPar1() + al.getPar2()) / 2 <= 51){
            System.out.print("Inserte la nota del examen final de " + "'" + al.getName() + "': ");
            al.setExFinal(od.obtScore());
            if(al.getExFinal() <= 51 ){
                System.out.print("Inserte la nota de la segunda instancia de " + "'" + al.getName() + "': ");
                al.setSegInst(od.obtScore());
            }
        }
        return new Alumno(al.getName(), al.getGender(), al.getPar1(), al.getPar2(), al.getExFinal(), al.getSegInst());
    }
    public static String gender(String name){
        Obtain_Data od = new Obtain_Data();
        Alumno al = new Alumno();
        boolean bb=true;
        String gender = "";
        System.out.println("¿Cual es el genero de " + "'" + name + "'?");
        System.out.println("1. Varon");
        System.out.println("2. Mujer");
        do{
            int option = od.obtScore();
            switch(option){
                case 1:{
                    gender = "Varón";
                    bb=false;
                    break;
                }
                case 2:{
                    gender ="Mujer";
                    bb=false;
                    break;
                }
                default:{
                    System.out.println("Opcion invalida");
                    break;
                }
            }
        }while(bb);
        return gender;
    } 
}
    
