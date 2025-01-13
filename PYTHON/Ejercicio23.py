#Sumatoria con i
n=int(input("Intro n: "))
S=0
for i in range (1,n+1):
    print("(",2,"*",i,") /",5)
    S=S+(2*i)/5
print(" = ", S)