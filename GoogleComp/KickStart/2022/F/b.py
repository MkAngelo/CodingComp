from gc import set_debug


def main(tc):
    sol = 0
    D, N, X = map(int, input().split())
    seeds = []
    for _ in range(N):
        seeds.append(list(map(int, input().split()))) # Q, L, V
    
    for i in range(N):
        for j in range(i+1,N):
            if seeds[i][1] < seeds[j][1]:
                temp = seeds[i][1]
                seeds[i][1] = seeds[j][1]
                seeds[j][1] = temp
            elif seeds[i][1] == seeds[j][1]:
                if seeds[i][2] < seeds[j][2]:
                    temp = seeds[i][1]
                    seeds[i][1] = seeds[j][1]
                    seeds[j][1] = temp

    aux = X
    for d in range(D,0):
        print(d)
        
    for elem in seeds:
        if elem[1] <= D and elem[1] <= X:
            sol += elem[2]
            X -= elem[1]
        X = aux
        D-=1
    print(f'Case #{tc}: {sol}')

if __name__ == '__main__':
    t = int(input())
    tc = 1
    while tc <= t:
        main(tc)
        tc+=1
