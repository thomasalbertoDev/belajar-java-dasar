package breakcontinue;

public class BreakContinue {
    public static void main(String[] args) {
        // TODO: Continue
        int counter = 1;

        while(true){
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if(counter <= 10){
                break;
            }
        }

        System.out.println("Selesai");

        // TODO: Continue
        for (var counter2 = 1; counter2 <= 10; counter2++) {
            if(counter2 % 2 == 1){
                continue;
            }

            System.out.println("Perulangan Genap ke-" + counter2);
        }
    }
}
