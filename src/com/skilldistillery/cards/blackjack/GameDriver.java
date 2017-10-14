package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class GameDriver {
	Deck deck;
	Player player;
	Dealer dealer;
	Card topCard;
	/*User Story 2;
	 * Add methods and fields to your classes that mimic the 
	 * functionality of shuffling and dealing a deck of cards. 
	 * Remember that when a card is dealt you have to remove 
	 * it from the current deck! You should be able to print 
	 * out a shuffled deck to the terminal.*/

	public static void main(String[] args) {
		GameDriver game = new GameDriver();
		game.beginGame();
		game.stageOne();
	}
	
	void beginGame() {
		//When the game starts it creates both players and a deck of cards.
		deck = new Deck();
		player = new Player();
		dealer = new Dealer();
		System.out.println(deck);
		deck.shuffleDeck();
		System.out.println("The deck has been shuffled");
	}
	void stageOne() {
		//this can be simplified into smaller methods // however at this time it's something i will come back to
		topCard = dealer.dealCard(deck);
		player.hand.addCard(topCard);
		System.out.println("Player's first card is: " + topCard);
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
		System.out.println("Dealer receives card");
		topCard = dealer.dealCard(deck);
		player.hand.addCard(topCard);
		System.out.println("Player's second card is: " + topCard);
		System.out.println("Player's has: " + player.hand.getHand());
		System.out.println("");
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
		System.out.println("Dealer has: " + topCard);
		System.out.println("Dealer has: " + dealer.hand.getHand()); // here to make sure game logic is correct delete at release
	}
	void nextMove() {
		
	}

}
