public class TipeDataNumber {
    public static void main(String[] args) {

        // Tipe Data Number
        byte dataByte = 100; // -128 sampai 127
        short dataShort = 1000; // -32.768 sampai 32.767
        int dataInt = 10000; // -2.147.483.648 sampai 2.147.483.647
        long dataLong = 1000000; // -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807

        System.out.println(dataByte);
        System.out.println(dataShort);
        System.out.println(dataInt);
        System.out.println(dataLong);

        // Tipe Data Floating Point
        float dataFloat = 100.0f; // -3.4028235E38 sampai 3.4028235E38
        double dataDouble = 100.0; // -1.7976931348623157E308 sampai 1.7976931348623157E308

        System.out.println(dataFloat);
        System.out.println(dataDouble);

        // Tipe Data Number Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecima = 0b10101010;

        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecima);

        // Tipe Data Number Undescore
        int amount = 1_000_000_000;

        System.out.println(amount);
    }
}
