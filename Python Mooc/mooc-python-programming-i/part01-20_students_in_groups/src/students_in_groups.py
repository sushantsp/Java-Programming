# Write your solution here

numberOfStudents = int(input("How many students on the course? "))
groupSize = int(input("Desired group size? "))


print(f"Number of groups formed: {(numberOfStudents+groupSize-1)//groupSize}")



