#include <bits/stdc++.h>
using namespace std;

void solve(){
    int n, temp;
    cin >> n;
    int a=0, b=0, c=0, d=0;
    for(int i=0; i<n; i++){
      cin >> temp;
      switch (temp) {
        case 1:
                a++;
                break;
        case 2:
                b++;
                break;
        case 3:
                c++;
                break;
        case 4: 
                d++;
                break;
        default:
                break;
      }
    }

    int taxi = 0;
    
    taxi += d;

    taxi += c;

    a -= c;
    if (a<0) a=0;

    if(b%2==0){
      b=b/2;
      taxi += b;
    }else{
      b=b/2 +1;
      taxi += b;
      a=a-2;
      if(a<0) a=0;
    }

    a = ceil(a/4.0);
    taxi += a;

    cout << taxi << endl;
}

int main(){
  solve();
}
