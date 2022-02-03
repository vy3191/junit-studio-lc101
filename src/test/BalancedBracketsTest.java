package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void textInsideTheBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void testNestedBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testNestedBalancedBracketsWithinTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]Now]"));
    }

    @Test
    public void bracketsSurroundedByTexReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[[]]LaunchCode"));
    }


    // Negative test cases
    @Test
    public void singleCharactersReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("C"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void backwardPairsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void backwardsMultiplePairsReturnTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void backwardsMultiplePairsWithinStringReturnTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch]Code]Learn[Now[Java["));
    }





}
