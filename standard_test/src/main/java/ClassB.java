import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClassB extends ClassA implements Interface{

    List<String> list;
    Map<Integer, String> map;
    Set<Integer> set;

    public ClassB(List<String> list, Map<Integer, String> map, Set<Integer> set) {
        this.list = list;
        this.map = map;
        this.set = set;
    }

    public void bar() {

    }
}
