# Write your solution here

# PIN: 3245
# Wrong
# PIN: 1234
# Wrong
# PIN: 0000
# Wrong
# PIN: 4321
# Correct! It took you 4 attempts
attempts = 0

while True:
    code = input("PIN: ")
    attempts += 1

    if code == "4321":
        success = True
        break

    print("Wrong")

if attempts == 1:
    print("Correct! It only took you one single attempt!")
else:
    print(f"Correct! It took you {attempts} attempts")