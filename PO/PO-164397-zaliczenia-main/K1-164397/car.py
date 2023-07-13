from __future__ import annotations
from vehicle import*


class Car(Vehicle):
    price: float
    colour: str
    extra_seats: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022,
                 price: float = 0, colour: str = None, extra_seats: int = 0):
        super().__init__(reg, model, prod_year)
        if price < 0 or extra_seats < 0:
            self.price = 0
            self.colour = colour
            self.extra_seats = 0
        else:
            self.price = price
            self.colour = colour
            self.extra_seats = extra_seats

    @property
    def price(self) -> float:
        return self.price

    @price.setter
    def price(self,value: float) -> None:
        if value > 0:
            self.price = value

    @property
    def colour(self) -> str:
        return self.colour

    @colour.setter
    def colour(self, value: str) -> None:
        self.colour = value

    @property
    def extra_seats(self) -> int:
        return self.extra_seats

    @extra_seats.setter
    def extra_seats(self, value: int) -> None:
        if value > 0:
            self.extra_seats = value

    def drive(self) -> str:
        return f"Jadę świetnym pojazdem z roku {self.prod_year}!" \
               f"Ma kolor {self.colour}."

    def __eq__(self, other) -> bool:
        return self.model == other.model and self.price == other.price

    def __ne__(self, other) -> bool:
        return self.model != other.model or self.price != other.price

    def __str__(self):
        if self.common_name == None:
            return f"Pojazd wyprodukowany w roku: {self.prod_year}.\n" \
               f"Model: {self.model}. \n  Cena: {self.price}. \n" \
               f"Kolor: {self.colour}. \n" \
               f"Dodatkowe siedzenia: {self.extra_seats}."

        else:
            return f"Pojazd wyprodukowany w roku: {self.prod_year}.\n" \
               f"Model: {self.model}. \n Rejestracja: {self.reg}. \n" \
               f"Cena: {self.price}. \n Kolor: {self.colour}. \n" \
               f"Dodatkowe siedzenia: {self.extra_seats}."
