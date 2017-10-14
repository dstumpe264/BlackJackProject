package com.skilldistillery.cards.blackjack;

public class Player {
	String name = new String();
	Hand hand = new Hand();
	
	//first off lets make a constructor or two and some getters and setters or whatever
	public Player() {
	}
	
	

	public Player(String name, Hand hand) {
		this.name = name;
		this.hand = hand;
	}
	
	public boolean displayHand() {
		boolean hasCards = false;
		hand.addCard();
		if(hand.toString(0) != null) {
			hasCards = true;
			
		}
		System.out.println(hand);
		return hasCards;
		
	}
	
	
	//how to add to the players hand??

}
