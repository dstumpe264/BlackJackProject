package com.skilldistillery.cards.blackjack;

public class Player {
	String name = new String();
	Hand hand = new Hand();
	
	//a player has a hand, the dealer deals the card and gives a card to the player the player 
	//gets a card from the dealer. dealer has method deal cards, which invokes the players method 
	//to get card which both dealer and player shares
	
	//first off lets make a constructor or two and some getters and setters or whatever
	public Player() {
	}

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
	}
	

	//my question is how do i transfer it, what do i call the dealers method on? the dealer 
	// isnt going to have the players hand i cant call it on that. 
	
//	public void displayHand(Hand hand) {
//		boolean hasCards = false;
//		if(hand != null) {
//			hasCards = true;
//		}
//		System.out.println(hand.displayHand());
//		
//	}
	
	
	//how to add to the players hand??

}
