package org.justkeepcoding.markdown;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ReverseTests {
    private Reverse reverse;

    @Before
    public void setup() {
       reverse = new Reverse();
    }

    @Test
    public void testSimpleReverseError() {
        String correct = "[I'm an inline-style link](https://www.google.com)";
        String mistake = "(https://www.google.com)[I'm an inline-style link]";

        String result = reverse.checkAndReverse(mistake);
        // Not sure this assertEquals is right...
        Assert.assertEquals(correct,result);

    }

}
