package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.*;

public class GameDriver {
	
	
	/*User Story 2;
	 * Add methods and fields to your classes that mimic the 
	 * functionality of shuffling and dealing a deck of cards. 
	 * Remember that when a card is dealt you have to remove 
	 * it from the current deck! You should be able to print 
	 * out a shuffled deck to the terminal.*/

	public static void main(String[] args) {
		//When the game starts it creates a both players and a deck of cards.
		Deck deck = new Deck();
		GameDriver game = new GameDriver();
		Player playerOne = new Player();
		Dealer dealer = new Dealer();
		//from there the deck gets shuffled and the dealer deals out the cards.
		deck.getCards();
		deck.shuffleDeck();
		dealer.dealCards(playerOne.hand, dealer.hand);
		playerOne.getCard();
		dealer.getCard();
		System.out.println(playerOne.hand.get(0));
//		playerOne.displayHand(playerOne.hand.get(0));
		dealer.displayHand(dealer.hand);
		
	}

}
