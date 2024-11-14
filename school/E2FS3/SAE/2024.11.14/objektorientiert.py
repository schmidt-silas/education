class fahrzeug():
    def __init__(self, par1, par2):
        self.maxSpeed = par1
        self.maxPower = par2
    def getPower(self):
        print("Maximale Leistung ist: ", self.maxPower)

autole=fahrzeug(240, 120)
autole.getPower()

class auto(fahrzeug):
    def __init__(self, par1, par2, par3):
        super().__init__(par1, par2)
        self.marke=par3
    def getMarke(self):
        return self.marke
    def getmaxSpeed(self):
        print("Mei Audole ischd :", self.maxSpeed, "Sache schnell!")

meinGolfi = auto (150, 90, 'VW') # Instanz der abgeleiteten Klasse
print(meinGolfi.getMarke()) # Zugriff auf Methode der abg. Klasse
meinGolfi.getPower() # Zugriff auf Methode der Basisklasse
meinGolfi.getmaxSpeed() # Zugriff auf Methode der abg. Klasse