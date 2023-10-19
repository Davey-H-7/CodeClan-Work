#SET variable animal = INPUT "What is your favourite animal? "
#IF animal is "sloth"
#   Then PRINT "This is my favourite animal too!"
#ELSE IF animal is "dog"
#   THEN PRINT "I like dogs too"
#ELSE
#   Then PRINT "You have bad taste in animals"
#END

animal = input("What is your favourite animal? ")
if animal == "sloth":
    print("This is my favourite animal too!")
elif animal == "dog":
    print("I like dogs too")
else:
    print("You have bad taste in animals")

