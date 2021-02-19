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
        
        println("Math.round(2.45) = " + (Math.round(2.45)));
        println("randNum.pow(3) = " + (randNum.pow(3)));
        println("3.0 equals(2.0) = " + (3.0.equals(2.0)));
        println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
        println("Math.sqrt(9) " + (Math.sqrt(9)));
        println("Math.cbrt(27) = " + (Math.cbrt(27)));
        println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
        println("Math.floor(2.45) = " + (Math.floor(2.45)));
        println("Math.min(2,3) = " + (Math.min(2,3)));
        println("Math.max(2,3) = " + (Math.max(2,3)));
        
        println("Math.log(2) = " + (Math.log(2)));
        println("Math.log10(2) = " + (Math.log10(2)));
        
        println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
        println("Math.toRadians(90) = " + (Math.toRadians(90)));
        
        // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
        
        println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));
    }
}
