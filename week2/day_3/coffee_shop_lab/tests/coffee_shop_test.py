import unittest
from src.coffee_shop import CoffeeShop
from src.drink import Drink
from src.customer import Customer

class TestCoffeeShop(unittest.TestCase):
    
    def setUp(self):
        self.drink = Drink ('Latte', 3.00, 10)
        self.customer = Customer('Frank', 50.00, 16)
        self.coffee_shop = CoffeeShop('The Prancing Pony', 100.00)

    def test_coffee_shop_has_name(self):
        self.assertEqual('The Prancing Pony', self.coffee_shop.name)

    def test_increase_till(self):
        self.coffee_shop.increase_till(2.50)
        self.assertEqual(102.50, self.coffee_shop.till)

    def test_sell_drink(self):
        self.coffee_shop.sell_drink (self.drink, self.customer)
        self.assertEqual(self.coffee_shop.till, 103.00)
        self.assertEqual(self.customer.wallet, 47.00)

    def test_check_age(self):
       self.assertEqual(self.coffee_shop.check_age(self.customer), True)

    def test_check_energy_level(self):
        self.assertEqual(self.coffee_shop.check_energy_level(self.customer), True)
        

