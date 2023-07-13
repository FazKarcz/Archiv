#Zad1
def poggers(m1: list[list[int]],m2=list[list[int]]):
    wynik = []
    for i in range(len(m1)):
        pomoc = []
        for j in range(len(m1[0])):
            pomoc.append(m1[i][j]+m2[i][j])
        wynik.append(pomoc)
    return wynik

m1: list[list[int]] = [[1,2],[2,2]]
m2: list[list[int]] = [[1,2],[2,2]]
print(poggers(m1,m2))
