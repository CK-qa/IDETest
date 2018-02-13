package core_labels;

import java.util.ArrayList;
import java.util.List;

public class Labels extends Parent {

    static private List<String> lbls = new ArrayList<String>();

    public static List<String> fillArr() {
        for (int i = 0; i < 10; i++) {
            lbls.add("L" + i);
        }
        return lbls;
    }


}
