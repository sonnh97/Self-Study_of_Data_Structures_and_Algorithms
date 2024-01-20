/*
 * Check if two string arrays are equivalent
 *
 * Parameters:
 * ----------
 *      word1:  first array
 *      word2:  second array
 *
 * Returns:
 * -------
 *      true/false
 *
 * Examples:
 * --------
 *      Example 1:
 *      Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 *      Output: true
 *
 *      Example 2:
 *      Input word1 = ["a", "cb"], word2 = ["ab", "c"]
 *      Output: false
 *
 *      Example 3:
 *      Input: word1 = ["abc", "d", "defg"], word2 = ["abcddefg"]
 *      Output: true
 *
 * References: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/solution/
 * */

public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : arr1) {
            sb1.append(s);
        }

        for (String s : arr2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}