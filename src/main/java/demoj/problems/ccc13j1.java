package demoj.problems;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
@SuppressWarnings("resources")

public class ccc13j1 {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader( System.in ));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(b + (b-a));
    }
}