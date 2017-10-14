package com.skilldistillery.cards.blackjack;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class blackJackTests {

	@Before
	public void setUp() throws Exception {
		Deck deck = new Deck();
		deck.shuffleDeck();
		System.out.println(deck);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * first test, Create a class structure that mimics a deck of cards. Remember
	 * decks as well as a hand of cards are made up of cards. Feel free to create
	 * the structure in any way you see fit. hint We did a lab in Chapter 6 of this
	 * week that dealt with a deck of cards. Your card and deck implementations
	 * should NOT be coupled to Blackjack; you should be able to reuse them to
	 * implement a poker or bridge game application.
	 */
	@Test
	public void print52cards() {
		//The game needs a decks
		Deck deck = new Deck();
		deck.shuffleDeck();
		System.out.println(deck);
	}
	
//	@Test
//	public void cards_have_value() {
//		Dec
//		
//		assertTrue();
//	}
	
	@Test
	public void test_user_displayHand() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		dealer.dealCards();
		assertTrue(player.hand.displayHand());
		
	}

}
