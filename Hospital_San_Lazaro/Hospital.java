public class Hospital{
    
    private static String nameHospital = "San Lazaro";
    static ObtData od = new ObtData(); 
    static Patient pa = new Patient();
    
    public static void main(String args[]){
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        boolean bb = true;
        do{
            System.out.println("-----Sistema del hospital " + nameHospital + "-----");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Registrar nuevo paciente.");
            System.out.println("2. Buscar paciente.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese una opcion: ");
            int op = od.getNumber();
            switch(op){
                case 1: {
                        option1(null, null);
                        break;
                        }
                case 2: {
                        option2();
                        break;
                        } 
                case 3: {
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
    
    public static void option1(String aux2, String aux3){
        
        Doctor doc = new Doctor();
        ClinicalSheet cs = new ClinicalSheet();
        
        if(aux2 == null){
            System.out.print("Ingrese el nombre del paciente: ");
            pa.setName(od.getWord());
            System.out.println("Ingrese el genero del paciente: ");
            System.out.println("1. Varón.\n2. Mujer.");
            int op = od.getNumberRange(1, 2);
            switch(op){
                case 1: {
                        pa.setGender("Varón");
                        break;
                        }
                case 2: {
                        pa.setGender("Mujer");
                        break;
                        }
            }
        }else{
            pa.setName(aux2);
            pa.setGender(aux3);
        }
        System.out.printf("Ingrese la edad actual de %s: ", pa.getName());
        pa.setAge(od.getNumberRange(1, 100));
        System.out.print("¿En que sonsultorio se esta realizando la consulta?: ");
        cs.setConsulRoom(od.getNumber());
        System.out.printf("Indique el tratamiento que se le ralizara a %s: ",pa.getName());
        cs.setTreatment(od.getWord());
        System.out.print("Nombre del doctor/a: ");
        doc.setName(od.getWord());
        System.out.printf("¿Cual es la especialidad del doctor/a %s?: ", doc.getName());
        doc.setSpecialty(od.getWord());
        System.out.printf("¿%s debe ser internado/a?", pa.getName());
        System.out.println("\n1. SI.\n2. NO.");
        int op = od.getNumberRange(1, 2);
        switch(op){
            case 1: {
                    cs.setIntern(true);
                    System.out.print("Numero de cama correspondiente: ");
                    cs.setNumBed(od.getNumber());
                    System.out.printf("¿Cuantos análisis se le hará a %s?", pa.getName());
                    int aux = od.getNumber();
                    String aux1 = "";
                    for(int i = 1; i <= aux; i++){
                        System.out.print("Análisis " + i + ": ");
                        aux1 += "- " + od.getWord();
                        if(i < aux){
                            aux1 += "\n";
                        }
                    }
                    cs.setTypeAnalysis(aux1);
                    break;
                    }
            case 2: {
                    cs.setIntern(false);
                    break;
                    }
        }
        pa.setNumConsul(1);
        AdminFile af = new AdminFile(pa);
        af.write(cs, pa, doc);
        System.out.println("Hoja clinica agregada con exito\n");
    }
    public static void option2(){
        AdminFile af;
        String[] data;
        do{
            System.out.println("Ingrese el nombre del paciente. Respete mayusculas y acentos: ");
            pa.setName(od.getWord());
            af = new AdminFile(pa);
            data = af.readData();
            if(data[0] != null){
                break;
            }
        }while(true);
        option2_1(af, data); 
    }
    public static void option2_1(AdminFile af, String[] data){
        boolean bb = true;
        do{
            System.out.println("1. Agregar nueva hoja clinica");
            System.out.println("2. Mostrar historial medico completo");
            System.out.println("3. Cancelar");
            int op = od.getNumberRange(1, 3);
            switch(op){
                case 1 :{
                        option1(data[0], data[2]);
                        break;
                        }
                case 2 :{
                        try
                        {
                            af.readAll();
                        }
                        catch (java.io.IOException ioe)
                        {
                            System.out.println("Ocurrio un error: " + ioe.getMessage());
                        }
                        break;
                        }
                case 3 :{
                        bb = false;
                        break;
                        }
            }
        }while(bb);
    }
}
