'''
Escribe un programa que solicite al usuario ingresar tres números enteros. El programa
deberá imprimir en pantalla el mensaje "Hay un número par" si al menos uno de los números
ingresados es par. De lo contrario, deberá imprimir en pantalla el mensaje "No hay
números pares".
'''
n=input("Introduce tres numeros enteros separados por espacios: ")
n1, n2, n3 = map(int, n.split())
if n1%2==0 or n2%2==0 or n3%2==0:
    print("Hay un número par")
else:
    print("No hay un números pares")