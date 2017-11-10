userInput = str(raw_input("Enter a string: "))
key = int(raw_input("Enter key: "))

result = " "


for x in userInput:
    b = (chr(ord(x) + key))
    result += b


print(result)
