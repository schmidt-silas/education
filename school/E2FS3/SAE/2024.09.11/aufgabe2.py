# Teste Liste nach negativen Zahlen

liste = [1, 2, 3, 4, -2]
zustand = True

for i in liste:
    if i < 0:
        zustand = False

if zustand == True:
    print("Alles positiv :D")
else:
    print("Es ist eine negative Zahl in der Liste vorhanden!")
