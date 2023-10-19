#PRINT ("Please turn on your computer on")
#SET variable boot = INPUT("Did the computer boot up? (y/n)")
#IF boot is y
#   THEN PRINT ("Please login with your password")
#ELSE
#   THEN SET variable plug = INPUT("Is the computer plugged in? (y/n) "")
#   IF plug is y
#       THEN PRINT "The computer is broken"
#   ELSE
#       THEN PRINT "Plug it in"
#       SET variable fix =INPUT("Did this fix the problem? (y/n) ")
#           IF fix is y
#               THEN PRINT ("Please login with your password")
#           ELSE PRINT ("The computer is broken")

print ("Please turn the computer on")
boot = input("Did the computer boot up? (y/n)")
if boot == "y":
    print("Please login with your password")
else:
    plug = input("Is the computer plugged in? (y/n)")
    if plug == "y":
        print ("The computer is broken")
    else:
        print ("Plug it in")
        fix = input("Did this fix the problem? (y/n)")
        if fix =="y":
            print ("Please login with your password")
        else:
            print("The computer is broken")


