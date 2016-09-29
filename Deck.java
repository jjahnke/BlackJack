
/**
 * Simulates a Deck of Cards
 * 
 * @author Jonathan Jahnke 
 * @version September 25, 2016
 */
public class Deck
{
    private static Card[] deck;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        int count=0;
        deck = new Card[52];
         for (int s=1; s<=4; s++) {
            for (int n=1; n<=13; n++) {
                deck[count] = new Card(s,n);
                count++;
            }
        } 
    }
     
    public void shuffle() {
        for (int x=0; x<52; x++) {
            int k = (int)(Math.random()*52);
            Card temp = deck[k];
            deck[k] = deck[x];
            deck[x] = temp;
        }
    }

    public Card getCard(int x) {
        return deck[x];
    }
    
    public void print() {
        for (int j=0; j<52; j++) {
            System.out.print(deck[j] + "\t");
            if ((j+1)%4==0)
                System.out.println();
        }  
    }
    
        public void print2() {
        for (Card c : deck) {
            System.out.println(c);
        }  
    }
}
