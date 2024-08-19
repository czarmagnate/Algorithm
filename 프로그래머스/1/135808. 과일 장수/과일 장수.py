def solution(k, m, score):
    answer = 0
    score_list = []
    score = sorted(score,reverse=True)
    i = 0
    while True:
        if i+m <= len(score):
            score_list.append(score[i:i+m])
            i += m
        else :
            break        
        
    for i in score_list:
        i = sorted(i)
        answer += i[0] * m      
        
    return answer