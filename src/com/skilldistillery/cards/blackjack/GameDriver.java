package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class GameDriver {
	
	
	/*User Story 2;
	 * Add methods and fields to your classes that mimic the 
	 * functionality of shuffling and dealing a deck of cards. 
	 * Remember that when a card is dealt you have to remove 
	 * it from the current deck! You should be able to print 
	 * out a shuffled deck to the terminal.*/

	public static void main(String[] args) {
		//When the game starts it creates both players and a deck of cards.
		Deck deck = new Deck();
		GameDriver game = new GameDriver();
		Player playerOne = new Player();
		Dealer dealer = new Dealer();
		//from there the deck gets shuffled and the dealer deals out the cards.
//		deck.getCards();
		deck.shuffleDeck();
		System.out.println(deck);
		Card topCard = dealer.dealCard(deck);
		playerOne.hand.addCard(topCard);
		System.out.println("Player's first card is: " + topCard);
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
//		System.out.println(dealer.hand.getHand());
		System.out.println("Dealer receives card");
//		System.out.println(deck);
		topCard = dealer.dealCard(deck);
		playerOne.hand.addCard(topCard);
		System.out.println("Player's second card is: " + topCard);
		System.out.println("Player's has: " + playerOne.hand.getHand());
		System.out.println("");
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
		System.out.println("Dealer has: " + topCard);
		System.out.println("Dealer has: " + dealer.hand.getHand());
		System.out.println(deck);
		
		
		
	}

}
