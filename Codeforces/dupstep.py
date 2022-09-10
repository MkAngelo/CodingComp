def main():
    s = input()
    flag = 1
    ns = ''
    for i in range(len(s)):
        if s[i]=='W' and s[i+1]=='U' and s[i+2]=='B':
            ns+=' '
        else:
            flag=0
            ns+=s[i]
    print(ns)

if __name__ == '__main__':
    main()
