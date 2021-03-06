/*
(1)	각 후보자가 획득한 득표수를 계산하는 프로그램을 작성한다.
(2)	5명의 후보자를 위한 배열을 선언하여 사용한다. 후보번호는 1번부터 5번까지이다.
(3)	반복문을 돌면서 1부터 5까지의 후보 중에 원하는 후보의 번호를 입력하도록 한다. 사용자가 0을 입력하면 반복을 중단한다.
1~5사이가 아닌 다른 수를 입력하면 1~5사이의 값을 입력하도록 안내하고, 종료를 원하면 0을 입력하라고 안내한다.
(4)	사용자가 1~5사이의 후보를 입력하면, 해당 후보의 득표수를 증가시킨다.
(5)	반복이 끝난 후, 최종 득표 상황을 출력한다. 총 득표수, 각 후보별 득표수, 각 후보별 득표율을 출력한다.
(6)	후보번호는 1부터 5까지이지만, 배열은 0부터 시작함을 고려하라.
*/
#include <stdio.h>
int main()
{
	int n;
	int nov=0;
	int cand[5]={0,};
	while(1)
	{
		printf("원하는 후보의 번호를 입력하세요. : ");
		scanf("%d",&n);
		if(n==0)
			break;
		if(n<1||n>5&&n!=0)
		{
			printf("1~5사이의 값을 입력하세요\n종료를 원하시면 0을 입력하세요\n");
		}
		else
		{
			cand[n-1]++;
			nov++;
		}
	}
	printf("총 득표수 = %d\n",nov);
	printf("각 후보별 득표수 1. %d표 2. %d표 3. %d표 4. %d표 5. %d표\n",cand[0],cand[1],cand[2],cand[3],cand[4]);
	printf("각 후보별 득표율 1. %.2f%% 2. %.2f%% 3.%.2f%% 4. %.2f%% 5. %.2f%%\n",(double)cand[0]/nov*100,(double)cand[1]/nov*100,(double)cand[2]/nov*100,(double)cand[3]/nov*100,(double)cand[4]/nov*100);
	return 0;
}