import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Games{
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int counter = 0;
        int n = fs.nextInt();
        int[] colors = fs.readArray(n*2);
        for(int i=0; i<n*2; i+=2){
            for(int j=i+2; j<n*2; j+=2){
                if(colors[i] == colors[j+1])
                    counter++;
                if(colors[i+1] == colors[j])
                    counter++;
            }
        }
        out.println(counter);
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


