// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 07/10/2022
// Assignment: Module 9 Assignment
// Purpose: Code examples
// References: Refer to Module 9 Paper

public class LambdaExpressions {

    public static void main(String args[]) {
        LambdaExpressions tester = new LambdaExpressions();

       //Lambda expression with the type declared
       MathOperation add = (int a, int b) -> a + b;

       //Lambda expression with no type declared
       MathOperation subtract = (a, b) -> a - b;

       //Lambda expression with curly brackets included in a return statement
       MathOperation multiply = (int a, int b) -> { return a * b; };
         
       //Lambda expression with no curly brackets included in a return statement
       MathOperation divide = (int a, int b) -> a / b;
       
       //Print results
       System.out.println("5 + 5 = " + tester.operate(5, 5, add));
       System.out.println("5 - 5 = " + tester.operate(5, 5, subtract));
       System.out.println("5 x 5 = " + tester.operate(5, 5, multiply));
       System.out.println("5 / 5 = " + tester.operate(5, 5, divide));

       //Lambda expression without parenthesis
       GreetingService greetService1 = name ->
       System.out.println("Welcome, " + name);

       //Lambda expression with parenthesis
       GreetingService greetService2 = (name) ->
       System.out.println("Welcome, " + name);
         
       greetService1.sayMessage("Maria");
       greetService2.sayMessage("Michaels");
    }

    interface MathOperation {
       int operation(int a, int b);
    }

    interface GreetingService {
       void sayMessage(String message);
    }
     
    private int operate(int a, int b, MathOperation mathOperation) {
       return mathOperation.operation(a, b);
    }
 }