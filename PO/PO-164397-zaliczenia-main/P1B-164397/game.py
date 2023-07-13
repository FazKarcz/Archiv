class Game:
    __title: str
    __genre: str
    __pegi: int
    __price: float
    __reputation: float

    def __init__(self, title: str, genre: str, pegi: int,
                 price: float, reputation: float) -> None:
        self.__title = title
        self.__genre = genre
        if pegi < 0 or pegi > 18:
            self.__pegi = 16
        else:
            self.__pegi = pegi
        if price < 0:
            self.__price = 45.99
        else:
            self.__price = price
        if reputation < 1 or reputation > 6:
            self.__reputation = 3.0
        else:
            self.__reputation = reputation

    @property
    def title(self) -> str:
        return self.__title

    @title.setter
    def title(self, value: str) -> None:
        self.__title = value

    @property
    def genre(self) -> str:
        return self.__genre

    @genre.setter
    def genre(self, value: str) -> None:
        self.__genre = value

    @property
    def pegi(self) -> int:
        return self.__pegi

    @pegi.setter
    def pegi(self, value) -> None:
        if value < 0 or value > 18:
            print("Pegi wychodzi poza przedział")
        else:
            self.__pegi = value

    @property
    def price(self) -> float:
        return self.__price

    @price.setter
    def price(self, value) -> None:
        if value < 0:
            print("Wartość nie może być ujemna")
        else:
            self.__price = value

    @property
    def reputation(self) -> float:
        return self.__reputation

    @reputation.setter
    def reputation(self, value) -> None:
        if value < 1 or value > 6:
            print("Reputacja wychodzi poza przedział")
        else:
            self.__reputation = value

    @staticmethod
    def check_reputation(game):
        if game.__reputation > 2.5 and game.__price < 50:
            temp = game.__price - 10
            if temp > 0:
                wynik = game.__price

    def __str__(self) -> str:
        return f"Szczegóły: Nazwa:{self.__title}. Gatunek: {self.__genre}. PEGI: {self.__pegi}, Cena: {self.__price} \n" \
               f"Średnia recenzja: {self.__reputation}."

