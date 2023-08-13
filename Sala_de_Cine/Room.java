public class Room {
    private int price;
    private Movie movie;
    private Seat[][] seats = new Seat[8][9];
    private Viewer[] viewers;
    private static ObjectRadom ob = new ObjectRadom();

    public Room() {
        this.price = ob.randInt(45, 15);
        this.movie = new Movie(ob.randMovie(), ob.randInt(210, 75), 
            ob.randInt(18,10), ob.randDirector());
        createRoom();
    }

    public void createRoom() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                seats[i][j] = new Seat(8 - i, (char) ('A' + j));
            }
        }
    }

    public void showSeats() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(seats[i][j]);
            }
            System.out.println();
        }
    }

    public void createVierwers(){
        //Modificar los parametros en "ob.randInt[int , int]" para forzar a llenar
        //todos los asientos. Recomendacion: ob.randInt(400, 390)
        viewers = new Viewer[ob.randInt(100, 30)];
        for(int i = 0; i < viewers.length; i++){
            viewers[i] = new Viewer(ob.randName(), ob.randInt(45, 7), ob.randInt(50, 10));
        }
    }
    
    public void start(){
        System.out.println("Asientos antes de acomodar a todos:");
        showSeats();
        createVierwers();
        System.out.println("Lista de espectadores: ");
        System.out.println("Longitud de lista de espectadores: " + viewers.length);
        for(int i = 0; i < viewers.length; i++){
            System.out.println();
            System.out.print("Turno de: ");
            System.out.println(viewers[i]);
            int col = ob.randInt(8, 0);
            int row = ob.randInt(7, 0);
            System.out.println("Asiento escogido: " + seats[row][col]);
            if(!seats[row][col].getBusy()){
                System.out.println("Comprobando dinero y edad...");
                if(checkMoney(i) && checkAge(i)){
                    fillSeat(row, col);
                    System.out.println("Espectador acomodado!!!");
                }else{
                    System.out.println("Siguiente espectador...");
                }
            }else if(checkMoney(i) && checkAge(i)){
                System.out.println("Buscando asiento...");
                if(searchSeat()){
                    System.out.println("Espectador acomodado!!!");
                }else{
                    System.out.println("Ya no existen asientos diponibles, sentimos las molestias...");
                    break;
                }
            }else{
                System.out.println("Siguiente espectador...");
            }
        }
        System.out.println("Asientos despues de acomodar a todos:");
        showSeats();
    }

    public void fillSeat(int row, int col){
        seats[row][col].setBusy(true);
    }

    public boolean checkMoney(int pos){
        return (price <= viewers[pos].getMoney()) ? true : false;
    }

    public boolean checkAge(int pos){
        return (movie.getMinimunAge() <= viewers[pos].getAge()) ? true : false;
    }
    
    public boolean searchSeat(){
        boolean bb = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if(!seats[i][j].getBusy()){
                    bb = true;
                    seats[i][j].setBusy(true);
                    i = 8;
                    j = 9;
                }
            }
        }
        return bb;
    }
    
    @Override
    public String toString(){
        return "Sala de cine{Precio:" + price + ", " + movie + "}";
    }
}
