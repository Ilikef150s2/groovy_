class GroovyTut{
    static void main (String[] args){

     //OUTPUT

//With double quotes we can insert variables
  
  def randString = "Random";
  println("A $randString string");
 
  // You can do the same thing with printf
  printf("A %s string \n", randString);
 
  // Use multiple values
  //The - sign with the 10s creates spaces to the right from the first item on the
  //listen, while the 10s gives spaces to the left.
  //.2f = defines two decimals. Where the "f" mean floating
  //"d" means integer.
  printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);
 
  /*
 
  // ---------- INPUT ----------
  print("Whats your name ");
  def fName = System.console().readLine();
  println("Hello " + fName);
 
  // You must cast to the right value
  // toInteger, toDouble
  print("Enter a number ");
  def num1 = System.console().readLine().toDouble();
  print("Enter another ");
  def num2 = System.console().readLine().toDouble();
  printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
 
  */
