package Palindromo;

import java.util.InputMismatchException;
import java.util.Scanner;
public class i_palindromo{
    public static void main(String args []){
        int[] listNum=pideNums();
        int e;
        int aux;
        String[] listTxt=new String [listNum.length];
        for(int i=0; i<listNum.length; i++){ 
            e=(int) Math.log10(listNum[i]);
            aux=listNum[i];
            aux%=Math.pow(10,e);
            if(verificaPalind(aux)){
                listTxt[i]=("i-palindromo");
            }else{
                listTxt[i]=("no es i-palindromo");
            }
        }
        muestraLista(listNum);
        System.out.println();
        muestraLista(listTxt);
    }
    public static boolean verificaPalind(int num){
        int num2=0;
        int cop=num;
        int dig=(int)Math.log10(num);
        int copdig=dig;
        for(int i=0; i<=copdig; i++){
            int digito=num%10;
            num/=10;
            num2+=digito*(int)Math.pow(10,dig);
            dig--;
        }
        if(cop==num2){
            return true;
        }else{
            return false;
        }
    }
    public static int[] pideNums(){
        try {
            Scanner sc = new Scanner(System.in);
            int e;
            int num = 1;
            int cont = 0;
            int[] listNum = new int[30];
            System.out.println("Ingrese los numeros: ");
            while (true) {
                num = sc.nextInt();
                if (num == 0) {
                    break;
                }
                listNum[cont] = num;
                cont++;
            }
            int[] listNum2 = new int[cont];
            for (int j = 0; j < cont; j++) {
                listNum2[j] = listNum[j];
            }
            return listNum2;
        } catch (InputMismatchException ex) {
            System.out.println("Fatal error: No puedes meter caracteres, solo numeros. " + ex);
            return new int[]{};
        }
    }
    public static void muestraLista(String[] L){
        for(int i=0; i<L.length; i++){
            if(i<L.length){
                System.out.print(L[i]+", ");
            }else{
                System.out.println(L[i]);
            }
        }
    }
    public static void muestraLista(int[] L){
        for(int i=0; i<L.length; i++){
            if(i<L.length){
                System.out.print(L[i]+", ");
            }else{
                System.out.println(L[i]);
            }
        }
    }
}

// TODO: If the number is only one digit, it should return the message "no valido"
/* TODO: Create a method for string values instead of integers: for example: aabba -> "i-palindromo"
    If the user provides a number, throw an error.
*/








