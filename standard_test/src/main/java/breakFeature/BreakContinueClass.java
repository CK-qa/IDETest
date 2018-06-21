package breakFeature;

import java.util.Arrays;
import java.util.List;

public class BreakContinueClass {

    class Break {

        public void simpleForLoopBreak() {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    break;
                }
            }
        }

        public void innerForLoopBreak() {
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                for (int colNum = 0; colNum < 4; colNum++) {
                    if (colNum == 3) {
                        break;
                    }
                }
                if (rowNum == 0) {
                    break;
                }
            }
        }

        public void outerForLoopBreak() {
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                for (int colNum = 0; colNum < 4; colNum++) {
                    simpleForLoopBreak();
                }
                if (rowNum == 2) {
                    break;
                }
            }
        }

        public void whileLoopBreak() {
            int i = Integer.MAX_VALUE;
            while (i < 10) {
                if (i == 5) {
                    break;
                }
            }
        }

        public void doWhileLoopBreak() {
            List<String> list = Arrays.asList("pewpew", "lalalal", "ololol");
            do {
                for (String blah: list) {
                    if (blah.equals("pewpew")) {
                        break; // move on to next iteration
                    }

                    if (blah.equals("ololo")) {
                        list.remove(blah);
                    }
                }

            }
            while (true && true);
        }

        public void switchCaseLoopBreak() {
            List<String> week = Arrays.asList("mn", "tue", "wed", "th", "fr", "sat", "sun");
            String weekday = null;
            switch (weekday) {
                case "mn":
                    System.out.println("Monday!");
                case "tue":
                    System.out.println("Tuesday!");
                case "wed":
                    System.out.println("Wednesday");
                case "th":
                    System.out.println("thursday");
                case "fr":
                    System.out.println("TGI Friday!");
                case "sat":
                    break;
                case "sun":
                    break;
            }
        }

        public void labeledForLoopBreak() {
            compare:
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                for (int colNum = 0; colNum < 4; colNum++) {
                    if (rowNum == 1 && colNum == 3) {
                        break compare;
                    }
                }
            }
        }

        public void labeledForLoopBreak2() {
            int[][] arr = {{1, 2}, {3, 4}, {9, 10}, {11, 12}};
            boolean found = false;
            int row = 0;
            int col = 0;
            // find index of first int greater than 10
            searchint:

            for (row = 0; row < arr.length; row++) {
                for (col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] > 10) {
                        found = true;
                        // using break label to terminate outer statements
                        break searchint;
                    }
                }
            }
            if (found)
                System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
        }

        public void labeledWhileLoopBreak() {
            boolean testExpression = true;
            boolean test = false;
            int x = 10;
            while (testExpression) {
                // codes
                second:
                while (testExpression) {
                    // codes
                    while (testExpression && (x <= 5)) {
                        System.out.println("pewpew");
                        break second;
                    }
                }
                // control jumps here
            }
        }

        @SuppressWarnings("LoopStatementThatDoesntLoop")
        public void labeledForLoopBreak3() {
            first:
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                second:
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                    break first;
                }
            }
        }

        public void labeledDoWhileLoopBreak() {
            List<String> list = Arrays.asList("pewpew", "lalalal", "ololol");
            do {
                pewpew:
                for (String blah: list) {
                    if (blah.equals("pewpew")) {
                        break pewpew; // move on to next iteration
                    }

                    if (blah.equals("ololo")) {
                        list.remove(blah);
                    }
                }

            }
            while (true && true);
        }
    }


    class Continue {

        public void unlabeledForLoopContinue() {
            int counter = 0;
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                for (int colNum = 0; colNum < 4; colNum++) {
                    if (colNum != 3) {
                        continue;
                    }
                    counter++;
                }
            }
        }

        public void unlabeledWhileLoopContinue() {
            String s = "sss";
            while (true) {
                if (s.isEmpty() || s.endsWith("s"))
                    continue;
                // More code here
            }
        }

        public void unlabeledDoWhileLoopContinue() {
            int i = 0;
            int y = 0;
            do {
                i++;
                if (i > 100) {
                    continue;
                }
                y++;

            } while (i < 500);
            System.out.printf("i=%d, y=%d %n", i, y);
        }

        public void labeledOuterForLoopContinue() {
            int counter = 0;
            compare:
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                for (int colNum = 0; colNum < 4; colNum++) {
                    if (colNum == 3) {
                        counter++;
                        continue compare;
                    }
                }
            }
        }

        public void labeledInnerForLoopContinue() {
            int counter = 0;
            compare:
            for (int rowNum = 0; rowNum < 3; rowNum++) {
                tadann:
                for (int colNum = 0; colNum < 4; colNum++) {
                    if (colNum == 3) {
                        counter++;
                        continue tadann;
                    }
                }
            }
        }

        public void labeledWhileLoopContinue() {
            StringBuilder sb = new StringBuilder();
            String s = sb.append("qqq").toString();
            ll: while (true) {
                if (s.isEmpty() || s.endsWith("s"))
                    continue ll;
                // More code here
            }
        }


        public void labeledDoWhileLoopContinue() {
            label:
            do {
                System.out.println("Hello world");
                continue label;
            } while (false);

        }
    }
}