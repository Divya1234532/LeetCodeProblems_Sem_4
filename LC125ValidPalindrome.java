import java.util.Arrays;

class Solution {
    public boolean isPalindrome(String s) {

        char[] st = s.toCharArray();
        char[] arr = new char[st.length];
        int i = 0;

        // filter + lowercase
        for (char c : st) {
            if (Character.isLetterOrDigit(c)) {
                arr[i] = Character.toLowerCase(c); // ✅ FIX
                i++;
            }
        }

        // copy valid part
        char[] clean = new char[i];
        for (int j = 0; j < i; j++) {
            clean[j] = arr[j];
        }

        // reverse
        char[] rev = clean.clone();
        int left = 0, right = rev.length - 1;

        while (left < right) {
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;
            left++;
            right--;
        }

        return Arrays.equals(clean, rev);
    }
}
