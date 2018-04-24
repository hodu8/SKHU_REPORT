package hw6_2;
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BankAccount account1 = new BankAccount(1, "kim", 9000);
		BankAccount account2 = new BankAccount(2, "lee");
		// 은행계좌1, 은행계좌2 생성
		System.out.println("hw6_2 : 박찬우");
		System.out.print("\n입금할 금액을 입력하세요 : ");
		account2.deposit(input.nextInt());
		System.out.print("출금할 금액을 입력하세요 : ");
		account2.withdraw(input.nextInt());
		// 사용자로부터 입금액, 출금액을 입력받아 account2에 입금, 출금
		System.out.print("입금할 금액을 입력하세요 : ");
		account2.deposit(input.nextInt());
		System.out.print("출금할 금액을 입력하세요 : ");
		account2.withdraw(input.nextInt());
		// 사용자로부터 입금액, 출금액을 입력받아 account2에 입금, 출금
		System.out.print("송금할 금액을 입력하세요 : ");
		account2.sendMoney(account1, input.nextInt());
		System.out.print("송금할 금액을 입력하세요 : ");
		account2.sendMoney(account1, input.nextInt());
		// 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 2번 지시
		account2.setAccountName("park");
		// account2의 예금주명을 park으로 수정
		System.out.println("\naccount2의 계좌번호 : " + account2.getAccountNumber() + " / 예금주명 : " + account2.getAccountName() + " / 잔액 : " + account2.getBalance());
		System.out.println("account1의 계좌번호 : " + account1.getAccountNumber() + " / 예금주명 : " + account1.getAccountName() + " / 잔액 : " + account1.getBalance());
		// account2, account1의 계좌번호, 예금주명, 잔액 출력
	}
}
