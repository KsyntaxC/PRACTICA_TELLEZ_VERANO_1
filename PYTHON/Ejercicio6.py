'''
Determinar si un año es bisiesto. Para que un año sea bisiesto debe ser divisible por 4
y no debe ser divisible por 100, excepto que también sea divisible por 400.
''' 
a=int(input("Introducir el año: "))
if a%400==0 or (a%4==0 and a%100!=0):
    print("Es año bisiesto")
else:
    print("No es año bisiesto")
