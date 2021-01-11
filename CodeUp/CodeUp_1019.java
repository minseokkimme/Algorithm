import java.io.*;
import java.util.*;

public class CodeUp_1019 {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s, ".");
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.printf("%04d" + "." + "%02d" + "." + "%02d", y, m, d);
    }
}
