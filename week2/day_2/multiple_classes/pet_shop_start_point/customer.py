class Customer:

    def __init__(self, name, cash):
        self.name =name
        self.cash = cash
        self.pets = []

    def reduce_cash(self, amount):
        self.cash -= amount

    def add_pet (self, pet):
        self.pets.append(pet)