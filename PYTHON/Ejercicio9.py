'''
Hallar el mayor y el menor de 5 números ingresados desde teclado (no utilice estructuras
repetitivas)
'''
n=input("Ingrese 5 numeros separados por espacios: ")
a, b, c, d, e = map(int, n.split())
if a > b:
    M=a; m=b
else:
    M=b; m=a
if c>M:
    M=c
else:
    if c<m:
        m=c
if d>M:
    M=d
else:
    if d<m:
        m=d
if e>M:
    M=e
else:
    if e<m:
        m=e
print("El mayor es",M)
print("El menor es",m)