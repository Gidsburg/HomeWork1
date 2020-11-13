import org.junit.jupiter.api.Test;

public class KreditPayment {

        @Test
        public void Credit() {

            int a = 956872; // Credit amount.
            int b = 4;     // Interest rate.

            System.out.println("Body of the credit: " +a +"$");


                    int percent = percentage(a, b);
                        System.out.println("Amount of percent for the credit: " + percent + "$");


                    int sum = total(percent,a);
                        System.out.println("Total return amount: " +sum + "$");
        }
        public int percentage(int a, int b){
            int x = ((a/100)*b);
            return x;
        }

        public int total(int a, int x){
            int z = a + x;
            return z;
        }
}