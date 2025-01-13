#Generar para N términos: 0,-1,-2,3,-4,-5,6,-7,-8,9,-10,…
N=int(input("Intro N: "))
for i in range(0,N):
    if i%3==0:
        print(i,end=", ")
    else:
        print(i*-1,end=", ")