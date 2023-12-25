def solution(number):
    answer = 0
    DP = [0 for x in range(len(number))]
    DP[0] = number[0]
    n = len(number)-1
    for i in range(1,n):
        DP[i] = DP[i-1]+number[i]
    print(DP)
    return answer