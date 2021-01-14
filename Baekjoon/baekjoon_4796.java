import java.io.*;
import java.util.StringTokenizer;

public class baekjoon_4796 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        int i = 1;
        int result = 0;

        while(true){
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0) break;
            else{
                while(true){
                    int L1 = L;
                    int P1 = P;
                    int V1 = V;
                    result += (V1 / P1) * L;
                    V1 -= P1 * (V1 / P1);
                    if(V1 > L1){
                        result += L1;
                        break;
                    }else{
                        result += V1;
                        break;
                    }
                }
            }

            System.out.println("Case " + i + ": " + result);
            i++;
            result = 0;
        }


    }
}
