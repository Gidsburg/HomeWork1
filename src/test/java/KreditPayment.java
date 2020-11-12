import org.junit.jupiter.api.Test;

public class KreditPayment {

        @Test
        public void Credit() {
            System.out.println("Body of the credit in ($): 10000 ");
            int a = 10000;

                    int percent = percentage(10000,2);
                        System.out.println("Amount of percent for the credit in ($): " + percent);


                    int sum = total(percent,a);
                        System.out.println("Total return amount in ($): " +sum);
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