package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassC extends Demo {

    void method() {
        String c = "ololo111111";
    }

    String c1 = "ololo111111";
    String c2 = "ololo111111";
    String c3 = "ololo111111";
    String c4 = "ololo111111";

    void method1() {
        String c5 = "ololo111111";
    }

    String c6 = "ololo111111";
    String c7 = "ololo111111";
    String c8 = "ololo111111";
    String c9 = "ololo1111111";
    String c10 = "ololo111111";
    String c11 = "ololo1111111";

    void test() {
        System.out.println("ololo1111111");
    }

    String c13 = "ololo1111111";
    String c14 = "ololo1111111";    String c15 = "ololo1111111";
    String c16 = "ololo1111111";
    String c17 = "ololo1111111";
    static String c18 = "ololo1111111";

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
        method(
                "s", 12
        );
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
                (
                        leftNode == null
                ) && (
                        rightNode == null
                );
    }

    public boolean isIs() {
        return leftNode.equals(rightNode);
    }

    private void testrrr() {
        while (isLeafNode() &&
                isIs()) {
            System.out.println("foo");
        }
    }

    private Boolean boo;

    private abstract class AbstractInnerClass {
        private Boolean aBoolean;
    }

    class InnerClassInClassC {

        public void foo() {
            System.out.println("foo!!!");
        }
    }
}