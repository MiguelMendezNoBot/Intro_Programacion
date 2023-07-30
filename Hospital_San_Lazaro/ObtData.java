import java.util.Scanner;
public class ObtData
{
    Scanner sc = new Scanner(System.in);
    public int getNumber(){
        String aux;
        do{
            aux = sc.nextLine();
            if(aux.matches("\\d+")){
                break;
            }else{
                System.out.println("El numero ingresado no es valido");
            }
        }while(true);
        int num = Integer.parseInt(aux);
        return num;
    }
    public int getNumberRange(int a, int b){
        int num = 0;
        do{
            num = getNumber();
            if(num >= a && num <= b){
                break;
            }else{
                System.out.println("El numero ingresado no esta en el rango " + a + " - " + b);
            }
        }while(true);
        return num;
    }
    public  String getWord(){
        String word;
        do{
            word = sc.nextLine();
            if(word.matches("[a-zA-Z\u00F1\u00D1\\s]+")){
                break;
            }else{
                System.out.println("'" + word + "' no es  una palabra válida");
            }
        }while(true);
        return word;
    }
}
