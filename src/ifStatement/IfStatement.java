package ifStatement;

public class IfStatement {
    public static void main(String[] args) {
        // TODO: If Statement
        var nilaiAbsen = 55;
        var nilaiAkhir = 90;

        if(nilaiAbsen >= 75 && nilaiAkhir >= 75) {
            System.out.println("Selamat anda lulus!");
        }

        if(nilaiAbsen >= 75 && nilaiAkhir >= 75) {
            System.out.println("Nilai anda A");
        } else if(nilaiAbsen >= 65 && nilaiAbsen < 75) {
            System.out.println("Nilai anda B");
        } else {
            System.out.println("Nilai anda C");
        }
    }
}
