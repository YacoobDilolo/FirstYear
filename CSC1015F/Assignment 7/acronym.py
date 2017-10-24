words_to_ignore = input("Enter words to be ignored separated by commas:\n").lower()
a = words_to_ignore.split(", ")
sentence = input("Enter a title to generate its acronym:\n").lower()
b = sentence.split(" ")
xList = []
for i in range(len(b)):
    if b[i] not in a:
        xList.append(b[i][0])
print("The acronym is:",''.join(xList).upper())