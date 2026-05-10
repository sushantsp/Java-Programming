# Write your solution here
# Celsius = (Fahrenheit − 32) × 5/9


tempFarenheit = int(input("Please type in a temperature (F): "))

tempCelcius = (tempFarenheit - 32) * (5/9)
print(f"{tempFarenheit} degrees Fahrenheit equals {tempCelcius} degrees Celsius")

if tempCelcius < 0:
    print("Brr! It's cold in here!")