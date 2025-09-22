def findFactorial(n):
    fac = 1
    for i in range(1, n+1):
        fac = fac * i
    
    return fac


sample_testcases = [2, 4, 7, 9]

for tc in sample_testcases:
    print(findFactorial(tc))