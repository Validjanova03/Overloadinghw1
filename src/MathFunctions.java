//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MathFunctions {
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
    static int abs(int a) {
        return (a<0) ? -a : a;
    }
    static double pow(int a, int b) {
        return Math.pow(a, b);

    }

    public static void main(String[] args) {
        System.out.println(add(5,2)+" Addition ");
        System.out.println(sub(5,2)+" Subtraction");
        System.out.println(mul(5,2)+" Multiplication");
        System.out.println(div(6,2)+" Division");
        System.out.println(abs(-5)+" Absolute Value");
        System.out.println(pow(5,2)+" Power");

    }
}