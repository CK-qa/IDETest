package core_labels;

public class WrappingLines extends Duplicates{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            for (int j = 0; j < 10; j++) {
                System.out.println("pewpew");
            }
        }
    }

}