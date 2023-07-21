import java.util.Scanner;
public class Obtain_Data{
    
    Scanner sc = new Scanner(System.in);
    
    
    public String obtWord(){
        boolean bb = true;
        String word;
        do{
            word = sc.next();
            if(word.matches("[a-zA-Z\u00F1\u00D1]+")){
                bb = false;
            }else{
                System.out.println("'" + word + "' no es  una palabra válida");
            }
        }while(bb);
        return word;
    }
    public int obtScore(){
        boolean bb = true;
        int score = 7;
        try{
            do{
                score = sc.nextInt();
                if(score <= 100 && score > 0){
                    bb = false;
                }else{
                    System.out.println("Numero fuera de rango");
                }
            }while(bb);
        }catch(Exception e){
            System.out.println("Error: El valor ingresado no es valido.");
        }
        return score;
    }
}
