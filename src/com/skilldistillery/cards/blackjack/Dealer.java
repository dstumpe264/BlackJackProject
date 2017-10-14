package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {
	List<Card> temp;
	Hand dealersHand = new Hand();
	Deck deck;
	
	//dealer has a method to deal cards
	// first to the player face up, player will display cards face up
	// second to the dealer first card face down
	//the player will get a second card also face up done in the player
	// the dealer will get a second card face up, also displayed from the dealer class

	//how to seperate this out so that it's in the game driver.
	public void dealCards(Hand hand) {
		temp = deck.getCards();
		Card topCard = temp.remove(0);
		hand.addCard(topCard);
		
		
		
	}
}
