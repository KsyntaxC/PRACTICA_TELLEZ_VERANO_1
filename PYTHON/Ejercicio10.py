#Hallar todos los números de fibonnacci comprendidos en el rango [a..b], donde a<b.
a=int(input("Desde donde "))
b=int(input("Hasta donde "))
f1=-1; f2=1; fibo=f1+f2
for i in range (1,b+1):
    if fibo>=a and fibo<=b:
        print(fibo, end=", ")
    f1=f2; f2=fibo; fibo=f1+f2