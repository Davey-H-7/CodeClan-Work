from flask import Flask, render_template, request, redirect
from flask import Blueprint
from models.user import User
import repositories.user_repository as user_repository
import repositories.location_repository as location_repository
import pdb

users_blueprint = Blueprint("users", __name__)

@users_blueprint.route("/users")
def users():
    users = user_repository.select_all() # NEW
    return render_template("users/index.html", users = users)

@users_blueprint.route("/users/<id>")
def show(id):
    user = user_repository.select(id)
    locations = location_repository.location_for_user(user)
    return render_template("users/show.html", user=user, locations = locations)
