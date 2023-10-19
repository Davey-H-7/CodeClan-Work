import unittest
from src.customer import Customer
from src.drink import Drink

class TestCustomer(unittest.TestCase):

    def setUp(self):
        self.customer = Customer('Frank', 50.00, 15)
        self.drink = Drink ('Latte', 3.00, 10)

    def test_customer_has_name (self):
        self.assertEqual ('Frank', self.customer.name)

    def test_reduce_wallet(self):
        self.customer.reduce_wallet(5.00)
        self.assertEqual (self.customer.wallet, 45.00)

    def test_buy_drink(self):
        self.customer.buy_drink(self.drink)
        self.assertEqual(self.customer.wallet, 47.00)

    def test_increase_energy_level(self):
        self.customer.increase_energy_level(self.drink)
        self.assertEqual(self.customer.energy, 10)