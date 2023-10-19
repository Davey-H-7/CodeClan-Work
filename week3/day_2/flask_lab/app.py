from flask import Flask
from controllers.controller import orders_blueprint



app = Flask(__name__)
from controllers import controller
app.register_blueprint(orders_blueprint)



if __name__ =='__main__':
    app.run(debug=True)





