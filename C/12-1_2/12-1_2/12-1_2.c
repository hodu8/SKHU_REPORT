/*
int�� ���� num1�� num2�� ����� ���ÿ� ���� 10�� 20���� �ʱ�ȭ�ϰ�,
int�� ������ ���� ptr1�� ptr2�� �����Ͽ� ���� num1�� num2�� ����Ű�� ����.
�׸��� �� ���¿��� ������ ���� ptr1�� ptr2�� �̿��ؼ� num1�� ���� 10 ������Ű��, num2�� ���� 10 ���ҽ�Ű��.
���� �� ������ ���� ptr1�� ptr2�� ����Ű�� ����� ���� �ٲ���.
�׸��� ���������� ptr1�� ptr2�� ����Ű�� ������ ����� ���� �������.
*/
#include <stdio.h>
int main ()
{
	int num1=10, num2=20;
	int *chg=0;
	int *ptr1=&num1, *ptr2=&num2;
	(*ptr1)+=10;
	(*ptr2)-=10;
	chg=ptr1;
	ptr1=ptr2;
	ptr2=chg;
	printf("ptr1 = %d\nptr2 = %d\n",*ptr1,*ptr2);
	return 0;
}