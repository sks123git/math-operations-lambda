//Program to do math operations using lambda
@FunctionalInterface
//Created functional interface
interface IMathFunction{
    int calculate(int a, int b);
}
public class MathApp {
    public static void main(String[] args) {

        IMathFunction add = (a,b) -> a+b;
        IMathFunction subtract = (a,b) -> a-b;
        IMathFunction multiply = (a,b) -> a*b;
        IMathFunction divide = (a,b) -> a/b;

        System.out.println("Adding numbers "+ add.calculate(2,3));
    }
}
