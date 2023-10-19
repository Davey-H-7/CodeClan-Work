from models.event import Event
import datetime


event1 = Event(datetime.date(1994,1,2), "Dave's Birthday", 10, 'VIP', "The birth of our code's creator", True)
event2 = Event(datetime.date(2023, 8, 19), "Important Meeting", 20, 'Meeting Room', "Meeting Agenda: Discuss what a shambles CodeClan is", False)
event3 = Event(datetime.date(2024,7,5), "Basketball Finals", 100, 'Sports Hall', "Deciding match of the annual basketball tournament", True)


events = [event1, event2, event3]

def delete_event(event_name):
    event_to_delete = None
    for event in events:
        if event.name == event_name:
            event_to_delete = event
            break
    events.remove(event_to_delete)