/*
 * ���� : ��� Ŭ����
 * �ۼ��� : 2018.05.24.
 * �ۼ��� : ������
 */

package hw9_1;

public class Person implements Speakable{ // Speakable�� ����
	String name; // �̸� �ʵ�
	public Person(String name) {
		this.name = name;
	} // �̸��� �Ű������� �ް� �ʱ�ȭ�ϴ� ������
	public String getName() {
		return name;
	} // �̸� getter
	public void setName(String name) {
		this.name = name;
	} // �̸� setter
	@Override
	public void speak() {
		System.out.println("�ȳ��ϼ���");
	} // speak�޼ҵ� �������̵�
}