/*
 * ���ϸ�: StudentTest.java
 * �ۼ���: 2018.4.24
 * �ۼ���: ȫ�浿
 * ����: �л� ��ü�� �����ϰ� �̿��ϴ� ���α׷�
 */

package lab6_6;

public class StudentTest {

 public static void main(String[] args) {
  System.out.println("lab6_6: ������\n");
  
  // �� ���� �л� ��ü ����
  Student s1 = new Student("Park", "Tokyo", "Japan");
  Student s2 = new Student("Kim", "Seoul", "Korea");
  
  // �л� ���� ���
  System.out.println(s1.toString());
  System.out.println(s2.toString());
  
  // s1�� �̻� - s2�� ��� ����, ������ �̻�
  s1.move(s2.getCity(), s2.getCountry());

  // �л� ���� ���
  System.out.println("\n�̻� ��\n");
  System.out.println(s1.toString());
  System.out.println(s2.toString());
 }
}