import java.io.*;

public class CodeUp_1025 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        bw.write( "["+ String.valueOf(((n /10000)) * 10000) + "]");
        bw.newLine();
        bw.write("[" + String.valueOf(((n /1000) % 10) * 1000) + "]");
        bw.newLine();
        bw.write(String.valueOf("[" + ((n /100) % 10) * 100) + "]");
        bw.newLine();
        bw.write(String.valueOf("[" + ((n /10) % 10) * 10) + "]");
        bw.newLine();
        bw.write("[" + String.valueOf((n % 10)) + "]");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
