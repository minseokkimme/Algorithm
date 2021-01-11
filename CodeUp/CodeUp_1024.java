import java.io.*;

public class CodeUp_1024 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] c = s.split("");

        for(int i = 0; i < s.length(); i++){
            bw.write("'" + c[i] + "'");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
