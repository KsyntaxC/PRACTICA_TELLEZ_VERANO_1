'''
Escribe un programa que calcule el tiempo que tardará un vehículo en recorrer una distancia a una velocidad constante. 
El programa debe pedir al usuario que ingrese la distancia en kilómetros y la velocidad en kilómetros por hora.
Mostrar el tiempo que tardará en recorrer la distancia en horas.
'''
d=int(input("Introduce la distancia en kilometros: "))
v=int(input("Introduce la velocidad en kilometros por hora: "))
t=d/v
print("El tiempo total es de:",t,"horas")