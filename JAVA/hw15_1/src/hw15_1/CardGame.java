/*
 * ���� : ī�� ����
 * �ۼ��� : ������
 * �ۼ��� : 2018.06.12.
 */

package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�.

class Card {
	private int number; // ī�� ��ȣ

	public Card(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}

//ī�� 50���� �ٷ�� ���� ǥ���ϴ� Ŭ���� Deck
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// ī�带 �����Ͽ� ���� ����
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// ī�带 ����
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// ���� �� �� ī�带 �����Ͽ� ����
	public Card deal() {
		return deck.remove(0);
	}
}

//�ڽ��� ī�� ����Ʈ�� ���� �÷��̾� Ŭ���� Player
class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	// �ڽ��� ���� ī�� �� �ִ� ī�带 ����Ʈ���� �����ϰ� �����ϴ� �޼ҵ带 �ۼ��Ͻÿ�.
	public int removeMaxCard() {
		int max = 0; // �ִ��� ������ ������ ���� max ����
		int temp = 0; // �ִ��� �ε��� ���� ������ ���� temp ����
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i).toString()) > max) { // ���� list�� i��° ��Ұ� max���� ũ�ٸ�
				max = Integer.parseInt(list.get(i).toString()); // max�� list�� i���� ��� ������ ����
				temp = i; // temp ���� i�� ����
			}
		} list.remove(temp); // list�� temp��° ��� ���� ����
		return max; // �ִ��� ��ȯ
	}
}

public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1 : ������\n");
		Deck deck = new Deck(); // �� ��ü�� �ϳ� ����
		deck.shuffle(); // ���� ī�带 ����
		Player p1 = new Player();
		Player p2 = new Player();
		// �÷��̾�1, �÷��̾�2�� ����(p1, p2�̶�� �θ�)
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		p2.getCard(deck.deal());
		// p1�� p2���� �����ư��� 5�徿 ī�带 ������ ��
		System.out.println("p1�� p2�� ī�� ���");
		p1.showCards();
		p2.showCards();
		// p1, p2�� ī�� ����� ���
		System.out.println("\np1�� p2�� �ִ� ī��");
		int result1 = p1.removeMaxCard();
		int result2 = p2.removeMaxCard();
		// p1, p2�� �ִ� ī�带 �˾Ƴ��� �ִ� ī�带 ����
		// result1�� result2�� ���� ��� ���� ����
		System.out.println(result1);
		System.out.println(result2);
		System.out.println();
		System.out.print((result1>result2)?"p1":"p2");
		System.out.println(" �¸�!\n");
		// ���� �꿡 ���� ���ڰ� �������� ���
		System.out.println("p1�� p2�� ī�� ���");
		p1.showCards();
		p2.showCards();
		// p1, p2�� ī�� ����� ���
	}
}