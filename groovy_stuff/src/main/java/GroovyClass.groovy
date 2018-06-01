class GroovyClass {

    static void summ(int a, int b) {
        println("Groovy class is executing...")
        int c = a + b
        println("Sum result of " + a + " and " + b + " is: ")
        println(c)
    }

    static void main(String[] args) {
        summ(1,7)
    }

    static void meth(){

        assert format('String') == 'String'
    }
}
