import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Letters{
    public static void main(String[] args) {
        FScanner fs=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] chars = text.toCharArray();
        HashSet<Character> conjunto = new HashSet<Character>();
        for(char ch : chars){
            if(ch != ' ' && ch != ',' && ch != '{' && ch != '}')
                conjunto.add(ch);
                //out.println(ch);
        }
        out.println(conjunto.size());
        sc.close();
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


