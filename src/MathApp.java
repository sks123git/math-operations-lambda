//Program to do math operations using lambda
@FunctionalInterface
//Created functional interface
interface IMathFunction{
    int calculate(int a, int b);
    static void printResult(int a, int b, String functionName, IMathFunction obj){
        System.out.println("Result of "+functionName+" is "+obj.calculate(a,b));
    }
}
public class MathApp {
    public static void main(String[] args) {
        //Lambda expression for math operations
        IMathFunction add = (a,b) -> a+b;
        IMathFunction subtract = (a,b) -> a-b;
        IMathFunction multiply = (a,b) -> a*b;
        IMathFunction divide = (a,b) -> a/b;

        System.out.println("Adding numbers "+ add.calculate(2,3));
        System.out.println("Subtracting numbers "+ subtract.calculate(2,3));
        System.out.println("Multiply numbers "+ multiply.calculate(2,3));
        System.out.println("Divide numbers "+ divide.calculate(2,3));

       IMathFunction.printResult(4,2,"addition",add);
    }
}
