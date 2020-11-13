import org.junit.jupiter.api.Test;

public class SymbolCounting {
    @Test

    public void symbolCount(){
               String string="Java1234   1234";
               System.out.println("Symbols in string: " + string.length());


        System.out.println(countwords("Hallo corona and goodbye !!!!"));

    }
    public static int countwords(final String phrase) {
        return phrase.replaceAll("[^\\p{Alpha}]+", " ").trim().split(" ").length;
}

}