import java.util.Scanner;
import java.util.InputMismatchException;
public class Dibuja_tablero{
    /*public static void main(String [] args){
        for(int i=0; i<7; i++){
            for(int k=0; k<3; k++){   
                if(i%2==0){
                    System.out.print("   ");
                    for(int j=0; j<4; j++){
                    System.out.print("XXX");
                    System.out.print("   ");
                    }
                }else{
                    for(int j=0; j<4; j++){
                    
                    System.out.print("XXX");
                    System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }*/

    public static String[] buildX(int sizeBox){
        String[] x=new String[sizeBox];
        for(int i=0; i<sizeBox; i++){
            x[i]="X";
        }
        return x;
    }
    public static String[] buildSpace(int sizeBox){
        String[] space=new String[sizeBox];
        for(int i=0; i<sizeBox; i++){
            for(int j=0; j<sizeBox; j++){
                space[i]=" ";
            }
        }
        return space;
    }
    public static void showBox(String[] box){
        for(int i=0; i<box.length; i++){
            System.out.print(box[i]);
        }
    }
    public static void buildBoard(int size, int board){
        for(int i=0; i<board; i++){
            for(int k=0; k<size; k++){   
                if(i%2==0){
                    showBox(buildSpace(size));
                    for(int j=0; j<board/2; j++){
                        showBox(buildX(size));
                        showBox(buildSpace(size));
                    }
                    if(board%2==1){
                        showBox(buildSpace(size));
                    }
                }else{
                    for(int j=0; j<board/2; j++){
                    showBox(buildX(size));
                    showBox(buildSpace(size));
                    }
                    if(board%2==1){
                        showBox(buildX(size));
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String [] args){
        try{
            Scanner sc=new Scanner(System.in);
            int board=0;
            int size=0;
            System.out.print("Tamaño de casilla: ");
            size=sc.nextInt();
            System.out.print("Tamaño de tablero: ");
            board=sc.nextInt();
            while(board<=0){
                if(size<=0){
                    System.out.println("Casilla no valida");
                    size=sc.nextInt();
                }
                if(board<=0){
                    System.out.println("Tablero no válido");
                    board=sc.nextInt();
                   }
            }
            buildBoard(size, board);
        }catch(InputMismatchException ex){
            System.out.println("Fatal error: no puedes introducir caracteres, solo numeros");
        }
    }
}
// TODO: Remove empty spaces at the start of the board
/* TODO: Create a method to create the board with dynamic size of each box
    public static void buildBoard(int longitude){}
    from main I call:
    buildBoard(4);
        XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX
    ...
*/
/* TODO: Add a new parameter to this new method that tells the number of boxes inside the board
    from main I call:
    buildBoard(4, 11);
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
    XXXX    XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
        XXXX    XXXX    XXXX    XXXX    XXXX
*/