import sqlite3

# Datenbankverbindung herstellen
connection = sqlite3.connect("/home/silas/Documents/Git-Repos/GitHub/schmidt-silas/education/school/E2FS3/SAE/2024.10.24/miniDB1.db")
pointer = connection.cursor()

# SQL-Abfrage definieren
sql_command = """SELECT * FROM Artikel;"""

# Abfrage ausführen
pointer.execute(sql_command)

# Spaltennamen abrufen
columns = [col[0] for col in pointer.description]

# Ergebnisse abrufen und in ein Dictionary konvertieren
results = []
for row in pointer.fetchall():
    results.append(dict(zip(columns, row)))

# Datenbankverbindung schließen
connection.close()

# Konvertierte Ergebnisse drucken
print(results)