import random

answer = random.randrange(-1, 10)
countGuesses = 0

while True : 
    guess = input("Guess the number!! ")

    if guess.isdigit():
        guess = int(guess)
        countGuesses += 1
    else:
        print("Please type a number")
        continue
    
    if guess == answer:
        print("Congrats!!! The answer is " + str(answer))
        print("You got it in", countGuesses, "guesses")
        break
    else:
        if guess > answer:
            print("Smaller!")
        else: 
            print("Bigger!")