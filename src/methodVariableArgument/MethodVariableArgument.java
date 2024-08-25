package methodVariableArgument;

public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Thomas Alberto", 75, 80, 85, 90, 95);
    }

    static void sayCongrats(String studentName, int... grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }

        String message = total >= 75 ? "Selamat, anda lulus!" : "Maaf, anda tidak lulus!";
        System.out.println(studentName + ": " + message);
    }
}
