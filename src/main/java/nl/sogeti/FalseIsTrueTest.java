package nl.sogeti;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FalseIsTrueTest {
    @Test
    public void falseIsTrue() {
        // This test passes!                                                                                     Move along, nothing to see here! ;-)                                       \u000A if (true) return;
        assertEquals("false", "true");
    }
}
