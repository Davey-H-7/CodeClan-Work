from flask import render_template, Blueprint
from models.orders import orders

orders_blueprint = Blueprint('orders', __name__)


@orders_blueprint.route('/orders')
def index():
    return render_template('index.html',title = 'Gamey_H', orders = orders)

@orders_blueprint.route('/orders/<index>')
def single_order(index):
    chosen_order = orders[int(index)]

    return render_template('order.html', title = 'Gamey_H', order = chosen_order)