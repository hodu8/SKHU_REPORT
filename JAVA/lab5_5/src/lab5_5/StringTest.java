/*
 * (1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
(2) s1의 길이 출력
(3) s1의 첫번째 문자 출력
(4) s1의 두번째~네번째 부분문자열(즉, 문자 3개) 출력
(5) s1을 대문자로 변경한 결과 출력 - 주의: s1은 변경되면 안됨
(6) s1과 s2가 동일한지 여부 출력
(7) s1과 s2가 대소문자 구분 없애면 동일한지 여부 출력
(8) s1과 s2를 사전적으로 비교한 결과 출력(음수, 0, 양수)
 */
package lab5_5;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("lab5_5: 박찬우");

		// (1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
		Scanner input = new Scanner(System.in);
		System.out.print("길이가 5 이상인 문자열 s1 입력:");
		String s1 = input.nextLine();
		System.out.print("길이가 5 이상인 문자열 s2 입력:");
		String s2 = input.nextLine();

		// (2) S1의 길이 출력
		System.out.println(s1.length());
		// (3) s1의 첫번째 문자 출력
		System.out.println(s1.charAt(0));
		// (4) s1의 두번쩨~네번째 부분문자열(즉, 문자 3개) 출력
		System.out.println(s1.substring(1,4));
		// (5) s1을 대문자로 변경한 결과 출력
		System.out.println(s1.toUpperCase());
		// (6) s1과 s2가 동일한지 여부 출력
		System.out.println(s1.equals(s2));
		// (7) s1과 s2가 대소문자 구분 없애면 동일한지 여부 출력
		System.out.println(s1.equalsIgnoreCase(s2));
		// (8) s1과 s2를 사전적으로 비교한 결과 출력(음수, 0, 양수)
		System.out.println(s1.compareTo(s2));
	}
}
