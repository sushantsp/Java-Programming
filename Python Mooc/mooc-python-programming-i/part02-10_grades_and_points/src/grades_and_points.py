# Write your solution here
grades = int(input("How many points [0-100]: "))

if grades < 0 or grades > 100:
    print("impossible!")
elif 0 <= grades <= 49:
    print("fail")
elif 50 <= grades <= 59:
    print("Grade: 1")
elif 60 <= grades <= 69:
    print("Grade: 2")
elif 70 <= grades <= 79:
    print("Grade: 3")
elif 80 <= grades <= 89:
    print("Grade: 4")
elif 90 <= grades <= 100:
    print("Grade: 5")
