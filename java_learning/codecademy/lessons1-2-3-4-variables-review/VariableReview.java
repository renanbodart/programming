public class VariableReview {
  public static void main(String[] args) {
    /*We store information (data) in variables, named locations in memory. Variables also give context and meaning to the data we’re storing. Our programs will also use Strings, which are objects, instead of primitives. Objects have built-in behavior. Strings hold sequences of characters*/
    String name = "Deckard";
    /*There are three primitive datatypes built-in to the Java system. The three main primitive types:
     * 1 - int: The first type of data we will store is the whole number Ex: number 22 (The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive)
     * 2 - double: can hold decimals as well as very large and very small numbers. The maximum value is 1.797,693,134,862,315,7 E+308, which is approximately 17 followed by 307 zeros. The minimum value is 4.9 E-324, which is 324 decimal places!
     * 3 - boolean: These questions are answered with a boolean, a type that references one of two values: true or false.
     */
    int age = 35;
    double salary = 50000.87;
    boolean IsSalaryMoreThan = salary >= 45000;
    System.out.println(name);
    System.out.println(age);
    System.out.println(salary);
    System.out.println("The salary is more than $45.000? " + IsSalaryMoreThan);
  }
}
