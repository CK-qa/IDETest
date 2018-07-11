import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for (int j = 0; j < 25; j++) {
            System.out.print(sb.append(str));
        }
    }

    public static void main(String[] args) throws IOException {
        test();
    }
}