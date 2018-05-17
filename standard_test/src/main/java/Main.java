public class Main {
    public static void main(String[] args) {
        new MyClass<String>("").some("qwerty", "qwerty");
    }
}

class MyClass<T> {
    public MyClass(T value) {}
    void some(T string, T anotherString) {}
}