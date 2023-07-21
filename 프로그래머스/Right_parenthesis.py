"""
프로그래머스 레벨1
올바른 괄호 문제 풀이 코드
-문제 설명-
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
"""
class Stack:
    def __init__(self):
        self.stack = []

    def Add(self, data):
        self.stack.append(data)

    def Pop(self):
        self.stack.pop()

    def Empty(self):
        if (len(self.stack) == 0):
            return True
        else:
            return False
def solution(s):
    answer = True
    L = len(s)
    result = []
    for data in s:
        print(data)
        if (data == '('):
            result.append(data)
        elif (data == ')'):
            try:
                result.pop()
            except:
                return False

    if (len(result) != 0):
        return False
    else:
        return True