import java.util.ArrayList;
public class Deck
{
    private ArrayList<Card> deck = new ArrayList<>();
    private int next = 0;
    private ArrayList<Card> listCardsTaken = new ArrayList<>();

    public Deck(){
        buildDeck();
    }

    public void buildDeck(){
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 13; j++){
                if (j == 8 || j == 9) {
                    j++;
                } else {
                    deck.add(new Card(j));
                }
            }
        }
    }

    public void shuffle(int times){
        Card aux;
        for(int i =0; i < times; i++){
            int pos = (int)(Math.random() * (39 - 0 + 1)) + 0;
            int pos2 = (int)(Math.random() * (39 - 0 + 1)) + 0;
            aux = deck.get(pos);
            deck.set(pos, deck.get(pos2));
            deck.set(pos2, aux);
        }
    }

    public Card nextCard(){
        Card c = null;
        if(0 < deck.size()){
            c = deck.get(0);
            listCardsTaken.add(c);
            deck.remove(0);
        }else{
            System.out.println("Ya no hay cartas para sacar");
        }
        return c;
    }

    public void cardsAvailable(){
        System.out.println("Quedan " + (deck.size()) + " cartas");
    }

    public Card[] giveCards(int amount){
        Card[] cards = new Card[amount];
        for(int i = 0; i < amount; i++){
            cards[i] = deck.get(0);
            listCardsTaken.add(deck.get(0));
            deck.remove(0);
        }
        return cards;
    }

    public void cardsTaken(){
        if(listCardsTaken.size() == 0){
            System.out.println("No existen cartas tomadas");
        }else{
            System.out.println("Las cartas ya tomadas son:");
            for(int i = 0; i < listCardsTaken.size(); i++){
                System.out.println(listCardsTaken.get(i));
            }
        }
    }

    public void showDeck(){
        if(deck.size() > 0){
            for(/*Card c: deck*/ int i = 0; i < 10; i++){
            //System.out.println(c);
            System.out.println(deck.get(i));
        }
        }else{
            System.out.println("Ya no hay cartas en la baraja");
        }
        System.out.println();
    }
}
