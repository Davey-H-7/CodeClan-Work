from flask import Flask
from controllers.tasks_controller import tasks_blueprint
from flask import render_template
from models.task_list import tasks

app = Flask(__name__)
app.register_blueprint(tasks_blueprint)

