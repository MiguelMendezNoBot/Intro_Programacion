import java.util.Scanner;
public class Ejecutable
{
    Scanner sc = new Scanner(System.in);
    public void Main(){
        System.out.print("Longitud de las contraseñas a generar: ");
        int length = sc.nextInt();
        System.out.print("Longitud de la lista de contraseñas: ");
        int lengthArray = sc.nextInt();
        Password[] arrayOfPass = arrayPass(length, lengthArray);
        boolean[] arrayOfStrong = arrayStrong(arrayOfPass);
        for(int i = 0; i < arrayOfPass.length; i++){
            System.out.println(arrayOfPass[i] + ": " + arrayOfStrong[i]);
        }
    }
    
    public Password[] arrayPass(int length, int lengthArray){
        Password[] arrayOfPass = new Password[lengthArray];
        for(int i = 0; i < lengthArray; i++){
            Password pass = new Password(length);
            arrayOfPass[i] = pass;
        }
        return arrayOfPass;
    }
    
    public boolean[] arrayStrong(Password [] arrayOfPass){
        boolean[] arrayOfStrong = new boolean [arrayOfPass.length];
        for(int i = 0; i < arrayOfPass.length; i++){
            arrayOfStrong[i] = arrayOfPass[i].isStrong();
        }
        return arrayOfStrong;
    }
}
