#Hallar: S = x^0/2 + x^1/4 + x^1/6 + x^2/8 + …
N=int(input("Intro N: "))
x=int(input("Intro x: "))
S=0; e=0; d=2; c=0; c2=1
for i in range (1,N+1):
    print("(",x,"^",e,") /",d," + ")
    S=S+(x**e)/d
    c=c+1
    if c>=c2:
        e=e+1; c2=c2+1; c=0
    d=d+2
print(" = ",S)