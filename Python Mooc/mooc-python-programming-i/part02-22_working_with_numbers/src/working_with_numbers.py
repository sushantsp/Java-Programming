# Write your solution here

# Please write a program which asks the user for integer numbers. 
# The program should keep asking for numbers until the user types in zero.

print("Please type in integer numbers. Type in 0 to finish.")

numberCount = 0
sumNumbers = 0
posNumbers = 0
negNumbers = 0
while True:
    number = int(input('Number: '))

    if number == 0:
        break
    numberCount += 1
    sumNumbers += number

    if number > 0:
        posNumbers += 1
    else:
        negNumbers += 1

print(f"Numbers typed in {numberCount}")
print(f"The sum of the numbers is {sumNumbers}")
print(f"The mean of the numbers is {sumNumbers/numberCount}")
print(f"Positive numbers {posNumbers}")
print(f"Negative numbers {negNumbers}")