# Write your solution here

# Please write a program which asks the user for an integer number. 
# If the number is divisible by three, the program should print out Fizz. 
# If the number is divisible by five, the program should print out Buzz. 
# If the number is divisible by both three and five, the program should print out FizzBuzz.

number = int(input("Number: "))

if number % 3 == 0 and number % 5 == 0:
    print("FizzBuzz")
elif number % 5 == 0:
    print("Buzz")
elif number % 3 == 0:
    print("Fizz")
