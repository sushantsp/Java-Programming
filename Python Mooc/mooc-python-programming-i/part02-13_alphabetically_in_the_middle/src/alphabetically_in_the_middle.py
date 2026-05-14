# Write your solution here

# 1st letter: x
# 2nd letter: c
# 3rd letter: p
# The letter in the middle is p

firstLetter = input("1st letter: ")
secondLetter = input("2nd letter: ")
thirdLetter = input("3rd letter: ")

if firstLetter > secondLetter > thirdLetter:
    print(f"The letter in the middle is {secondLetter}")
elif thirdLetter > secondLetter > firstLetter:
    print(f"The letter in the middle is {secondLetter}")
elif thirdLetter > firstLetter > secondLetter:
    print(f"The letter in the middle is {firstLetter}")
elif secondLetter > firstLetter > thirdLetter:
    print(f"The letter in the middle is {firstLetter}")
elif firstLetter > thirdLetter > secondLetter:
    print(f"The letter in the middle is {thirdLetter}")
elif secondLetter > thirdLetter > firstLetter:
    print(f"The letter in the middle is {thirdLetter}")