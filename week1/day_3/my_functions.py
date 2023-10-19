# #funtion definition
# def greet(name, time_of_day):
#     return 'Good ' + time_of_day +', ' + name

# #define variables
# name_1 = 'Bob'
# time_of_day_1 = 'morning'


# #function execution
# greeting = greet(name_1, time_of_day_1)
# print (greeting)

# #define variables
# name_2 = 'Ada'
# time_of_day_2 = 'evening'


# #function execution
# greeting = greet(name_2, time_of_day_2)
# print (greeting)

# def greet():
#     words = 'Hey'
#     return words

# result = greet()

# def greet_two(data):
#     return data

# print(greet_two(result))

chickens = [
  { "name": "Margaret", "age": 2, "eggs": 0 },
  { "name": "Hetty", "age": 1, "eggs": 2 },
  { "name": "Henrietta", "age": 3, "eggs": 1 },
  { "name": "Audrey", "age": 2, "eggs": 0 },
  { "name": "Mabel", "age": 5, "eggs": 1 },
]



# def count_eggs(list):
#     total_eggs = 0

#     for chicken in list:
#         total_eggs += chicken ['eggs']
#         chicken ['eggs'] = 0

#     return(f'{total_eggs} eggs collected')

# print(count_eggs(chickens))

def find_chicken_by_name(list, chicken_name):
    found_chicken = None
    for chicken in list:
        if chicken['name'] == chicken_name:
            found_chicken =chicken
    return found_chicken
        
        
print(find_chicken_by_name(chickens, 'Mabel'))