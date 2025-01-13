#Generar la siguiente serie: Si N= 20 → 20,15,10,5,0
N=int(input("Intro N: "))
while N>=0:
    if N%5==0:
        print(N,end=", ")
    N=N-1