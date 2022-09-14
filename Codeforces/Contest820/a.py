def main():
    a,b,c = map(int, input().split())
    t_a = a - 1
    t_b = 0
    if c>b:
        t_b = (c-b)+(c-1)
    elif  b==c:
        if c==1:
            t_b = 0
        else:
            t_b = c-1
    elif b>c:
        if c == 1:
            t_b = b-c
        else:
            t_b = (b-c)+(c-1)

    if t_a==t_b:
        return 3
    elif t_a<t_b:
        return 1
    elif t_b<t_a:
        return 2

if __name__ == '__main__':
    t = int(input())
    while(t>0):
        print(main())
        t-=1