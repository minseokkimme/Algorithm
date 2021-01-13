import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp_1046 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        double x = Integer.parseInt(st.nextToken());
        double y = Integer.parseInt(st.nextToken());
        double z = Integer.parseInt(st.nextToken());


        System.out.printf("%d\n", (int)(x + y + z));
        System.out.printf("%.1f", (x + y + z) / 3);


    }
}
