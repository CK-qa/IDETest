package core_labels;

import java.util.*;

public class LabelsImpl extends Labels {
    LabelsImpl labels = (LabelsImpl) new Labels();


    public LabelsImpl getLabels() {
        return labels;
    }

    public void setLabels(LabelsImpl labels) {
        this.labels = labels;
    }


    static List<String> array = Arrays.asList("label1", "label2", "label3");
    static List<String> entries = Arrays.asList("one", "two", "Three");

    static Map map = Collections.EMPTY_MAP;

    private static void meth(Map<String, String> mapp, List<String> l1, List<String> l2) {
        if (l1.size() == l2.size()) {
                mapp.put(l1.get(1), l2.get(1));
            }
            System.out.println(mapp);
        }


    public static void main(String[] args) {
        meth(map, array, entries);
    }
}
