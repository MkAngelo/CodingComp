import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Recovery{
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=fs.nextInt();
        for(int tt=0; tt<T; tt++){
            int n = fs.nextInt();
            int[] arr_d = fs.readArray(n);
            for(int i=1; i<n; i++){
               arr_d[i] = arr_d[i] + arr_d[i-1];
            }
            for (int i : arr_d) {
                out.print(i + " ");
            }
            out.println();
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


