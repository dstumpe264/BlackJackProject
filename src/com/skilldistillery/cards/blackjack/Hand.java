package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Hand implements List<Card>{
	List<Card> hand;
	List<Card> temp;
	Deck deck;


	public Hand() {
		hand = new ArrayList<>();
	}
	
	
	public boolean displayHand() {
		this.hand.get(0);
		return true;
	}

	public void addCard(Card topCard) {
		hand.add(topCard);
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean add(Card e) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean addAll(int index, Collection<? extends Card> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Card get(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Card set(int index, Card element) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int index, Card element) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Card remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ListIterator<Card> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ListIterator<Card> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Card> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}

//i need to deal cards. figure out a way to give the cards out in order. 
// first to player to one than to the dealer. 