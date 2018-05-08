/*
 * ���� : ��� Ŭ������ �����ϰ� �̿��ϴ� ���α׷�
 * �ۼ��� : ������
 * �ۼ��� : 2018.05.08.
 */
package mid1_2;

public class Employee {
	private String name; // �̸�
	private int hourlyRate; // �ñ�
	private int hours; // �ð�(�ٹ��ð�)

	// �̸�, �ñ�, �ð��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Employee(String name, int hourlyRate, int hours) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	// �̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Employee(String name) {
		this(name, 9000, 10);
	}

	// �̸��� �����ϴ� �޼ҵ�
	public String getName() {
		return name;
	}

	// ����(�ñ� x �ٹ��ð�)�� ����Ͽ� �����ϴ� �޼ҵ�
	public int getSalary() {
		return hourlyRate * hours;
	}
}