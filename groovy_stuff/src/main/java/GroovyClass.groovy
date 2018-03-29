class GroovyClass {

    static void sum(int a, int b) {
        println("Groovy class is executing...")
        int c = a + b
        println("Sum result of " + a + " and " + b + " is: ")
        println(c)
    }

    static void main(String[] args) {
        sum(1, 7)
    }
}
