
/**
 * A deck of Cards
 * 
 * @author Jonathan Jahnke
 * @version September 25, 2016
 */
public class Card
{
    //named constants
    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    public final static int SPADES = 4;
    // instance variables 
    private String suit;
    private int numCard; 
    private int value;
    private boolean dealt;  //not using

     /**
     * Constructor for Card class. Makes a ramdom card
     * and assigns the suit, type, and face value of the card.
     */
    public Card()
    {
        suit = makeSuit();
        numCard = (int) (Math.random() * 13 + 1);
        value = makeValue();
        dealt = false;
    }
    
     /**
     * Constructor for the Card class that make a specific card.
     * @param s     An interger that represents the suit of card 1-4
     * @param n     An interger that represents the type of card 1-13
     */
    public Card(int s, int n) {
        suit = makeSuit(s);
        numCard = n;
        value = makeValue();
        dealt = false;
    }
    
    public String makeSuit(int n) {
        String s;
        switch (n) {
            case HEARTS: s = "Hearts";
                    break;
            case DIAMONDS: s = "Diamonds";
                    break;
            case CLUBS: s = "Clubs";
                    break;
            case SPADES: s = "Spades";
                    break;
            default: s = "Joker";
                    break;
        }
        return s;
    }
    public String makeSuit() {
        int x = (int) (Math.random() * 4 + 1);
        return makeSuit(x);
    }
    
    private int makeValue() {
        int v;
        if (numCard == 1)  
            v = 11;
        else if (numCard==11 || numCard==12 | numCard==13)
            v = 10;
        else
            v = numCard;
        return v;
    }
    
    public void makeAceLow() {
        if (numCard==Card.ACE) {
            value=1;
        }
    }
    
    public void makeAceHigh() {
        if (numCard==Card.ACE) {
            value=11;
        }
    }
    
    public int getnumCard() {
        return numCard;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int v) {
        value = v;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String s) {
        suit = s;
    }
    public boolean isDealt() {
        return dealt;
    }
    public void setDealt(boolean d) {
        dealt = d;
    }
    
    public String toString(){
        String s;
        if (numCard == 1)  
            s = "A";
        else if (numCard == 11)
            s = "J";
        else if (numCard == 12)
            s = "Q";
        else if (numCard == 13)
            s = "K";
        else
            s = numCard + "";
        return s + " of " + suit;
    }       
}
