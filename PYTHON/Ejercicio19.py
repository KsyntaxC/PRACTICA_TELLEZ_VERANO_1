#Generar para N términos: 2,3,5,7,11,13,…
n=int(input("Intro n:"))
p=2
for i in range(1,n+1):
    print(p,end=", ")
    p=p+1; sw=0
    while sw==0:
        s=1; c2=0
        while s<=p:
            if p%s==0:
                c2=c2+1
            s=s+1
        if c2==2:
            sw=1; c2=0
        else:
            p=p+1