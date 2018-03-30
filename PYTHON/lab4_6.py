"""
주제 : 조건문 연습
작성자 : 박찬우
작성일 : 2017.9.20.
"""
import random
"""

주사위 게임
컴퓨터에서 임의의 수 (1~6)를 생성한다.
(random.randint(a,b) 호출, a와 b사이의 임의값 반환)
사용자로부터 짐작하는 숫자를 입력받는다.
컴퓨터가 생성한 값을 출력한다.
사용자 입력이 생성된 수와 같은지,
입력한 숫자가 범위(1,6)을 벗어났는지,
큰 지, 작은지를 결정하여 출력한다.
"""
r=random.randint(1,6)
num=int(input("짐작하는 숫자를 입력하세요:"))
print("컴퓨터가 생성한 값=",r)
if num==r:
    print("입력한 수가 생성된 수와 같습니다.")
elif num>6 and num<1:
    print("입력한 수가 1~6을 벗어났습니다.")
elif num>r:
    print("입력한 수가 생성된 수보다 큽니다.")
else:
    print("입력한 수가 생선된 수보다 작습니다.")