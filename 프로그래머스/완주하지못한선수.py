def solution(participant, completion):
    answer = ''
    partiDict = {}
    for name in participant:
        if name in partiDict:
            partiDict[name] += 1
        else:
            partiDict[name] = 1
    
    for name in completion:
        if name in partiDict:
            partiDict[name] -= 1
            
        if partiDict[name] == 0:
            del partiDict[name]
            
    answer = list(partiDict.keys())[0]
    
    return answer
