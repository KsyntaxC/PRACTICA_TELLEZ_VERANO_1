#Generar para N términos: 1, 3, 3, 6, 5, 9, 7, 12, 9, 15, 11, …
N=int(input("Intro N: "))
a=1; b=3
for i in range (1,N+1):
    if i%2==0:
        print(b,end=", ")
        b=b+3
    else:
        print(a,end=", ")
        a=a+2