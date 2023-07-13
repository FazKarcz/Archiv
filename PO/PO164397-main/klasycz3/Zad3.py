class Student:
    nazwa_ucznia: str
    klasa_ucznia: str
    id_ucznia: int
    def __init__(self,id_ucznia: int = 0,nazwa_ucznia: str = "",klasa_ucznia: str = "") -> None:
        self.nazwa_ucznia = nazwa_ucznia
        self.klasa_ucznia = klasa_ucznia
        self.id_ucznia = id_ucznia
    def student_data(self) -> None:
        print(self.id_ucznia)
        if self.nazwa_ucznia != "":
            print(self.nazwa_ucznia)
        if self.klasa_ucznia != "":
            print(self.klasa_ucznia)


