# Write your solution here



giftValue = int(input("Value of gift: "))

if giftValue < 5000:
    print("No tax!")
elif 5000 <= giftValue < 25000:
    print(f"Amount of tax: {100 + (giftValue - 5000) * 0.08} euros")
elif 25000 <= giftValue < 55000:
    print(f"Amount of tax: {1700 + (giftValue - 25000) * 0.1} euros")
elif 55000 <= giftValue < 200000:
    print(f"Amount of tax: {4700 + (giftValue - 55000) * 0.12} euros")
elif 200000 <= giftValue < 1000000:
    print(f"Amount of tax: {22100 + (giftValue - 200000) * 0.15} euros")
else:
    print(f"Amount of tax: {142100 + (giftValue - 1000000) * 0.17} euros")

