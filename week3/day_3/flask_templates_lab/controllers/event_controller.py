from flask import Blueprint, render_template, request, redirect
from models.events_list import events, delete_event
from models.event import Event

events_blueprint = Blueprint('events',__name__)

@events_blueprint.route('/events')
def index():
    return render_template('index.html', title = 'All Events', events = events)

@events_blueprint.route('/events/<index>')
def single_event(index):
    return render_template('event.html', event = events[int(index)])

@events_blueprint.route('/events', methods=['POST'])
def add_event():
    event_name = request.form['name']
    event_date = request.form['date']
    event_number_of_guests = request.form['number_of_guests']
    event_room = request.form['room']
    event_description = request.form['description']
    event_repeats = True if 'repeats' in request.form else False
    new_event = Event(event_date,event_name,event_number_of_guests,event_room, event_description, event_repeats)
    events.append(new_event)
    return redirect('/events')

@events_blueprint.route('/events/delete/<name>', methods=['POST'])
def delete(name):
    delete_event(name)
    return redirect('/events')

