import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Template{
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=fs.nextInt();
        for(int tt=0; tt<T; tt++){
            long a,b,c,d;
            a=fs.nextLong();
            b=fs.nextLong();
            c=fs.nextLong();
            d=fs.nextLong();
            long x = a*d;
            long y = b*c;

            if(x==y){
                out.println(0);
            }else if(x==0 || y==0){
                out.println(1);
            }else if(x%y==0 || y%x==0){
                out.println(1);
            }else{
                out.println(2);
            }
        }
        out.close();
    }
    static class FScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while(!st.hasMoreTokens())
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n){
            int[] a = new int [n];
            for(int i=0; i<n; i++) a[i] = nextInt();
            return a;
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    } 
}


