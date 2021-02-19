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
     
     println("3rd Index of Name" = name[3]);
     println("Index of r " + name.indexOf('r'));
     
     println("1st 3 Chars " + name[0..2]);
     
     println (multiString)
    
     println("Every Other Character " + name[0,2,4])
    
     println("Substring at 1 " + name.substring(1));
    
    println("Substring at 1 to 4 " + name.substring(1,4));
 
    println("My Name " + name);
    println("My Name ".concat(name));
 
  
    def repeatStr = "What I said is " * 2;
    println(repeatStr);
 
     println("Derek == Derek : " + ('Derek'.equals('Derek')));
     println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));
 
    println("Size " + repeatStr.length());
 
   // Remove first occurance
   println(repeatStr - "What");
 
  // Split the string
    println(repeatStr.split(' '));
    println(repeatStr.toList());
 
  // Replace all strings
    println(repeatStr.replaceAll('I', 'she'));
 
  // Uppercase and lowercase
    println("Uppercase " + name.toUpperCase());
    println("Lowercase " + name.toLowerCase());
 
  // <=> returns -1 if 1st string is before 2nd
  // 1 if the opposite and 0 if equal
   println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
    println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
   println("Ant <=> Ant " + ('Ant' <=> 'Ant'));
  }
}
