package core_labels;

import java.math.BigDecimal;
import java.util.Scanner;

public class Labels {

    private static void oddNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number till which you wanna get odd numbers: ");
        int num = scanner.nextInt();
        int var;

        for (var = 0; var <= num; var++) {
            if (var%2 != 0) {
                System.out.print(var + " ");
            }
        }
        System.out.println();
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer num = scanner.nextInt();
        System.out.println("Enter a power of the number: ");
        Integer pow = scanner.nextInt();

        System.out.println(BigDecimal.valueOf(Math.pow(num, pow)));
    }

    public static void main(String[] args) {
        oddNumbers();
        power();
    }

    private static void sort() {

    }
}
