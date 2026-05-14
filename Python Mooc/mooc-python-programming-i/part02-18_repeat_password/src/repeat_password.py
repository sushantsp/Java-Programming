# Write your solution here

# Password: sekred
# Repeat password: secret
# They do not match!
# Repeat password: cantremember
# They do not match!
# Repeat password: sekred
# 

password = input("Password: ")
while True:
    repeatPassword = input("Password: ")
    if password == repeatPassword:
        print("User account created!")
        break
    else:
        print("They do not match!")