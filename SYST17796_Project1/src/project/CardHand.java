/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Chhogyal
 */
public class CardHand {
    private int hsize = 52;
    Card[] cards = new Card[hsize];
    
    public void generateHand(){
        int count = 0;
        for(Card.Suit s: Card.Suit.values()){
            //inner loop for values
            for(Card.Value v : Card.Value.values()){
                cards[count] = new Card(s,v);
                count++;
            }
        }
    }
    
}
