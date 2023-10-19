from person import Person
from plane import Plane
from airport import Airport

person1 = Person('Agatha', 77, 887, 40.00)
person2 = Person('Rick', 39, 887, 10.00)
person3 = Person('Jamie', 19, 887, 200.00)
person4 = Person('Bertha', 4, 886, 5.00)

airport = Airport('Glasgow')
plane1 = Plane(887, 'Twin Prop', 2)

airport.add_person(person1)
airport.add_person(person2)
airport.add_person(person3)
airport.add_person(person4)
print (f'There are {airport.how_many_people()} people in the lounge')

airport.sweetie_tax()
print (person1.cash)
print (person2.cash)
print (person3.cash)
print (person4.cash)

airport.boarding(plane1)
print (f'There are now {airport.how_many_people()} people in the lounge')
print (f'There are {plane1.how_many_people()} people on the plane')

