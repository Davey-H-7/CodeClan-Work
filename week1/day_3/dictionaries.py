#meals = ['yoghurt', 'roll', 'steak']

my_first_empty_dictionary = {}
my_second_empty_dictionary = dict()

meals = {'breakfast':'yoghurt', 'lunch':'roll', 'dinner':'steak'}

# print(meals['breakfast'])
# print('breakfast' in meals)

# meals['supper'] = 'pancakes'
# print(meals)
# meals['breakfast'] = 'cereal'
# print(meals)

# del(meals['breakfast'])
# print(meals)
# print(list(meals))
# print(meals.keys())
# print(meals.values())


# countries = {'uk':{'capital': 'London', 'population': 1000},
#              'germany':{'capital': 'Berlin', 'population': 500}
#             }

# print (countries['germany']['population'])

Avengers ={'IronMan': {'name': 'Tony Stark', 'attacks': {'punch':10, 'kick': 100}}, 
           'Hulk': {'name': 'Bruce Banner', 'attacks': {'smash':1000, 'roll':500}}}

print(Avengers['Hulk']['attacks']['smash'])