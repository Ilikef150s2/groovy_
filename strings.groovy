class GroovyTut{
  static void main (String[] args){
  
     def name = "Derek"
     def multiString = '''We're the best
     programmers in the world!!!'''
     
     println('I am ${name}\n');
     println("I am ${name}\n")
     //Single quotes mean that the variable will taken literally. So the Derek will be ignored
     //Double quotes will print the Derek
     //Triple quotes, used for multiline string. It prints it exactly as its typed.
     
     println("3rd Index of name" = name[3]);
     println(Index of r " + name.indexOf('r));
     
     println(1st 3 Chars " + name[0..2]);
     
     println (multiString)
  }
}
