#Generar para N términos: 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, …
N=int(input("Intro N: "))
n=0; c=1; c2=1
for i in range(1,N+1):
    if c2%2==0:
        print(0,end=", ")
    else:
        print(1,end=", ")
    if c>=c2:
        c=0
        c2=c2+1
    c=c+1