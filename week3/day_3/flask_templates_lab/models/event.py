import datetime;

class Event:

    def __init__(self, date, name, number_of_guests, room, description, repeats):
        self.date = date
        self.name = name
        self.number_of_guests = number_of_guests
        self.room = room
        self.description = description
        self.repeats = repeats