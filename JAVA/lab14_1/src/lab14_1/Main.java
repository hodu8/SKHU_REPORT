package lab14_1;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: ������");

		PrintWriter out = new PrintWriter("outfile.txt");
		for (int i = 0; i < 10; i++)
			out.println(i);
		out.close();
	}