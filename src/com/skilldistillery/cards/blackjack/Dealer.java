package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	Deck temp;
	Deck deck;
	
	//dealer has a method to deal cards
	// first to the player face up, player will display cards face up
	// second to the dealer first card face down
	//the player will get a second card also face up done in the player
	// the dealer will get a second card face up, also displayed from the dealer class

	//how to seperate this out so that it's in the game driver.
	public void dealCards(Hand hand, Hand hand2) {
		deck = new Deck();
		deck.getCards();
		Card topCard = deck.remove(0);
		hand.addCard(topCard);
		topCard = deck.remove(0);
		hand2.addCard(topCard);
		
		
		
	}
}
