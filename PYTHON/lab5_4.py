"""
주제 : 1. 이름, 학번, 학과를 매개변수로 받아서 이를 출력하는 함수 print_me 함수를 정의한다.
       이때 학과가 매개변수로 넘어오지 않으면, "소프트웨어공학과"를 디폴트 값으로 한다.
       2. 자신의 이름, 학번, 학과를 매개변수로 print_me를 호출한다.
       3. 자신의 이름, 학번을 매개변수로 print_me를 호출한다.
작성일 : 2017.10.16.
작성자 : 박찬우
"""
def print_me(name, num, major='소프트웨어공학과'):
    print('이름 : %s, 학번 : %d, 학과 : %s'%(name, num, major))

print_me('박찬우',201732015,'소프트웨어공학과')
print_me('박찬우', 201730215)