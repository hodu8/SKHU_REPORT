/*
 * (1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���
(2) s1�� ���� ���
(3) s1�� ù��° ���� ���
(4) s1�� �ι�°~�׹�° �κй��ڿ�(��, ���� 3��) ���
(5) s1�� �빮�ڷ� ������ ��� ��� - ����: s1�� ����Ǹ� �ȵ�
(6) s1�� s2�� �������� ���� ���
(7) s1�� s2�� ��ҹ��� ���� ���ָ� �������� ���� ���
(8) s1�� s2�� ���������� ���� ��� ���(����, 0, ���)
 */
package lab5_5;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("lab5_5: ������");

		// (1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���
		Scanner input = new Scanner(System.in);
		System.out.print("���̰� 5 �̻��� ���ڿ� s1 �Է�:");
		String s1 = input.nextLine();
		System.out.print("���̰� 5 �̻��� ���ڿ� s2 �Է�:");
		String s2 = input.nextLine();

		// (2) S1�� ���� ���
		System.out.println(s1.length());
		// (3) s1�� ù��° ���� ���
		System.out.println(s1.charAt(0));
		// (4) s1�� �ι���~�׹�° �κй��ڿ�(��, ���� 3��) ���
		System.out.println(s1.substring(1,4));
		// (5) s1�� �빮�ڷ� ������ ��� ���
		System.out.println(s1.toUpperCase());
		// (6) s1�� s2�� �������� ���� ���
		System.out.println(s1.equals(s2));
		// (7) s1�� s2�� ��ҹ��� ���� ���ָ� �������� ���� ���
		System.out.println(s1.equalsIgnoreCase(s2));
		// (8) s1�� s2�� ���������� ���� ��� ���(����, 0, ���)
		System.out.println(s1.compareTo(s2));
	}

}