def solution(data, ext, val_ext, sort_by):
    answer = []
    
    temp_dict = {'code':0,'date':1,'maximum':2,'remain':3}
    
    for i in data:
        if i[temp_dict[ext]] <= val_ext:
            answer.append(i)
        answer.sort(key=lambda x:x[temp_dict[sort_by]])
    return answer