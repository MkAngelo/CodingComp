def main():
    length = int(input())
    word = input().lower()
    
    if length < 26:
        return "NO"
    
    pangram = set(word)

    if len(pangram) < 26:
        return "NO"
    else:
        return "YES"

print(main())
