package methodOverloading;

public class MethodOverloading {

    // Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
    //Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
    
    public static void main(String[] args) {
        sayHello();
        sayHello("Thomas");
        sayHello("Thomas", "Alberto");
    }

    static void sayHello() {
        System.out.println("Hello World!");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + "!");
    }
}
