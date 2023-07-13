from car import*
class Bus(Car):
    seats: int
    def __init__(self,model,price,seats):
        super().__init__(model,price)
        self.seats = seats
    def napis(self)-> str:
        return f"Model: {self.model}, Cena: {self.price} zł, Miejsca: {self.seats}"