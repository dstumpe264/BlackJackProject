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
	
	public String toString(int index) {
		return hand.get(index).toString();
		
	}
	
	public boolean displayHand() {
		this.hand.toString();
		return true;
	}

	public void addCard() {
		temp = new ArrayList<>();
		temp = deck.getCards();
		Card c = temp.remove(0);
		hand.add(c);
	}
}

//i need to deal cards. figure out a way to give the cards out in order. 
// first to player to one than to the dealer. 