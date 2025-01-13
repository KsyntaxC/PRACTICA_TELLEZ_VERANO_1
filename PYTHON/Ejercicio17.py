#Generar para N términos: 1, 2, -5, 1, 4, -5, 1, 6, -5, 1, …
N=int(input("Intro N: "))
a=2; sw=1
for i in range(1,N+1):
    if i%3!=0:
        if sw==1:
            print(1,end=", ")
            sw=0
        else:
            print(a,end=", ")
            a=a+2
            sw=1
    else:
        print(-5,end=", ")