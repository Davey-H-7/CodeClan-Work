class CoffeeShop:
    
    def __init__(self, name, till):
        self.name = name
        self.till = till
        self.menu = []

    def increase_till(self, amount):
        self.till += amount

    def sell_drink (self,drink,customer):
        if self.check_age(customer):
            self.increase_till (drink.price)
            customer.buy_drink (drink)

    def check_age(self, customer):
        if customer.age >= 16:
            return True
        else:
            return False
        
    def check_energy_level(self, customer):
        if customer.energy <= 50:
            return True
        else:
            print('You have too much energy!')
            return False
            