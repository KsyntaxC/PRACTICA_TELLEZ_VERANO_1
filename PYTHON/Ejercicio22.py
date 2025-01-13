#.Hallar: S = x^2/2! – x^4/4! + x8/6! – x^16/8! +…
import math
N=int(input("Intro N: "))
x=int(input("Intro x: "))
S=0; e=2; d=2
for i in range (1,N+1):
    if i%2==0:
        print("(",x,"^",e,") /",d,"! +")
        S=S-(x**e)/math.factorial(d)
    else:
        print("(",x,"^",e,") /",d,"! -")
        S=S+(x**e)/math.factorial(d)
    e=e*2
    d=d+2
print(" = ",S)