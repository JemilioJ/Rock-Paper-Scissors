import random
test = 1
end = 1
comp = 0
user = 0

print("First to 10 points wins!")

while(test!=0 and end == 1):
        print("")
        u = int(input("Play either rock(1), paper(2), or scissors(3): "))
        while(u<1 or u>3 or u==""):
                u = int(input("Play either rock(1), paper(2), or scissors(3): "))
        c = random.randint(1,3)
        if(u==1 and c==1):
                print("Both are rock! Try again?")
        elif(u==1 and c==2):
                print("Paper beats rock!")
                comp+=1
        elif(u==1 and c==3):
                print("Rock beats scissors!")
                user+=1
        elif(u==2 and c==1):
                print("Paper beats rock!")
                user+=1
        elif(u==2 and c==2):
                print("Both are paper! Try again?")
        elif(u==2 and c==3):
                print("Scissors beats paper!")
                comp+=1
        elif(u==3 and c==1):
                print("Rock beats scissors!")
                comp+=1
        elif(u==3 and c==2):
                print("Scissors beats paper!")
                user+=1
        elif(u==3 and c==3):
                print("Both are scissors Try again?!")
        print("")
        print("Your score is currently",user,"and your opponent's score is",comp,".")
        if(user >= 10):
                print("")
                print("YOU WON! Congratulations!")
                print("")
                end = 2
        if(comp >= 10):
                print("")
                print("You lost to your opponent!")
                print("")
                end = 3
        if(end==1):
                test = int(input("Press any number to play again, or press '0' to quit: "))
        
                
                
        

