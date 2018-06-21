package core_labels;


import com.sun.xml.internal.ws.api.message.Attachment;

import java.util.List;


public class WrappingLines extends Duplicates {
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
            for (int j = 0; j < 10; j++) {
                System.out.println("ololo");
            }
        }
    }

    @Override

    public void test() {
        super.test();
    }
    
}