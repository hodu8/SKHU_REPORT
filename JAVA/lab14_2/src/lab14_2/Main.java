package lab14_2;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: 박찬우\n");
		Scanner scan = new Scanner(System.in);

		int x, y, result;
		try {
		System.out.print("정수 x 입력: ");
		x = scan.nextInt();
		System.out.print("정수 y 입력: ");
		y = scan.nextInt();
		result = x / y;
		} catch (ArithmeticException e) {
			result = 0;
		}
		catch(InputMismatchException e) {
			result = 1;
		}
		System.out.println("result = " + result);
	}
}