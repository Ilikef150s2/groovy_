class GroovyTut{
    static void main(String[] args){

        println("Hello world");
        def age = "Dog";
        age = 40;

        
        println("5 - 4 = " + (5 - 4));
        println("5 * 4 = " + (5 * 4));
        println("5 / 4 = " + (5 / 4));
        println("5 / 4 = " + (5.intdiv(4)));
        println("5 % 4 = " + (5 % 4));
        println("5 + 4 = " + (5.2 + 4.3));
        
        println("5.2 + 4.4 = " + (5.2.plus(4)));
        println("5 + 4 = " + (5..2.minus(4)));
        println("5 + 4 = " + (5.2.multiply(4.4)));
        println("5 + 4 = " + (5.2 / 4.4));
        
        println("age++ " + (age++));
        println("++age " + (++age));
        println("age-- " + (age--));
        println("--age " + (--age));
        
        println("Biggest Int " + Integer.MAX_VALUE);
        println("Smallest Int " + Integer.MIN_VALUE);
        
        println("Biggest Int " + Float.MAX_VALUE);
        println("Smallest Int " + Float.MIN_VALUE);
        
        println("Biggest Int " + Double.MAX_VALUE);
        println("Smallest Int " + Double.MIN_VALUE);
    }
}
