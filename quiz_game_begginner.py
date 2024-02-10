print("Welcome to my computer quiz!")

playing = input("Do you want to play? < Yes : No > ")

if playing.casefold() != "yes":
    quit()    
    
print("Okay! Let's play!!")
score = 0
num_of_questions = 4

answer = input("What is 1+1? ")
if answer == "2":
    print("Correct!")
    score += 1
else:
    print("Incorrect!")
    
answer = input("What is 1+1? ")
if answer == "2":
    print("Correct!")
    score += 1
else:
    print("Incorrect!")
    
    
answer = input("What is 1+1? ")
if answer == "2":
    print("Correct!")
    score += 1
else:
    print("Incorrect!")
    
answer = input("What is 1+1? ")
if answer == "2":
    print("Correct!")
    score += 1
else:
    print("Incorrect!")
    
print("You got " + str(score) + " questions correct!")
print("You got " + str((score / num_of_questions) * 100) + "%.")