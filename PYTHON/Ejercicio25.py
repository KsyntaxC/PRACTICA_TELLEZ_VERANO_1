import math
n = int(input("Introduce n: "))
k = int(input("Introduce un k <= n: "))
nd = int(math.log10(n)) + 1
print(nd, ",", (int(n // (10 ** (nd - k))) % 10))
