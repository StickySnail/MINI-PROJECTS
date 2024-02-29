from flask import Flask
from flask_sqlalchemy import SQLAlchemy
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

# specify the location to save database
app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///mydatabase.db"
# not ganna track all the updates in the db
app.config["SQLALCHEMY_TRACK_MODIFICIATIONS"] = False

db = SQLAlchemy(app)
