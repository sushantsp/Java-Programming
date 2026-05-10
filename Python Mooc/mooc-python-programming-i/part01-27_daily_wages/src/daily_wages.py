# Write your solution here


hourlyWage = float(input("Hourly wage: "))
hoursWorked = int(input("Hours worked: "))
weekDay = input("Day of the week: ")


if weekDay == "Sunday":
    print(f"Daily wages: {hourlyWage * hoursWorked * 2} euros")

if weekDay != "Sunday":
    print(f"Daily wages: {hourlyWage * hoursWorked} euros")
