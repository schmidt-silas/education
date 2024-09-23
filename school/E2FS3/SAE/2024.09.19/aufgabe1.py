L = ['Meier', 'Bauer', 'Moser', 'Molitor', 'Martin']
trifftzu = True
for e in L:
 if e[0] != 'M':
    trifftzu = False
if trifftzu == True:
 print('Alle Namen fangen mit M an.')
else:
 print('Nicht alle Namen fangen mit M an.')