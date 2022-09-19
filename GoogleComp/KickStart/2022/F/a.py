def main():
    sol = 0
    times = int(input())
    telas = []
    for _ in range(times):
        telas.append(list(input().split()))
        
    if times == 1:
        return 1
    
    telas_ind = telas #ord x index
    for i in range(times):
        for j in range(i+1, times):
            if int(telas_ind[i][2]) > int(telas_ind[j][2]):
                temp = telas_ind[i]
                telas_ind[i] = telas_ind[j]
                telas_ind[j] = temp

    telas_lex = sorted(telas) #ord lexicograf
    telas_dur = telas #ord x dur

    for i in range(times):
        for j in range(i+1,times):
            if int(telas_dur[i][1]) > int(telas_dur[j][1]):
                temp = telas_dur[i]
                telas_dur[i]=telas_dur[j]
                telas_dur[j]=temp

    for i in range(times):
        if telas_ind[i] == telas_lex[i] and telas_ind[i] == telas_dur[i]:
            sol += 1

    return sol

if __name__ == '__main__':
    t = int(input())
    tc = 1
    while tc <= t:
        print(f'Case #{tc}: {main()}')
        tc+=1
