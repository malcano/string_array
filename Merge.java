import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import tester.MergeSol;

public class Merge {

    ///This is test code for initializing intellij.
    //THIS CODE IS DECOMPILED CODE FROM TESTER!!!!! JUST FOR TEST!!!!
    //WOULD BE REWRITE AFTER SETTINGS!!
    public static String longest(String var0, String var1) {
        String var2 = "";

        int var3;
        for(var3 = 0; var3 < var0.length(); ++var3) {
            if (var2.indexOf(var0.charAt(var3)) == -1) {
                var2 = var2 + var0.charAt(var3);
            }
        }

        for(var3 = 0; var3 < var1.length(); ++var3) {
            if (var2.indexOf(var1.charAt(var3)) == -1) {
                var2 = var2 + var1.charAt(var3);
            }
        }

        char[] var4 = var2.toCharArray();
        Arrays.sort(var4);
        return new String(var4);
    }

    public static int randInt(int var0, int var1) {
        return var0 + (int)(Math.random() * (double)(var1 - var0 + 1));
    }

    public static String getRandomString(int var0) {
        String var1 = "";
        boolean var2 = true;

        for(int var3 = 0; var3 < 15; ++var3) {
            int var5 = randInt(97 + var0, 122);

            for(int var4 = 0; var4 < randInt(1, 5); ++var4) {
                var1 = var1 + (char)var5;
            }
        }

        return var1;
    }
      
    //DO NOT MODIFY THE FOLLOWING TEST CODE
    @Test
    public void fixedTest() {
        System.out.println("****** Fixed Test ******");
        assertEquals("aehrsty", Merge.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", Merge.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", Merge.longest("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void randomTest() {
        System.out.println("****** Random Test ******");
        for (int i = 0; i < 200; i++) {
            String s1 = MergeSol.getRandomString(MergeSol.randInt(1, 10));
            String s2 = MergeSol.getRandomString(MergeSol.randInt(1, 8));
            System.out.println("Tested s1:" + s1);
            System.out.println("Tested s2:" + s2);
            assertEquals(MergeSol.longest(s1, s2), Merge.longest(s1, s2));
        }
    }
}
