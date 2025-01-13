'''
Dado un numero entero positivo, si el número es par dividir entre 2, de lo contrario
multiplicar por 3 y sumar 1, mostrar cada numero generado hasta que le número sea 1.
Ejm: N=3 → 3,10,5,16,8,4,2,1
'''
n=int(input("Introduce un numero entero positivo: "))
while (n<=0): 
    n=int(input("Introduce un numero entero positivo: "))
while n!=1:
    print(n,end=", ")
    if n%2==0:
        n=n//2
    else:
        n=int(n*3+1)
print(n)