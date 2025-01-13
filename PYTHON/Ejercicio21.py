#Hallar: S = x^1/4 + x^3/8 + x^5/12 + x^7/16 +…
N=int(input("Intro N: "))
x=int(input("Intro x: "))
S=0; e=1; d=4
for i in range (1,N+1):
    print("(",x,"^",e,") /",d," + ")
    S=S+(x**e)/d
    e=e+2
    d=d+4
print(" = ",S)