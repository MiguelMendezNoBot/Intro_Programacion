public class Card
{
    private static int index = 0;
    private int number = 0;
    private String suit;
    private static final String[] suits = {"Espada","Basto","Oro","Copa"};

    public Card(int number){
        this.number = number;
        if(number < 12){
            this.suit = suits[index];
        }else{
            this.suit = suits[index];
            index++;
        }
    }
    
    
    @Override
    public String toString(){
        return "Carta{Numero:" + number + ", Palo:" + suit + "}";
    }
}
