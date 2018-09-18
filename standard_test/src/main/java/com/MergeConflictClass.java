package com;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MergeConflictClass extends Demo {

    void method() {
        String c = "ololo";
    }

    String c1 = "ololo";
    String c2 = "ololo";
    String c3 = "ololo";
    String c4 = "ololo";

    void method1() {
        String c5 = "ololo";
    }

    String c6 = getOlolo();

    @NotNull
    private String getOlolo() {
        return "ololo";
    }

    String c7 = "ololo";
    String c8 = "ololo";
    String c9 = "ololo";
    String c10 = "ololo";
    String c11 = "ololo";

    void test() {
        System.out.println("ololo");
    }

    String c13 = "ololo";
    String c14 = "ololo";
    String c15 = "ololo";
    String c16 = "ololo";
    String c17 = "ololo";
    static String c18 = "ololo";

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