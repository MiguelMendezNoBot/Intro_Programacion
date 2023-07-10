import java.util.InputMismatchException;
import java.util.Scanner;
public class i_palindromo{
    public static void i_palindromoNums(){
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
                while(num>0 && num<=9){
                    if(num>0 && num<=9){
                        System.out.println("No valido");
                        num = sc.nextInt();
                    }
                }
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
            System.out.println("Fatal error: No puedes meter caracteres, solo numeros: " + ex);
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
    
    public static String[] getString(){
        Scanner sc=new Scanner(System.in);
        String word="";
        String[] list=new String[30];
        int cont=0;
        System.out.println("Ingrese las palabras: ");
        try{
            while (true) {
                word = sc.next();
                while((word.length()==1 && word.charAt(0) != 48) || analyzeWord(word)){
                    if((word.length()==1 && word.charAt(0) != 48) || analyzeWord(word)){
                        System.out.println("No valido");
                        word = sc.next();
                    }
                }
                if (word.charAt(0) == 48 && word.length() == 1) {
                    break;
                }
                list[cont] = word;
                cont++;
            }
            String[] list2 = new String[cont];
            for (int j = 0; j < cont; j++) {
                list2[j] = list[j];
            }
            return list2;
        } catch(InputMismatchException ex) {
            System.out.println("Fatal error: No puedes meter numeros, solo caracteres: " + ex);
            String[] nulo={""};
            return nulo;
        }
    }
    public static boolean verifyPalind(String word){
        String invertWord = "";
        String newWord = "";
        int cont = 0;
        for(int i=1; i<word.length(); i++){
            newWord += word.charAt(i);
        }
        for(int i=newWord.length()-1; i>=0; i--){
            invertWord += newWord.charAt(i);
        }
        if(newWord.equals(invertWord)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void i_palindromoWords(){
        String[] list = getString();
        String[] message = new String[list.length];
        for(int i=0; i<list.length; i++){
            if(verifyPalind(list[i])){
                message[i] = "i-palindromo";
            }else{
                message[i] = "no es i-palindromo";
            }
        }
        muestraLista(list);
        System.out.println();
        muestraLista(message);
    }
    public static boolean analyzeWord(String word){
        word = word.toLowerCase();
        boolean bb=false;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>=97 && word.charAt(i)<=122 || word.charAt(0) == 48){
            }else{
                bb = true;
                i = word.length();
            }
        }
        return bb;
    }
    public static void main(String args[]){
        i_palindromoWords();
    }
}

// ------TODO: If the number is only one digit, it should return the message "no valido"------
/* TODO: Create a method for string values instead of integers: for example: aabba -> "i-palindromo"
    If the user provides a number, throw an error.
*/