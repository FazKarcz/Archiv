import trip


class Trip:
    goal : str
    price : float
    def __init__(self,goal,price):
        self.goal = goal
        self.price = price
    def returning(self) -> None:
        return (f'Goal: {self.goal}, Price {self.price}')


