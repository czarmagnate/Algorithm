arr = []
grade = []
totalGrade = 0
grade_dict = {"A+":4.5,'A0':4.0,'B+':3.5,'B0':3.0,'C+':2.5,'C0':2.0,'D+':1.5,'D0':1.0,'F':0}

for i in range(20):
    tmp = input()
    a,b,c = tmp.split(' ')
    if c != 'P':
        grade.append(float(b))
        arr.append(c)

for i in range(len(arr)):
    totalGrade += grade[i]*grade_dict[arr[i]]

print(totalGrade/sum(grade))
    