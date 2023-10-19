import unittest
from src.drink import Drink

class TestDrink(unittest.TestCase):
    
    def setUp (self):
        self.drink = Drink('Latte', 3.00, 10)

    def test_drink_has_name(self):
        self.assertEqual('Latte', self.drink.name)