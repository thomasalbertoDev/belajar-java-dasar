public class KonversiNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        // Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte

        // Konversi Number Otomatis 
        byte dataByte = 100;
        short dataShort = dataByte;
        int dataInt = dataShort;
        long dataLong = dataInt;
        float dataFloat = dataLong;
        double dataDouble = dataFloat;

        // Konversi Number Manual
        double dataDoubleManual = 100.0;
        float dataFloatManual = (float) dataDoubleManual;
        long dataLongManual = (long) dataFloatManual;
        int dataIntManual = (int) dataLongManual;
        char dataCharManual = (char) dataIntManual;
        short dataShortManual = (short) dataCharManual;
        byte dataByteManual = (byte) dataShortManual;
    }
}
