import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class MainProgram{
    public static void main(String [] args){
        
        Admin_Alumno alumno = new Admin_Alumno();
        Obtain_Data od = new Obtain_Data();
        List<Alumno> alumList = new ArrayList<Alumno>();
        Archivo ar = new Archivo();
        alumList = ar.readFile();
        int option;
        String elim;
        
        boolean bb=true;
        do{
            menu1();
            option = od.obtScore(); 
            switch(option){
                case 1:{
                    alumList.add(alumno.createAlum());
                    break;
                    }
                case 2:{
                    System.out.println("Nombre del alumno que desea eliminar: ");
                    elim = od.obtWord();
                    boolean bb1 = false;
                    for(int i = 0; i < alumList.size(); i++){
                        if(elim.equals(alumList.get(i).getName())){
                            alumList.remove(i);
                            i = alumList.size();
                            bb1 = true;
                        }
                    }
                    if(bb1){
                        System.out.println("Se elimino a " + elim + " de la lista");
                    }else{
                        System.out.println(elim + " no esta en la lista");
                    }
                    break;
                    }
                case 3:{
                    if(alumList.size() == 0){
                        System.out.println("No existen alumnos en la lista");
                    }else{
                        for(int i = 0; i < alumList.size(); i++){
                            System.out.print(alumList.get(i).getName() + ", ");
                            System.out.print(alumList.get(i).getGender() + ", ");
                            System.out.print(Integer.toString(alumList.get(i).getPar1()) + ", ");
                            System.out.print(Integer.toString(alumList.get(i).getPar2()));
                            if((alumList.get(i).getPar1() + alumList.get(i).getPar2())/2 < 51){
                                System.out.print(", " + Integer.toString(alumList.get(i).getExFinal()));
                                if(alumList.get(i).getExFinal() <51){
                                    System.out.print(", " + Integer.toString(alumList.get(i).getSegInst()));
                                }
                            }
                            System.out.println();
                        }
                    }
                    break;
                    }
                case 4:{
                    for(int i = 0; i < alumList.size(); i++){
                        if(alumList.get(i).aprobOrNot()){
                            System.out.print(alumList.get(i).getName());
                            if(i != alumList.size() - 1){
                                System.out.print(", ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                    }
                case 5:{
                    for(int i = 0; i < alumList.size(); i++){
                        if(!alumList.get(i).aprobOrNot()){
                            System.out.print(alumList.get(i).getName());
                            if(i != alumList.size() - 1){
                                System.out.print(", ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                    }
                case 6:{
                    int male = 0;
                    int women = 0;
                    for(int i = 0; i < alumList.size(); i++){
                        if(alumList.get(i).getGender().equals("Mujer") && alumList.get(i).aprobOrNot()){
                            women++;
                        }
                        if(alumList.get(i).getGender().equals("Varón") && alumList.get(i).aprobOrNot()){
                            male++;
                        }
                    }
                    if(male > women){
                        System.out.println("Varones dominan");
                    }else if(male == women){
                        System.out.println("Ninguno domina, ambos son perdedores");
                    }else{
                        System.out.println("Mujeres dominan");
                    }
                    break;
                    }
                case 7:{
                    ar.writeInFile(alumList);
                    bb = false;
                    break;
                    }
                default:{
                        System.out.println("Opcion invalida");
                        break; 
                    }
            }
        }while(bb);
    }
    public static void menu1(){
        System.out.println("----------MENU----------");
        System.out.println("1.Agregar alumno");
        System.out.println("2.Eliminar alumno");
        System.out.println("3.Mostrar lista de alumnos");
        System.out.println("4.Mostrar los alumnos aprobrados");
        System.out.println("5.Mostrar los alumnos reprobados");
        System.out.println("6.Mostrar a los aprobados por genero");
        System.out.println("7.Salir y guardar");
    }
}
