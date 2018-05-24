/*
 * 주제 : Member를 상속하는 시간제 회원 클래스
 * 작성일 : 2018.05.24.
 * 작성자 : 박찬우
 */

package hw7_2;

public class HourlyMember extends Member { // Member를 상속
	int hour; // 사용시간 필드
	public HourlyMember (int age, int hour) {
		super(age);
		this.hour = hour;
	} // 나이, 사용시간을 매개변수로 받아 초기화하는 생성자
	@Override
	public int getPayment() {
		return hour*100;
	} // 사용시간당 회비 100을 곱한 값을 반환
}
