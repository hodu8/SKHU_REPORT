public class Exam05 {
	
	public static void doSomething(int i) {
		// 구현할 부분
		String s = String.format("%05d", i);
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		int[] a = { 2, 34, 256, 1980 };
		for (int i : a) doSomething(i);
	}
}