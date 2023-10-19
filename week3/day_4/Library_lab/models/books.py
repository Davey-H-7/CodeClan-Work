from models.book import Book
from flask import request

book1 = Book('Commuting via Firstbus', 'Steve', 'Horror')
book2 = Book('The Two Towers', 'J.R.R Tolkien', 'Fantasy')
book3 = Book('Friends Like These', 'Danny Wallace', 'Comedy')

books = [book1, book2, book3]

def add_book():
    book_title = request.form['title']
    book_author = request.form['author']
    book_genre = request.form['genre']
    new_book = Book(book_title, book_author, book_genre)
    books.append(new_book)

def remove_book(book_title):
    book_found = None
    for book in books:
        if book.title == book_title:
            book_found = book
            break
    books.remove(book_found)

def check_out_book(book_title):
    book_to_check_out = None
    for book in books:
        if book.title == book_title:
            book_to_check_out = book
            break
    book_to_check_out.checked_out = True

def check_in_book(book_title):
    book_to_check_in = None
    for book in books:
        if book.title == book_title:
            book_to_check_in = book
            break
    book_to_check_in.checked_out = False
