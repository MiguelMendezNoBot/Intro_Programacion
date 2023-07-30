import java.io.*;
public class AdminFile
{
    public String clinicalFile = "Hojas_Clinicas/";
    File file;
    
    public AdminFile(Patient patient){
        this.clinicalFile += patient.getName() + ".txt";
        file = new File(clinicalFile);
    }
    
    
    public void create(){
        try{
            file.createNewFile();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void readAll() throws IOException {
        if(file.canRead()){
            Reader read = new FileReader(file);      
            BufferedReader readerFile = new BufferedReader(read);
            String line = null;
            do{
                line = readerFile.readLine();
                if(line != null){
                    System.out.println(line);
                }
            }while(line != null);
            readerFile.close();
        }else{
            System.out.println("El archivo clinico especificado no existe");
        }
    }
    
    public void write(ClinicalSheet sheet, Patient patient, Doctor doc){
        try{
            FileWriter wr = new FileWriter(file, true);
            wr.write("----------Archivo Clinico----------");
            wr.write("\nPaciente: " + patient.getName());
            wr.write("\nGénero: " + patient.getGender());
            wr.write("\nEdad: " + patient.getAge() + "\n");
            wr.write("\nConsultorio: " + patient.getNumConsul() +  "\n");
            wr.write("\nTratamiento: " + sheet.getTreatment());
            wr.write("\nNombre del medico: " + doc.getName());
            wr.write("\nEspecialidad del medico: " + doc.getSpecialty() + "\n");
            if(sheet.getIntern()){
                wr.write("\nInternado: SI");
                wr.write("\nNumero de cama correspondiente: " + sheet.getNumBed());
                wr.write("\nAnálisis hechos: \n" + sheet.getTypeAnalysis());
            }else{
                wr.write("\nInternado: NO");
            }
            wr.write("\n----------------------------------------");
            wr.write("\nVeces Consultadas: " + patient.getNumConsul() + "\n");
            wr.write("");
            wr.close();
        }catch(Exception ex){
            System.out.println("Ocurrio un errorses: " + ex.getMessage());
        }
    }
    
    public String[] readData(){
        String[] data = new String[11];
        String[] words;
        int aux = 0;
        try{
            Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line = br.readLine();
            if(!file.canRead()){
                System.out.println("El archivo clinico especificado no existe");
            }else{
                while((line = br.readLine()) != null){
                    words = line.split(": ");
                    if(words.length == 2){
                        data[aux] = words[1];
                        aux++;
                    }
                    if(aux == 8){
                        break;
                    }
                }
                if(line.charAt(11) == 'S'){
                    data[9] = "";
                    while((line = br.readLine()) != null){
                        words = line.split(": ");
                        if(words.length == 2){
                            data[aux] = words[1];
                            aux++;
                        }else if(line.length() != 0){
                            if(words[0].charAt(0) == '-' && words[0].charAt(1) == ' ' ){
                                while(line.charAt(0) == '-' && line.charAt(1) == ' '){
                                    data[aux] += line + "\n";
                                    line = br.readLine();
                                }
                                aux++;
                            }
                        }
                    }
                }else if(line.charAt(11) =='N'){
                    line = br.readLine();
                    line = br.readLine();
                    words = line.split(": ");
                    data[aux] = words[1];
                    data[9] = null;
                }
            }
            }catch(Exception ex){
            System.out.println("Ocurrio un error: " + ex.getMessage());
        }
        return data;
    }
}
