/*
 * ���� : ���������� Ŭ������ �����ϰ� �̿��ϴ� ���α׷�
 * �ۼ��� : ������
 * �ۼ��� : 2018.05.08.
 */
package mid1_1;

public class Main {

	public static void main(String[] args) {
		System.out.println("mid1_1 : ������\n");
		// 500�� 1��, 100�� 1���� ���� ������������ ����
		PiggyBank bank = new PiggyBank(1, 1);

		// ���������뿡 ������ ����
		bank.add(2, 10);
		bank.add(0, 1);
		bank.add(0, 1);

		// ������������ ���� ���ݾ��� ���
		System.out.println(bank.open()); // 2800

		// ���������뿡 ������ ����
		bank.add(1, 1);

		// ������������ ���� ���ݾ��� ���
		System.out.println(bank.open()); // 600
	}
}