import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Archivo{
    /*File archi;
    public static void createFile(){
        File archi = new File("Planilla_de_Notas.txt");
        try{
            if(archi.createNewFile()){
                System.out.println();
            }
        }catch(IOException exception){
            System.out.println();
        }
    }*/
    File archi = new File("Planilla_de_Notas.txt");   
    public void writeInFile(List <Alumno> alumList){
        //createFile();
        try{
            PrintWriter wr = new PrintWriter(archi);
            for(int i = 0; i<alumList.size(); i++){
                wr.write(alumList.get(i).getName() + "\n");
                wr.write(alumList.get(i).getGender() + "\n");
                wr.write(Integer.toString(alumList.get(i).getPar1()) + "\n");
                wr.write(Integer.toString(alumList.get(i).getPar2()) + "\n");
                if((alumList.get(i).getPar1() + alumList.get(i).getPar2())/2 < 51){
                    wr.write(Integer.toString(alumList.get(i).getExFinal()) + "\n");
                    if(alumList.get(i).getExFinal() < 51){
                        wr.write(Integer.toString(alumList.get(i).getSegInst()) + "\n");
                    }
                }
            }
            wr.close();
        }catch(IOException exception){
            System.out.println();
        }
    }
    public List <Alumno> readFile(){
        List<Alumno> alumList = new ArrayList<Alumno>();
        try{
            BufferedReader arch = new BufferedReader(new FileReader(archi));
            String line = null;
            while((line = arch.readLine()) != null){
                String name = line;
                String gender = arch.readLine();
                int par1 = Integer.parseInt(arch.readLine());
                int par2 = Integer.parseInt(arch.readLine());
                int exFinal = 0;
                int segInst = 0;
                if((par1 + par2)/2 < 51){
                    exFinal = Integer.parseInt(arch.readLine());
                    if(exFinal < 51){
                        segInst = Integer.parseInt(arch.readLine());
                    }
                }
                alumList.add(new Alumno(name, gender, par1, par2, exFinal, segInst));
            }
            arch.close();
        }catch(IOException ex){
            System.out.println("Error al leer el archivo" + ex);
        }
        return alumList;
    }
}
