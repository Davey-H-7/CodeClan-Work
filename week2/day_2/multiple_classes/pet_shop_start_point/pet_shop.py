
class PetShop:

    def __init__(self, name, cash, pets):
        self.name = name
        self.cash = cash
        self.pets = pets
        self.pets_sold = 0

    def stock_count(self):
        return len(self.pets)
    
    def increase_total_cash (self, amount):
        self.cash += amount

    def remove_pet (self, pet):
        self.pets.remove(pet)

    def increase_pets_sold(self):
        self.pets_sold += 1

    def find_pet_by_name(self, pet_name):
        for pet in self.pets:
            if pet.name == pet_name:
                return pet
    
    def sell_pet (self, name, customer):
        pet = self.find_pet_by_name(name)
        customer.reduce_cash(pet.price)
        customer.add_pet(pet)
        self.increase_total_cash(pet.price)
        self.increase_pets_sold()
        self.remove_pet(pet)


#always methods when existing only within a specific function