public class Dibuja_tablero{
    public static void main(String [] args){
        System.out.println("123   123");
        System.out.println("   123   ");
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

