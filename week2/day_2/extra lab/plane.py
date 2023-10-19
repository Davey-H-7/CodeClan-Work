class Plane:

    def __init__ (self, flight_number, type, capacity):
        self.flight_number = flight_number
        self.type = type
        self.capacity = capacity
        self.passengers = []

    def add_passenger(self, passenger):
        self.passengers.append(passenger)

    def remove_passenger(self, passenger):
        self.passengers.remove(passenger)

    def empty_plane (self):
        self.passengers.clear()

    def how_many_people(self):
        return len(self.passengers)

    def capacity_check(self):
        if self.capacity > len(self.passengers): 
            return True
        else:
            return False