# Write your solution here
# Please write a program which keeps asking the user for words.
# If the user types in end, the program should print out the story the words formed, and finish.

text = ""
prevWord =''
while True:
    word = input("Please type in a word: ")

    if word == 'end':
        break
    if word == prevWord:
        break

    text += word + ' '
    prevWord = word

print(text)