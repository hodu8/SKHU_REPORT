/********************************************************
주제: 각 후보자가 획득한 득표수를 계산하는 프로그램을 작성 
작성자 학번: 201732015
작성자 이름: 박찬우
작성일: 2017년 5월 26일
*********************************************************/
#include <stdio.h>
int main()
{	
	int sel,nov=0; //투표 할 후보를 입력받을 변수 sel, 총 투표수를 저장할 변수 nov(number of vote) 선언
	int cand[5]={0,0,0,0,0}; //후보 5명을 저장할 배열 cand 정의
	while(1) //반복문 시작, 무한루프
	{
		printf("투표 할 후보의 번호를 입력하세요. : ");
		scanf("%d",&sel);
		//사용자로부터 투표 할 후보를 입력받는다
		if(sel!=0 && sel<1 || sel>5)
			printf("1~5사이의 값을 입력하세요.\n종료를 원하면 0을 입력하세요.\n");
		//1보다 작고 5보다 큰 값을 입력하면 재입력 시킨다
		if(sel==0)
			break;
		//0을 입력하면 반복문을 빠져나간다
		if(sel<6 && sel>0)
		{
			sel--; //번호를 맞추기위해 입력받은 수를 1 줄인다
			cand[sel]++; //투표받은 후보의 배열 값을 1 올린다
			nov++; //총 투표수 1 증가시킨다
		}
	}
	printf("최종 득표 상황\n총 득표 수 = %d\n각 후보 별 득표 수 : 1.%d표 2.%d표 3.%d표 4.%d표 5.%d표\n각 후보 별 득표율 : 1.%.2f%% 2.%.2f%% 3.%.2f%% 4.%.2f%% 5.%.2f%%\n",nov,cand[0],cand[1],cand[2],cand[3],cand[4],(double)cand[0]/nov*100,(double)cand[1]/nov*100,(double)cand[2]/nov*100,(double)cand[3]/nov*100,(double)cand[4]/nov*100);
	//최종 득표 상황 출력
	return 0;
}