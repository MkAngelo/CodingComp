import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Caps{
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        PrintWriter out=new PrintWriter(System.out);

        String text = fs.next();

        if(text == text.toUpperCase() || text.equals(text.substring(0,1).toLowerCase() + text.substring(1).toUpperCase())){
            //out.println(text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase());
            for(char c:text.toCharArray()){
                if(c<97)
                    out.print(Character.toLowerCase(c));
                else
                    out.print(Character.toUpperCase(c));
            }
            out.print("\n");
        } else{
            out.println(text);
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


