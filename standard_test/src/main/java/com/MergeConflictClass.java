package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MergeConflictClass extends Demo {

    void method() {
        String c = "pewpew";
    }

    String c1 = "pewpew";
    String c2 = "pewpew";
    String c3 = "pewpew";
    String c4 = "pewpew";

    void method1() {
        String c5 = "pewpew";
    }

    String c6 = "pewpew";
    String c7 = "pewpew";
    String c8 = "pewpew";
    String c9 = "pewpew";
    String c10 = "pewpew";
    String c11 = "pewpew";

    void test() {
        System.out.println("pewpew");
    }

    String c13 = "pewpew";
    String c14 = "pewpew";
    String c15 = "pewpew";
    String c16 = "pewpew";
    String c17 = "pewpew";
    static String c18 = "pewpew";

    public void foo() {
        for (
                int i = 0;
                i < 10;
                i++
        ) {
            for (
                    int j = 0; j < 13; j++
            ) {
                System.out.println(c1);
            }
        }
    }

    List<String> array = new ArrayList<String>();

    public void fillArr() {
        for (int i = 0; i < 10; i++) {
            array.add(i + "s");
        }
    }

    public void testt() {
        for (
                String s :
                array
        ) {
            System.out.println(s);

        }
    }

    private void method(
            String s, int a
    ) {
        System.out.println(s + a);
    }

    public void superMethod() {
        method("s", 12);
    }

    String path = "";

    public String trywithRes() throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            return br.readLine();
        }
    }

    int[] data = {
            10, 20, 30, 40, 50, 60, 71, 80, 90, 91
    };

    String leftNode;
    String rightNode;


    public boolean isLeafNode() {
        return
                (leftNode == null) && (rightNode == null);
    }

    public boolean isIs() {
        return leftNode.equals(rightNode);
    }

    private void testrrr() {
        while (isLeafNode() &&
                isIs()) {
            System.out.println("ololo");
        }
    }

    private Boolean boo;

    private abstract class AbstractInnerClass {
        private Boolean aBoolean;
    }

    class InnerClassInMergeConflictClass {

        public void foo() {
            System.out.println("pewpew");
        }
    }
}