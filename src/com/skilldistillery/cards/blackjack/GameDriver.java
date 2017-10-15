package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class GameDriver {
	Deck deck;
	Player player;
	Dealer dealer;
	Card topCard;
	Scanner sc;
	int playersTotal;
	int dealersTotal;
	/*
	 * User Story 2; Add methods and fields to your classes that mimic the
	 * functionality of shuffling and dealing a deck of cards. Remember that when a
	 * card is dealt you have to remove it from the current deck! You should be able
	 * to print out a shuffled deck to the terminal.
	 */

	public static void main(String[] args) {

		GameDriver game = new GameDriver();
		game.beginGame();
		game.stageOne();
		game.nextMove();
		game.dealersTurn();
	}

	void beginGame() {
		sc = new Scanner(System.in);
		// When the game starts it creates both players and a deck of cards.
		deck = new Deck();
		player = new Player();
		dealer = new Dealer();
		// System.out.println(deck);
		deck.shuffleDeck();
		System.out.println("The deck has been shuffled.\n");
	}

	void stageOne() {
		// this can be simplified into smaller methods // however at this time it's
		// something i will come back to
		playersTotal = 0;
		dealersTotal = 0;
		topCard = dealer.dealCard(deck);
		player.hand.addCard(topCard);
		System.out.println("Player's first card is: " + topCard);
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
		System.out.println("\nDealer receives card");
		topCard = dealer.dealCard(deck);
		player.hand.addCard(topCard);
		System.out.println("\nPlayer's second card is: " + topCard);
		displayHand(player);
		for (int i = 0; i < player.hand.getHand().size(); i++) {
			playersTotal += player.hand.getHand().get(i).getRank().getValue();
		}
		System.out.println("Total value: " + playersTotal);
		if (playersTotal == 21) {
			System.out.println("*******BLACKJACK*******");
			System.out.println("Congrats you won this round");
			System.exit(0);
		}
		System.out.println("");
		topCard = dealer.dealCard(deck);
		dealer.hand.addCard(topCard);
		System.out.println("Dealer is showing a " + topCard);

	}

	// what comes next??
	/*
	 * Deal two hands of cards - one to a Dealer and another to a Player. Allow the
	 * players to Hit (add cards to their hand) or Stay (not add cards to their
	 * hand) in accordance to the rules of blackjack shown in the wiki. Do not worry
	 * about the multiple values for Ace until your basic game logic is working.
	 * Assume they are either 1 or 11 to start.
	 */
	void nextMove() {
		String input = " ";
		char c = 'x';
		// Allow player to hit or stay
		do {
			System.out.println("Would you like to (H)it or (S)tay?");
			input = sc.next();
			if ((input.equals("S")) || (input.equals("s")) || (input.equals("H")) || (input.equals("h"))) {
				c = input.charAt(0);
			} else {
				System.out.println("You have not entered a proper input");
			}

			if (c == 'H' || c == 'h') {
				topCard = dealer.dealCard(deck);
				player.hand.addCard(topCard);
				int total = 0;
				System.out.println("You got a " + topCard);
				displayHand(player);
				for (int i = 0; i < player.hand.getHand().size(); i++) {
					total += player.hand.getHand().get(i).getRank().getValue();
					if (total > 21) {
						System.out.println(total);
						System.out.println("You bust!!!!");
						System.exit(0);
					}
				}
				playersTotal = total;
				System.out.println(total);
			}
		} while (c == 'h' || c == 'H');
		displayHand(player);
		System.out.println("\nDealers turn.");
	}

	void dealersTurn() {
		displayHand(dealer);
		for (int i = 0; i < dealer.hand.getHand().size(); i++) {
			dealersTotal += dealer.hand.getHand().get(i).getRank().getValue();
		}
		System.out.println("Total value: " + dealersTotal);
		do {
		if (dealersTotal < 17) {
			dealersTotal = 0;
			System.out.println("The dealer hits.\n");
			topCard = dealer.dealCard(deck);
			dealer.hand.addCard(topCard);
			System.out.println("Dealer got a " + topCard);
			for (int i = 0; i < dealer.hand.getHand().size(); i++) {
				dealersTotal += dealer.hand.getHand().get(i).getRank().getValue();
			}
			System.out.println("Total value: " + dealersTotal);
		} else if (dealersTotal > 21) {
			System.out.println("The dealer busts, You win!\n");
			System.exit(0);
		} else if (dealersTotal < playersTotal) {
			System.out.println("You win!");
			System.out.println(playersTotal + " > " + dealersTotal);
			System.exit(0);
		} else if (dealersTotal > playersTotal) {
			System.out.println("Dealer Wins!");
			System.out.println(playersTotal + " < " + dealersTotal);
			System.exit(0);
		} else {
			System.out.println("It's a draw!");
			System.exit(0);
		}
			
		}while (true);
	}
	
	void displayHand(Player whosHand) {
		if(whosHand == player) {
			System.out.println("========Player's Hand=========");
			System.out.println(whosHand.hand.getHand());
		}
		else {
			System.out.println("========Dealer's Hand=========");
			System.out.println(whosHand.hand.getHand());
		}
	}
}
