def main():
    n = int(input())
    l1 = list(map(int, input().split()))
    l2 = list(map(int, input().split()))

    n_v = []
    total = 0
    temp = 0
    for i in range(n):
        for j in range(1,n):
            if ((l1[i] + l1[j]) >= (l2[i] + l2[j])) and (j not in n_v):
                temp+=1
                n_v.append(j)
        if temp >= 1:
            total+=1
            temp=0

    print(total)

if __name__ == '__main__':
    t = int(input())
    while(t>0):
        main()
        t-=1