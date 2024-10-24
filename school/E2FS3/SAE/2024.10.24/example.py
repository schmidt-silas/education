#schueler_wohnorte = {"Hans": "Reutlingen",
# "Greta": "Bronnweiler",
# "Guenther": "Metzingen",
# "Paula": 70345}

#print(schueler_wohnorte["Greta"])
#print(schueler_wohnorte)
#a=2*(schueler_wohnorte["Paula"])

#print("A dir: ", a)

test = {"aa": "alle",
        "bb": "meine",
        "cc": ("Entchen", "schwimmen", "auf dem"),
        "dd": "See",}

#print("Test dir: ", test)

#for key in test.keys():
#    print(test[key])

#for key, value in test.items():
#    if isinstance(value, tuple):
#        print(' '.join(value))
#    else:
#        print(value)

output_parts = []

for key, value in test.items():
    if isinstance(value, tuple):
        output_parts.append(' '.join(value))
    else:
        output_parts.append(value)

print(' '.join(output_parts))

print(test["cc"][1], test["cc"][2], test["dd"])

print("köpfchen in das Wasser, schwänzchen in die höh")


import sqlite3
connection = sqlite3.connect("/home/silas/Documents/Git-Repos/GitHub/schmidt-silas/education/school/E2FS3/SAE/2024.10.24/miniDB1.db")
pointer = connection.cursor()
sql_command = """ SELECT * FROM Artikel; """
pointer.execute(sql_command)
inhalt = pointer.fetchall()

# Spaltennamen abrufen
columns = [col[0] for col in pointer.description]

# Ergebnisse abrufen und in ein Dictionary konvertieren
results = []
for row in pointer.fetchall():
    results.append(dict(zip(columns, row)))

connection.commit()
connection.close()

print(inhalt)
print(results)