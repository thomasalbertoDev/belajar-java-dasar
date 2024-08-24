package operasiBoolean;

public class OperasiBoolean {
    public static void main(String[] args) {
        // TODO: Operasi Boolean
        int nilaiAbsen = 80;
        int nilaiAkhir = 75;

        boolean lulusAbsen = nilaiAbsen >= 75;
        boolean lulusAkhir = nilaiAkhir >= 75;
        boolean lulus = lulusAbsen && lulusAkhir;

        System.out.println(lulus);
    }
}
