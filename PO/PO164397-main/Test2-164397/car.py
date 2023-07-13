class Car:
    model: str
    price: int

    def __init__(self,model,price):
        self.price = price
        self.model = model
    def __str__(self):
        return f"Model: {self.price}, Cena: {self.price} zł"