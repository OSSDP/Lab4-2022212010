


import org.junit.Test;

import static org.junit.Assert.assertEquals;
111111
public class SolutionTest {
    @Test
    public void testLargestNumberWithPositiveNumbers() {
        Solution solution = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithSingleNumber() {
        Solution solution = new Solution();
        int[] nums = {42};
        String expected = "42";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithSortedNumbers() {
        Solution solution = new Solution();
        int[] nums = {12, 21};
        String expected = "2112";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0};
        String expected = "0";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithLeadingZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 5, 4, 0};
        String expected = "5400";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithAllZeros() {
        Solution solution = new Solution();
        int[] nums = {0, 0, 0};
        String expected = "0";
        String actual = solution.largestNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargestNumberWithNegativeNumbers() {
        // Note: The problem statement specifies non-negative integers,
        // but this test is to see how the method handles negative inputs.
        // Ideally, the method should handle this case gracefully or throw an exception.
        Solution solution = new Solution();
        int[] nums = {-3, -30, -34, -5, -9};
        // For this specific implementation, we might expect the lexicographical order
        // of the negative numbers as strings, which is not meaningful for numerical sorting.
        // But for the sake of testing, we'll check a specific outcome.
        String expected = "-9-5-34-30-3"; // This is just one possible outcome
        String actual = solution.largestNumber(nums);
        // Depending on how you want to handle negative numbers, you might need to adjust the expected output.
        // Alternatively, you could throw an exception in the `largestNumber` method if negative numbers are detected.
        assertEquals(expected, actual);
    }
}
