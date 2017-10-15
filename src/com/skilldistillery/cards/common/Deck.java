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

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	@Override
	public String toString() {
		for (int i = 0; i < deck.size(); i++) {
			int x = deck.get(i).getRank().getValue();
			char c = deck.get(i).getSuit().getChar();
			System.out.println("" + (i + 1) + " " + deck.get(i) + " " + x);
		}
		return "";
	}

	public Card remove(int i) {
		return deck.remove(0);
	}
}