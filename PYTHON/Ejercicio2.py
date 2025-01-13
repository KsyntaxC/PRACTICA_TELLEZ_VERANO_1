'''
Escribe un programa que calcule el tiempo de descarga de un archivo en función del tamaño
del archivo y la velocidad de descarga en megabits por segundo. El programa debe pedir
al usuario que ingrese el tamaño del archivo en megabytes y la velocidad de descarga en
megabits por segundo, y mostrar el tiempo de descarga en minutos y segundos
'''
T=int(input("Ingrese el tamaño del archivo en Megabytes: "))
V=int(input("Ingrese la velocidad de descarga en megabits por segundo: "))
Tm=(T*8)/V
m=int(Tm//60)
s=int(Tm%60)
print("El tiempo de descarga será de ",m," minutos y ",s,"segundos")