package lab15_1;

//MyPair ��ü�� �����ϰ� �̿��ϴ� ���α׷�
public class MyPairTest {
	public static void main(String[] args) {
		System.out.println("lab15_1: ������\n");

		// ���ڿ��� ��/�� ���ҷ� ���� MyPair ��ü pair�� ����
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");
		
		MyPair<String> studentPair = new MyPair<String>("kim", "park");
		
		MyPair<Integer> integerPair = new MyPair<Integer>(11, 22);

		// �� ���Ҹ� ������ ���� �� ���
		String master = pair.getMaster();
		System.out.println(master + "��\n");

		// pair�� ���
		System.out.println(pair);

		// pair�� ��/�� ���Ҹ� ��ȯ
		pair.swap();


		// pair�� ���
		System.out.println(pair);
		System.out.println();
		System.out.println(studentPair);
		studentPair.swap();
		System.out.println(studentPair);
		System.out.println();
		System.out.println(integerPair);
		integerPair.swap();
		System.out.println(integerPair);
	}
}


//String�� ��/�� ���Ҹ� �����ϴ� Ŭ����
class MyPair <T>{
	private T master; // �� ����
	private T slave; // �� ����

	public MyPair(T master, T slave) { // ������
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  ��/�� ���Ҹ� ��ȯ�ϴ� �޼ҵ�


		// ... (��)
		T temp = this.master;
		this.master = slave;
		this.slave = temp;
	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "��=" + master + " ��=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}