import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Archivo{
    File archi = new File("Planilla_de_Notas.txt");   
    public void writeInFile(List <Alumno> alumList){
        //createFile();
        try{
            PrintWriter wr = new PrintWriter(archi);
            for(int i = 0; i < alumList.size(); i++){
                wr.write(alumList.get(i).getName());
                wr.write(", " + alumList.get(i).getGender());
                wr.write(", " + Integer.toString(alumList.get(i).getPar1()));
                wr.write(", " + Integer.toString(alumList.get(i).getPar2()));
                if((alumList.get(i).getPar1() + alumList.get(i).getPar2())/2 < 51){
                    wr.write(", " + Integer.toString(alumList.get(i).getExFinal()));
                    if(alumList.get(i).getExFinal() < 51){
                        wr.write(", " + Integer.toString(alumList.get(i).getSegInst()));
                    }else{
                        wr.write(", 0");
                    }
                }else{
                    wr.write(", 0");
                    wr.write(", 0");
                }
                wr.write("\n");
            }
            wr.close();
        }catch(IOException ioe){
            System.out.println("Ocurrio un error: " + ioe.getMessage());
        }
    }
    public List <Alumno> readFile(){
        List<Alumno> alumList = new ArrayList<Alumno>();
        try{
            BufferedReader arch = new BufferedReader(new FileReader(archi));
            String line = null;
            while((line = arch.readLine()) != null){
                String[] list = line.split(", ");
                alumList.add(new Alumno(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), 
                                        Integer.parseInt(list[4]), Integer.parseInt(list[5])));
            }
            arch.close();
        }catch(IOException ioe){
            System.out.println("Error al leer el archivo: " + ioe.getMessage());
        }
        return alumList;
    }
}
