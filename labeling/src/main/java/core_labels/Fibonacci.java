package core_labels;

import org.apache.commons.collections4.map.HashedMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static Map<Integer, Integer> map = new HashedMap<Integer, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        System.out.println(fibMemo(n));
        System.out.println(fibBotUp(n));

    }

    private static int fibBotUp(int n) {
        Map<Integer, Integer> fib = new HashMap<Integer, Integer>();
        for (int i = 1; i < n + 1; i++) {
            int f = 1;
            if (i <= 2) {
                f = 1;
            } else {
                f = fib.get(i - 1) + fib.get(i - 2);
            }
            fib.put(i, f);
        }
        return fib.get(n);
    }

    private static int fibMemo(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        int f;

        if (n <= 2) {
            f = 1;
        } else {
            f = fibMemo(n - 1) + fibMemo(n - 2);
        }
        return f;
    }
}
