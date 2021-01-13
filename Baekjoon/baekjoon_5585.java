import java.io.*;

public class baekjoon_5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s);
        int money = 1000 - n;
        int result = 0;

        result += money / 500;
        money %= 500;
        result += money / 100;
        money %= 100;
        result += money / 50;
        money %= 50;
        result += money / 10;
        money %= 10;
        result += money / 5;
        money %= 5;
        result += money / 1;
        money %= 1;

        System.out.print(result);
    }
}
