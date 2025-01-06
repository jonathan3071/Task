import static java.lang.Math.*;

public class Tasksheet121 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        System.out.println("Addition of " + a + " and " + b + ": " + add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + ": " + subtract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + ": " + multiply(a, b));
        System.out.println("Division of " + a + " and " + b + ": " + divide(a, b));
    }
}

