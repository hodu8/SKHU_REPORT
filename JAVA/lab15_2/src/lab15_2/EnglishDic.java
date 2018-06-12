package lab15_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		System.out.println("lab15_2 : 박찬우\n");
		Map<String, Integer> si = new HashMap<String, Integer>();

		si.put("kim", 90);
		si.put("park", 80);
		si.put("lee", 100);

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("이름 입력 : ");
			String key = sc.next();
			if( key.equals("quit") ) {
				System.out.println("\n" + si);
				break;
			}
			System.out.println("성적 =  " + si.get(key) + "\n");
		} while(true);
	}
}