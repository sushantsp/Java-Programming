# Write your solution here
# Sample output
# Year: 2023
# The next leap year after 2023 is 2024


startYear = int(input("Year: "))
year = startYear
while True:

    year += 1

    if year % 4 == 0:
        if year % 100 == 0 and year % 400 == 0:
            print(f"The next leap year after {startYear} is {year}")
            break
        elif year % 100 == 0 and year % 400 != 0:
            pass
        else:
            print(f"The next leap year after {startYear} is {year}")
            break
    # else:
    #     print("That year is not a leap year.")

