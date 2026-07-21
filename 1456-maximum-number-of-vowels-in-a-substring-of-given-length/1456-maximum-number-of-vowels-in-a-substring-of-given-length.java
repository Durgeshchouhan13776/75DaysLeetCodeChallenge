class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = 0;
        int maxVowels = 0;
        int currentWindowVowels = 0;

        while (r < s.length()) {

            if (isVowel(s.charAt(r))) {
                currentWindowVowels++;
            }

            if (r - l + 1 > k) {
                if (isVowel(s.charAt(l))) {
                    currentWindowVowels--;
                }
                l++;
            }

            if (r - l + 1 == k) {
                maxVowels = Math.max(maxVowels, currentWindowVowels);
            }

            r++;
        }

        return maxVowels;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}