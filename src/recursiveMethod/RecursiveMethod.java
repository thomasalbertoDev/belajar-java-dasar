package recursiveMethod;

public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    // Recursive Method merupakan method yang memanggil dirinya sendiri
    static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
