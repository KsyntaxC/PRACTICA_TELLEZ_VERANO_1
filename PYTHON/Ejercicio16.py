#Generar para N términos: 0, 1, 1, 2, 4, 8, 16, 31, 61, 120, 236,464,912,1793,3525, ...
N=int(input("Intro N: "))
a=-1; b=1; c=0; d=0; e=0; s=a+b+c+d+e
for i in range(1,N+1):
    s=a+b+c+d+e
    print(s,end=", ")
    a=b; b=c; c=d; d=e; e=s