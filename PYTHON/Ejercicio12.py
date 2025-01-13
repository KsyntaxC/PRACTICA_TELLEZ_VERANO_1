# Generar para N términos: 2, 2, 4, 4, 6, 6, 8, 8, 10, …
N=int(input("Intro N: "))
n=2; c=1
for i in range(1,N+1):
    print(n,end=", ")
    if c>=2:
        n=n+2
        c=0
    c=c+1