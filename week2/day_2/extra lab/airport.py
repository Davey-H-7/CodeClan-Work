class Airport:

    def __init__(self, name):
        self.name = name
        self.lounge = []
        self.shop ={
                    "M&Ms": 5.00,
                    "Shitty headphones": 400.00,
                    "Mechanically reclaimed floor sweepings sandwich": 150.00,
                    "Copy of Roger's Profanisaurus": 20.00}
    
    def boarding(self, plane):
        rejects = []
        for passenger in self.lounge:
            if plane.flight_number == passenger.boarding_pass and plane.capacity_check() == True:
                plane.add_passenger(passenger)
            else:
                rejects.append(passenger)
        self.lounge = rejects
        
    def remove_person(self,person):
        self.lounge.remove(person)

    def add_person(self,person):
        self.lounge.append(person)

    def how_many_people(self):
        return len(self.lounge)
    
    def sweetie_tax(self):
        for passenger in self.lounge:
            passenger.cash -= self.shop['M&Ms']