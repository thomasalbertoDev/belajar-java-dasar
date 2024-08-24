package array;

public class Array {
    public static void main(String[] args) {
        // Array adalah tipe data yang berisikan kumpulan data yang memiliki tipe data yang sama
        // Array tidak memiliki method yang dapat menghapus data yang ada di dalamnya

        String[] arrayString = new String[3];
        arrayString[0] = "Thomas";
        arrayString[1] = "Alberto";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);

        // TODO: langsung menginisialisasi array nya
        String[] fullName = {
            "Thomas", "Alberto"
        };
        System.out.println(fullName[0] + " " + fullName[1]);

        Integer[] arrayInteger = {
            1, 2, 3, 4, 5
        };
        System.out.println(arrayInteger[0] + " " + arrayInteger[1] + " " + arrayInteger[2] + " " + arrayInteger[3] + " " + arrayInteger[4]);
        System.out.println(arrayInteger.length); // Menghitung panjang dari array nya

        // TODO: Array di dalam array
        String[][] members = {
            {"Thomas", "Alberto"},
            {"Tia", "Dewi"}
        };

        System.out.println(members[0][0]); // Kode ini mengakses array pertama dan mengambil data pertama
    }
}
