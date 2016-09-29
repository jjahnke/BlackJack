
/**
 * Similation of the classic card game BlackJack
 * 
 * @author Jonathan Jahnke
 * @version September 25, 2016
 */
public class TestCardDeck
{
    
    public static void main(String args[])
    {
        Deck myDeck = new Deck();
        myDeck.shuffle();
        myDeck.print();
        System.out.println("\n* * * * * * * *\n");
        
        Card c1 = myDeck.getCard(0);
        Card c2 = myDeck.getCard(1);
        System.out.println("Card One: "+c1+" has a value of "+c1.getValue());
        System.out.println("Card Two: "+c2+" has a value of "+c2.getValue());
        
        for (int x=2; x<17; x++) {
            Card c = myDeck.getCard(x);
            System.out.println(c+", Value: "+c.getValue());
        }
        
        Card myAce = new Card(Card.SPADES, Card.ACE);
        System.out.println(myAce+", Value: "+myAce.getValue());
        myAce.makeAceLow();
        System.out.println(myAce+", Value: "+myAce.getValue());

    }
}
