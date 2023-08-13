public class Main
{
    public static void main(String [] args){
        Serie[] listOfSeries = new Serie[5];
        VideoJuego[] listOfGames = new VideoJuego[5];
        
        listOfSeries[0]=new Serie();
        listOfSeries[1]=new Serie("Juego de tronos", "George R. R. Martin ");
        listOfSeries[2]=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        listOfSeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
        listOfSeries[4]=new Serie("Breaking Bad", 59, "Thriller", "Vince Gilligan");
  
        listOfGames[0]=new VideoJuego();
        listOfGames[1]=new VideoJuego("Assasin creed 2", 30, "Aventura", "EA");
        listOfGames[2]=new VideoJuego("God of war 3", 450);
        listOfGames[3]=new VideoJuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        listOfGames[4]=new VideoJuego("Final fantasy X", 200, "Rol", "Square Enix");
        
        System.out.println("Lista de series: ");
        for(Serie s : listOfSeries){
            System.out.println(s);
        }
        System.out.println("Lista de video juegos: ");
        for(VideoJuego v : listOfGames){
            System.out.println(v);
        }
        
        System.out.println("-----------------------");
        
        listOfSeries[1].deliver();
        listOfSeries[4].deliver();
        listOfGames[0].deliver();
        listOfGames[3].deliver();
        listOfGames[4].deliver();
        
        int seriesDelivered = 0;
        int gamesDelivered = 0;
        
        for(Serie s : listOfSeries){
            if(s.isDelivered()){
                seriesDelivered ++;
            }
        }
        for(VideoJuego v : listOfGames){
            if(v.isDelivered()){
                gamesDelivered ++;
            }
        }
        
        System.out.println("Series entregadas: " + seriesDelivered);
        System.out.println("Juegos entregados: " + gamesDelivered);
        
        Serie serieMoreSeasons = listOfSeries[0];
        VideoJuego gameMoreHours = listOfGames[0];
        
        for(int i = 0; i < listOfSeries.length - 1; i++){
            if(listOfSeries[i + 1].compare(serieMoreSeasons)){
                serieMoreSeasons = listOfSeries[i + 1];
            }
        }
        for(int i = 0; i < listOfGames.length - 1; i++){
            if(listOfGames[i + 1].compare(gameMoreHours)){
                gameMoreHours = listOfGames[i + 1];
            }
        }
        
        System.out.println("-----------------------");
        
        System.out.println("Serie con mas temporadas: " + serieMoreSeasons);
        System.out.println("Juego con mas horas estimadas: " + gameMoreHours);
    }
}
