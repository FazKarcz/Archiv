from __future__ import annotations


class Vehicle:
    reg: str
    model: int
    prod_year: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022) -> None:
       if model < 0 or prod_year < 1900 or prod_year > 2022:
           self.reg = reg
           self.model = 0
           self.prod_year = 2022
       else:
           self.reg = reg
           self.model = model
           self.prod_year = prod_year

    @property
    def reg(self) -> str:
        return self.reg

    @reg.setter
    def reg(self, value: str) -> None:
        self.reg = value

    @property
    def model(self) -> int:
        return self.model

    @model.setter
    def model(self, value: int) -> None:
        if value > 0:
            self.model = value

    @property
    def prod_year(self) -> int:
        return self.model

    @prod_year.setter
    def prod_year(self, value: int) -> None:
        if 1900 <= value <= 2022:
            self.prod_year = value

    def brake(self) -> str:
        return "Zatrzymuję się"

    def drive(self) -> str:
        return f"Jadę świetnym pojazdem z roku {self.prod_year}!"

    def __str__(self) -> str:
        if self.common_name == None:
            return f"Pojazd wyprodukowany w roku: {self.prod_year}.\n" \
                   f"Model: {self.model}."
        else:
            return f"Pojazd wyprodukowany w roku: {self.prod_year}.\n" \
                   f"Model: {self.model}. \n Rejestracja: {self.reg}."

    def __eq__(self, other: Vehicle) -> bool:
        if self.model == other.model:
            return self.prod_year == other.model

    def __ne__(self, other: Vehicle) -> bool:
        if self.model == other.model:
            return self.prod_year == other.prod_year
