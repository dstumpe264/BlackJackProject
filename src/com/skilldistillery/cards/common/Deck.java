package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck;
	
	public Deck() {
		deck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}

	public boolean shuffleDeck() {
		Collections.shuffle(deck);
		return true;
	}
	
	
	@Override
	public String toString() {
		for(int i=0; i < 52; i++) {
			System.out.println(""+(i+1)+" "+deck.get(i)+deck.get(i).getRank().getValue());
		}
		return "";
		
		
	}

	
}