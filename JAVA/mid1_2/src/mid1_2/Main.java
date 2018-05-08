/*
 * 주제 : 사원 클래스를 정의하고 이용하는 프로그램
 * 작성자 : 박찬우
 * 작성일 : 2018.05.08.
 */
package mid1_2;

public class Main {

	public static void main(String[] args) {
		System.out.println("mid1_2 : 박찬우\n");
		// (1) 이름 Kim, 시급 8000, 시간 11인 사원 emp1 생성
		Employee emp1 = new Employee("Kim", 8000, 11);
		// (2) 이름 Lee인 사원 emp2 생성
		Employee emp2 = new Employee("Lee");


		// emp1, emp2를 비교하는 메소드 호출
		compare(emp1, emp2);
		compare(emp2, emp1);
	}

	// (3) 매개변수로 받은 사원 e1, e2중에서
	//      봉급이 많은 사원의 이름을 출력하는 메소드
	// -봉급이 동일하면 동일하다고 출력할 것
	private static void compare(Employee e1, Employee e2){ 
		if (e1.getSalary() > e2.getSalary())
			System.out.println("봉급이 더 많은 사원 = " + e1.getName());
		else if (e1.getSalary() < e2.getSalary())
			System.out.println("봉급이 더 많은 사원 = " + e2.getName());
		else
			System.out.println("봉급이 동일합니다.");
	}
}