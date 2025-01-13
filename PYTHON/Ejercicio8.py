'''
El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas,
de las cuales se elimina la nota menor y se promedian las tres notas más altas. Diseñe
un algoritmo que imprima: la nota eliminada y el promedio de prácticas de un estudiante.
Ejm: Si 9 8 7 10 → Nota eliminada: 7, Promedio: 9
'''
n=input("Introduce las 4 notas de las practicas: ")
a, b, c, d = map(int, n.split())
if a<b:
    m=a
else: 
    m=b
if c<m:
    m=c
if d<m:
    m=d
P=(a+b+c+d-m)/3
print("Nota eliminada: ",m,", Promedio: ",P)