package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		System.out.println("lab7_1 : ������\n");
		Manager m = new Manager();
		m.setSalary(1000);
		m.setBonus(500);
		System.out.println(m.getSalary());
		System.out.println(m.getBouns());
		System.out.println(m.getTax());
	}
}