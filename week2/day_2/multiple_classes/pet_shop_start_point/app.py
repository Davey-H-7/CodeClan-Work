from pet import Pet
from pet_shop import PetShop
from customer import Customer

monty = Pet("Monty", "Snake", "Python", 500)
charles = Pet("Charles", "Dog", "Spaniel", 250)
mrs_norris = Pet("Mrs. Norris", "Cat", "Maine Coon", 100)
pets = [monty, charles, mrs_norris]
cc_pet_shop = PetShop('CodeClan Pet Shop', 0, pets)

print(f'{cc_pet_shop.name} has {cc_pet_shop.stock_count()} pets in stock')

# print(f'{cc_pet_shop.name} started with £{cc_pet_shop.cash}')
# print(f'Increasing total cash by £100')
# cc_pet_shop.increase_total_cash(100)
# print(f'{cc_pet_shop.name} now has £{cc_pet_shop.cash}')

# print(f'Removing {monty.name} from {cc_pet_shop.name}')
# cc_pet_shop.remove_pet(monty)
# print(f'{cc_pet_shop.name} has {cc_pet_shop.stock_count()} pets in stock')

# print(f'{cc_pet_shop.name} has sold {cc_pet_shop.pets_sold} pets')
# cc_pet_shop.increase_pets_sold()
# print(f'{cc_pet_shop.name} has now sold {cc_pet_shop.pets_sold} pets')

customer1= Customer('Zoltan', 100)

print('Selling Charles......')
cc_pet_shop.sell_pet('Charles', customer1)
print(f'{cc_pet_shop.name} has sold {cc_pet_shop.pets_sold} pets')
print(f'{cc_pet_shop.name} has {cc_pet_shop.stock_count()} pets in stock')
print(f'{cc_pet_shop.name} now has £{cc_pet_shop.cash}')

print(f'{customer1.name} now has {len(customer1.pets)} pets')