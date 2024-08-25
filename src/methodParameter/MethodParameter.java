package methodParameter;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Thomas", "Alberto");
    }

    static void sayHello(String firstName, String lastName){

        System.out.println("Hello " + firstName + " " + lastName);
    }
}
