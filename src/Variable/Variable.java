package Variable;

public class Variable {
    public static void main(String[] args) {
        String name = "Thomas Alberto";
        int age = 20;

        name = "Thomas Ganteng";
        System.out.println("Hello " + name + ", you are " + age + " years old");

        // Kata Kunci Var
        var firstName = "Thomas";
        var lastName = "Alberto";

        System.out.println(firstName + " " + lastName);

        // Kata kunci final (tidak bisa di ubah)
        final String hobby = "Programming";
        System.out.println(hobby);

        final var address = "Indonesia";
        System.out.println(address);
    }
}
