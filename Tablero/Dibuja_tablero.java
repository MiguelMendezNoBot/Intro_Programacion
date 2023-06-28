package Tablero;

public class Dibuja_tablero{
    public static void main(String [] args){
        for(int i=0; i<7; i++){
            for(int k=0; k<3; k++){   
                if(i%2==0){
                    System.out.print("   ");
                    for(int j=0; j<4; j++){
                    System.out.print("   ");
                    System.out.print("XXX");
                    }
                }else{
                    for(int j=0; j<4; j++){
                    System.out.print("   ");
                    System.out.print("XXX");
                    }
                }
                System.out.println();
            }
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