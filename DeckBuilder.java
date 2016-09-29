
/**
 * An ArrayList that represent a Deck of CardsDeck.
 * 
 * @author Jonathan Jahnke 
 * @version September 29, 2016
 */

// making changes on github online

import java.util.List;
import java.util.ArrayList;

public class DeckBuilder
{
    private static List deck;  //or ArrayList<Card>
    
    /**
     * Constructor for DeckBuilder. Creates an
     * ArrayList of 52 elements.
     */
    public DeckBuilder() { 
        deck = new ArrayList(52);  //default 10
    }
    
     /**
     * Constructor for DeckBuilder that sets
     * beginning size of the deck.
     */
    public DeckBuilder(int sizeOfDeck) { 
        deck = new ArrayList(sizeOfDeck);
    }
     
    /** 
     * randomally shuffles the deck of cards
     */
    public void shuffle() {
        
    }

     /**
     * A method that gets a specific card of the ArrayList
     * 
     * @param  x   the element of the ArrayList that you want to get
     * @return     Card 
     */
    public Card getCard(int x) {
        Card c = new Card();
        return c;
    }
    
    /** 
     *prints out all cards in the deck
     */
    public void print() {  
        
    }
}
