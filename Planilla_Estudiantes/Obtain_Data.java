import java.util.Scanner;
public class Obtain_Data{
    
    Scanner sc = new Scanner(System.in);
    
    public String obtWord(){
        boolean bb = true;
        String word;
        do{
            word = sc.nextLine();
            if(word.matches("[a-zA-Z\u00F1\u00D1\\s]+")){
                bb = false;
            }else{
                System.out.println("'" + word + "' no es  una palabra válida");
            }
        }while(bb);
        return word;
    }
    public int obtScore(){
        int score = 0;
        try{
            do{
                score = obtNum();
                if(score <= 100 && score > 0){
                    break;
                }else{
                    System.out.println("Numero fuera de rango");
                }
            }while(true);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return score;
    }
    public int obtNum(){
        String num = "";
        try{
            num = sc.nextLine();
            //sc.nextLine();
            do{
                if(num.matches("\\d+")){
                    break;
                }else{
                    System.out.println("'" + num + "' no es un numero valido");
                    num=sc.nextLine();
                    //sc.next();
                }
            }while(true);
        }catch(Exception e){
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
        return Integer.parseInt(num);
    }
}
