import org.junit.jupiter.api.Test;

public class KreditPayment {

        @Test
        public void Credit() {

            double a = 956872; // Credit amount.
            double b = 4.5;     //  Interest rate.

            System.out.println("Body of the credit: " +a +"$");

                    double percent = percentage(a, b);
                        System.out.println("Amount of percent for the credit: " + percent + "$");

                    double  sum = total(percent,a);
                        System.out.println("Total return amount: " +sum + "$");
        }
        public double percentage(double a, double b){
            double x = ((a/100)*b);
            return x;
        }
        public double total(double a, double x){
            double z = a + x;
            return z;

        }
}