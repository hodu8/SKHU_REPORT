/*
 * �ۼ��� : ������
 * �ۼ��� : 2018.04.10.
 * ���� : �ڷ������� ��Ÿ���� Television Ŭ������ �����ϰ�, Television �迭�� �̿��ϴ� ���α׷�
 */
package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		Television [] tv = new Television[3]; // ũ�Ⱑ 3�� �ڷ����� �迭�� ����
		for (int i=0; i<3; i++) {
			tv[i] = new Television();
		} // �ݺ����� �̿��Ͽ� �ڷ����� �迭�� 3���� �ڷ������� �����Ͽ� ����
		tv[0].channel = 7;
		tv[1].channel = 7;
		tv[2].channel = 11;
		// �ڷ����� ä���� ���� 7, 7, 11�� ����
		for (int j=0; j<3; j++) {
			System.out.println(tv[j].channel);
		} // �ݺ����� �̿��Ͽ� �迭�� ����� ��� �ڷ������� ä���� ���
	}
}