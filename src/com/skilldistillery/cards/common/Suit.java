package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS('\u2665'), SPADES('\u2660'), CLUBS('\u2663'), DIAMONDS('\u2666');

	private char c;

	Suit(char c) {
		this.c = c;
	}

	public char getChar() {
		return c;
	}
	
	
}
