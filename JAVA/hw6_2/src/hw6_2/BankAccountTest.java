package hw6_2;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BankAccount account1 = new BankAccount(1, "kim", 9000);
		BankAccount account2 = new BankAccount(2, "lee");
		// �������1, �������2 ����
		System.out.println("hw6_2 : ������");
		System.out.print("\n�Ա��� �ݾ��� �Է��ϼ��� : ");
		account2.deposit(input.nextInt());
		System.out.print("����� �ݾ��� �Է��ϼ��� : ");
		account2.withdraw(input.nextInt());
		// ����ڷκ��� �Աݾ�, ��ݾ��� �Է¹޾� account2�� �Ա�, ���
		System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
		account2.deposit(input.nextInt());
		System.out.print("����� �ݾ��� �Է��ϼ��� : ");
		account2.withdraw(input.nextInt());
		// ����ڷκ��� �Աݾ�, ��ݾ��� �Է¹޾� account2�� �Ա�, ���
		System.out.print("�۱��� �ݾ��� �Է��ϼ��� : ");
		account2.sendMoney(account1, input.nextInt());
		System.out.print("�۱��� �ݾ��� �Է��ϼ��� : ");
		account2.sendMoney(account1, input.nextInt());
		// ����ڷκ��� �۱ݾ��� �Է¹޾� account2���� account1�� �۱��ϵ��� 2�� ����
		account2.setAccountName("park");
		// account2�� �����ָ��� park���� ����
		System.out.println("\naccount2�� ���¹�ȣ : " + account2.getAccountNumber() + " / �����ָ� : " + account2.getAccountName() + " / �ܾ� : " + account2.getBalance());
		System.out.println("account1�� ���¹�ȣ : " + account1.getAccountNumber() + " / �����ָ� : " + account1.getAccountName() + " / �ܾ� : " + account1.getBalance());
		// account2, account1�� ���¹�ȣ, �����ָ�, �ܾ� ���
	}
}