import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Random;
import tester.PersistSol;
import org.junit.Rule;

public class Persist {

    public static int persistence(long var0) {
        String var2 = Long.toString(var0);

        int var3;
        for(var3 = 0; var2.length() != 1; ++var3) {
            long var4 = 1L;

            for(int var6 = 0; var6 < var2.length(); ++var6) {
                var4 *= (long)Character.getNumericValue(var2.charAt(var6));
            }

            var2 = Long.toString(var4);
        }

        return var3;
    }

    // DO NOT MODIFY THE FOLLOWING TEST CODE
    @Test
    public void fixedTest() throws Exception {
        System.out.println("****** Fixed Test ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void randomTest() throws Exception {
        System.out.println("****** Random Test ******");
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {   
            int  x = PersistSol.randint(rnd, 1, 500000);
            System.out.println("Number n tested: " + x);
            assertEquals(PersistSol.persistence(x), Persist.persistence(x));
        }   
    }
}
