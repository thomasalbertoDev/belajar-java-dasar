package tipeDataBukanPrimitif;

public class TIpeDataBukanPrimitif {
    // Tipe data primitif merupakan tipe data yang memiliki nilai default nya sedangkan tipe data bukan primitif merupakan tipe data yang tidak memiliki nilai default nya atau null

    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100L;
        Float iniFloat = 100.0f;
        Double iniDouble = 100.0;
        Character iniCharacter = 'a';
        Boolean iniBoolean = true;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(iniCharacter);
        System.out.println(iniBoolean);

        // Konversi tipe data primitif menjadi tipe data bukan primitif
        int iniInt = 100;
        long iniLong2 = 1000;
        float iniFloat2 = 100.0f;
        double iniDouble2 = 100.0;
        char iniCharacter2 = 'a';
        boolean iniBoolean2 = true;

        Integer iniInteger2 = iniInt;
        Long iniLong3 = iniLong2;
        Float iniFloat3 = iniFloat2;
        Double iniDouble3 = iniDouble2;
        Character iniCharacter3 = iniCharacter2;
        Boolean iniBoolean3 = iniBoolean2;

        System.out.println(iniInteger2);
        System.out.println(iniLong3);
        System.out.println(iniFloat3);
        System.out.println(iniDouble3);
        System.out.println(iniCharacter3);
        System.out.println(iniBoolean3);

        // Konversi tipe data bukan primitif menjadi tipe data primitif
        Integer iniInteger3 = 100;
        Long iniLong4 = 1000L;
        Float iniFloat4 = 100.0f;
        Double iniDouble4 = 100.0;
        Character iniCharacter4 = 'a';
        Boolean iniBoolean4 = true;

        int iniKonversiInt = iniInteger3.intValue();
        long iniKonversiLong = iniLong4.longValue();
        float iniKonversiFloat = iniFloat4.floatValue();
        double iniKonversiDouble = iniDouble4.doubleValue();
        char iniKonversiCharacter = iniCharacter4.charValue();
        boolean iniKonversiBoolean = iniBoolean4.booleanValue();

        System.out.println(iniKonversiInt);
        System.out.println(iniKonversiLong);
        System.out.println(iniKonversiFloat);
        System.out.println(iniKonversiDouble);
        System.out.println(iniKonversiCharacter);
        System.out.println(iniKonversiBoolean);

    }
}
