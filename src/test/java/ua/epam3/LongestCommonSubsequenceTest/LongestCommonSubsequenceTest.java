package ua.epam3.LongestCommonSubsequenceTest;

import ua.epam3.longestcommonsubsequence.LongestCommonSubsequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void longestCommonSubsequenceTest1() {
        String expected = "";
        assertEquals(expected, LongestCommonSubsequence.getLongestCommonSubsequence("0123", "5678"));
    }

    @Test
    public void longestCommonSubsequenceTest2() {
        String expected = "hell";
        assertEquals(expected, LongestCommonSubsequence.getLongestCommonSubsequence("hell145", "hell968"));
    }
}
