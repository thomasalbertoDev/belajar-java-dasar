package switchStatement;

public class SwitchStatement {

    public static void main(String[] args) {
        // TODO: Switch Case Statement

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Nilai anda A");
                break;
            case "B":
                System.out.println("Nilai anda B");
                break;
            case "C":
                System.out.println("Nilai anda C");
                break;
            default:
                System.out.println("Nilai anda D");
                break;
        }

        // TODO: Switch Lambda Statement
        switch (nilai) {
            case "A" ->
                System.out.println("Nilai anda A");
            case "B" ->
                System.out.println("Nilai anda B");
            case "C" ->
                System.out.println("Nilai anda C");
            default ->
                System.out.println("Nilai anda D");
        }

        // TODO: Swicth Yield Statement

        String ucapan;
        ucapan = switch(nilai){
            case "A": yield "Selamat anda lulus";
            case "B": yield "Selamat anda lulus";
            case "C": yield "Selamat anda lulus";
            default: yield "Selamat anda tidak lulus";
        };
        
        System.out.println(ucapan);
    }
}
