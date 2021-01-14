import java.io.*;
import java.util.*;

public class baekjoon_11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2= br.readLine();

        int people = Integer.parseInt(s1);
        StringTokenizer st = new StringTokenizer(s2,  " ");
        ArrayList<Integer> arr = new ArrayList<Integer>();


        while(st.nextToken() != null){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        arr.sort(true);

    }
}
