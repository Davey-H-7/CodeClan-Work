import unittest

from src.fizzbuzz import fizzbuzz

class TestFizzBuzz(unittest.TestCase):

    def test_returns_a_number(self):
        self.assertEqual (4, fizzbuzz(4))

    def test_returns_fizz_when_passed_a_multiple_of_3(self):
        self.assertEqual ('fizz', fizzbuzz(9))

    def test_returns_buzz_when_passed_a_multiple_of_5(self):
        self.assertEqual ('buzz', fizzbuzz(25))

    def test_returns_fizzbuzz_when_passed_a_multiple_of_3_and_5 (self):
        self.assertEqual ('fizzbuzz', fizzbuzz(15))