#ZAD1
import random
class imie_nazwisko:
    imie: str
    nazwisko: str
    def __init__(self,imie: str,nazwisko: str) -> None:
        self.imie = imie
        self.nazwisko = nazwisko
    def jakie_imie(self) -> str:
        return f'Osoba ma na imię {self.imie}'
    def jakie_nazwisko(self) -> str:
        return f'Osoba ma na nazwisko {self.nazwisko}'
jeden = imie_nazwisko('Jakub','Karcz')
print(jeden.imie,jeden.nazwisko)




