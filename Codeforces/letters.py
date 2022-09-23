def main():
    conj = set()
    text = list(input())
    for i in range(len(text)):
        if text[i] == "{" or text[i] == "}" or text[i] == "," or text[i] == " ":
            continue
        else:
            conj.add(text[i])
    print(len(conj))

if __name__ == '__main__':
    main()
