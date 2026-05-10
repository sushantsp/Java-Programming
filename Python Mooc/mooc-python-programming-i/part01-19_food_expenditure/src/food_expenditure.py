# Write your solution here

timeInAWeek = int(input("How many times a week do you eat at the student cafeteria?" ))
lunchPrice = float(input("The price of a typical student lunch? "))
grocerySpend = float(input("How much money do you spend on groceries in a week? "))



print("Average food expenditure:")
print(f"Daily: {(grocerySpend + lunchPrice * timeInAWeek) / 7} euros")
print(f"Weekly: {grocerySpend + lunchPrice * timeInAWeek} euros")