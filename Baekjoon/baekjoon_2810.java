import java.io.*;

public class baekjoon_2810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c;
        int result = 0;
        String s = br.readLine();
        String sit = br.readLine();

        int n = Integer.parseInt(s);

        for(int i = 0; i < n; i++){
            c = sit.charAt(i);
            if(c == 'S'){
                result++;
            }else if(c == 'L'){
                result++;
                i++;
            }

            if(i == n - 1){
                result++;
            }
        }

        if(result > n){
            System.out.print(n);
        }else{
            System.out.println(result);
        }
    }
}
