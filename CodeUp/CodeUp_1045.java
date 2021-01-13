import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp_1045 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        double n = Integer.parseInt(st.nextToken());
        double m = Integer.parseInt(st.nextToken());


        System.out.println((int)(n + m));
        System.out.println((int)(n - m));
        System.out.println((int)(n * m));
        System.out.println((int)(n / m));
        System.out.println((int)(n % m));
        System.out.printf("%.2f", n / m);


    }
}
