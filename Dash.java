import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Random;
import tester.DashSol;

public class Dash {
    public static String insertDash(int num) {

        ///This is test code for initializing intellij.
        //THIS CODE IS DECOMPILED CODE FROM TESTER!!!!! JUST FOR TEST!!!!
        //WOULD BE REWRITE AFTER SETTINGS!!

        String var1 = Integer.toString(num);
        String var2 = "";
        int var3 = -1;

        for(int var4 = 0; var4 < var1.length(); ++var4) {
            int var5 = Character.getNumericValue(var1.charAt(var4));
            if (var3 != -1 && var3 % 2 == 1 && var5 % 2 == 1) {
                var2 = var2 + "-" + var5;
            } else {
                var2 = var2 + var5;
            }

            var3 = var5;
        }

        return var2;
    }

    // DO NOT MODIFY THE FOLLOWING TEST CODE
    @Test
    public void fixedTest() {
        System.out.println("****** Fixed Test ******");
        assertEquals("4547-9-3", Dash.insertDash(454793));
        assertEquals("123456", Dash.insertDash(123456));
        assertEquals("1003-567", Dash.insertDash(1003567));
    }

    @Test
    public void randomTest() {
        System.out.println("****** Random Test ******");
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(Integer.MAX_VALUE);
            System.out.println("tested random num: " + num);
            String expected = DashSol.insertDash(num);
            String actual = Dash.insertDash(num);
            assertEquals(expected, actual);
        }
    }
}
