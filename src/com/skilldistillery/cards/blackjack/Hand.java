package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Hand {
	List<Card> hand;
	List<Card> temp;
	Deck deck;

	public Hand() {
		hand = new ArrayList<>();
	}

	public void displayHand() {
		this.hand.get(0);

	}

	public void addCard(Card topCard) {
		this.hand.add(topCard);
	}

	// public void getCard(Card card) {
	// this.hand.add(card);
	// }

	public List<Card> getHand() {
		return hand;
	}
	
	@Override
	public String toString() {
		return null;
		
	}

}

// i need to deal cards. figure out a way to give the cards out in order.
// first to player to one than to the dealer.