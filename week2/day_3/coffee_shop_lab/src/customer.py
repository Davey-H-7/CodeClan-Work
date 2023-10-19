class Customer:

    def __init__(self, name, wallet, age):
        self.name = name
        self.wallet = wallet
        self.age = age
        self.energy = 0

    def reduce_wallet(self,amount):
        self.wallet -= amount

    def buy_drink (self, drink):
        self.reduce_wallet(drink.price)

    def increase_energy_level(self, drink):
        self.energy += drink.caffeine_level
