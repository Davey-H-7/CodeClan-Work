from flask import Blueprint, render_template, redirect
from models.books import *
from models.book import Book

books_blueprint = Blueprint('books', __name__)


@books_blueprint.route('/')
def index():
    return render_template('index.html', title = 'Home')

@books_blueprint.route('/books')
def books_index():
    return render_template('books/index.html', title = 'All Books', books = books)

@books_blueprint.route('/books/new')
def new_book():
    return render_template('/books/add.html', title ='Add a new book')

@books_blueprint.route('/books/new', methods = ['POST'])
def add():
    add_book()
    return redirect('/books')

@books_blueprint.route('/books/<index>')
def book(index):
    return render_template('books/show.html', book = books[int(index)])

@books_blueprint.route('/books/delete/<name>', methods =['POST'])
def remove(name):
    remove_book(name)
    return redirect('/books')

@books_blueprint.route('/books/check_in_out/<name>', methods =['POST'])
def check_in_out(name):
    if request.form['check'] == 'out':
        check_out_book(name)
    else:
        check_in_book(name)
    return redirect('/books')

