package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	Deck deck;
	
	//dealer has a method to deal cards
	// first to the player face up, player will display cards face up
	// second to the dealer first card face down
	//the player will get a second card also face up done in the player
	// the dealer will get a second card face up, also displayed from the dealer class

	//how to seperate this out so that it's in the game driver.
	public Card dealCard(Deck deck) {
		Card topCard = deck.remove(0);
		return topCard;
		
		
		
	}
}
