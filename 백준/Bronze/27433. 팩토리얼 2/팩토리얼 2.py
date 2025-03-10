def factorial(N):
    if N < 2:
        return 1
    else:
        return N*factorial(N-1)
    
print(factorial(int(input())))