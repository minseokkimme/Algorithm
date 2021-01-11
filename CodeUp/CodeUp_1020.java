import java.io.*;
import java.util.*;

public class CodeUp_1020 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, "-");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        System.out.printf("%06d %07d", a, b);

    }
}
