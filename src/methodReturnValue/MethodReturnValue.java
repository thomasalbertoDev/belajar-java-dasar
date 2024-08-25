package methodReturnValue;

public class MethodReturnValue {
    public static void main(String[] args) {
        var nilai1 = 10;
        var operator = "+";
        var nilai2 = 20;

        System.out.println(hitung(nilai1, operator, nilai2));
    }

    static int hitung(int a, String operator, int b){
        return switch(operator){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
