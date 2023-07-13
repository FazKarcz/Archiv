from game import Game


class Racing(Game):
    __camera_type: str
    __players: [str]

    def __init__(self, title: str, genre: str, pegi: int, price: float,
                 reputation: float, camera_type: str, players: []) -> None:
        super().__init__(title, genre, pegi, price, reputation)
        if len(camera_type) > 2:
            self.__camera_type = "TPC"
        else:
            self.__camera_type = camera_type
        self.__players = players

    @property
    def camera_type(self) -> str:
        return self.__camera_type

    @camera_type.setter
    def camera_type(self, value) -> None:
        if len(value) > 2:
            print("Długość znaków musi mieć conajmniej 2 znaki")
        else:
            self.__camera_type = value

    @property
    def player(self) -> [str]:
        return self.__players

    @player.setter
    def player(self, value) -> None:
        self.__players = value

    def __str__(self) -> str:
        return f"Szczegóły: Nazwa{self.title}. Typ kamery : {self.__camera_type}. Cena: {self.price}. \n" \
               f"Średnia recenzja: {self.reputation}. Gracze: {self.__players}."
