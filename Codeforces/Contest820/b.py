dicc = {
    '1':'a',
    '2':'b',
    '3':'c',
    '4':'d',
    '5':'e',
    '6':'f',
    '7':'g',
    '8':'h',
    '9':'i',
    '10':'j',
    '11':'k',
    '12':'l',
    '13':'m',
    '14':'n',
    '15':'o',
    '16':'p',
    '17':'q',
    '18':'r',
    '19':'s',
    '20':'t',
    '21':'u',
    '22':'v',
    '23':'w',
    '24':'x',
    '25':'y',
    '26':'z'
}

def main():
    n = int(input())
    code = input()
    ans = []
    for i in range(n):
        e = code[i]
        if e=='0':
            if i+1<len(code) and code[i+1] == '0':
                #ans.pop()
                e=code[i-1]+code[i]
            elif i+1<len(code) and code[i+1] != '0':
                ans.pop()
                ans.pop()
                e=code[i-2]+code[i-1]
            elif i+1==len(code):
                ans.pop()
                ans.pop()
                e=code[i-2]+code[i-1]

        for k,v in dicc.items():
            if e==k:
                ans.append(v)
    print(''.join(ans))

if __name__ == '__main__':
    t = int(input())
    while(t>0):
        main()
        t-=1