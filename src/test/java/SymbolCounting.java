import org.junit.jupiter.api.Test;

public class SymbolCounting {
    @Test

    public void symbolCount(){
        String string="Hello Corona and Goodbye!";
               System.out.println("The number of symbols in string: " + string.length());

        String[] parts = string.split(" ");
            int wordcount = parts.length;
                System.out.println("The number of words in string: " +wordcount);

}
}