#Generar para N términos: 1,0,2,1,3,2,4,3,5,4,6,5,7,6,8,7,9,…
N=int(input("Intro N: "))
a=1; b=0
for i in range (1,N+1):
    if i%2==0:
        print(b,end=", ")
        b=b+1
    else:
        print(a,end=", ")
        a=a+1