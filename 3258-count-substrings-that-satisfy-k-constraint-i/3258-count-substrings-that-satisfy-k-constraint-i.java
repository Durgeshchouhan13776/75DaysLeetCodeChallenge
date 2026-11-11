class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int i = 0, j = 0, cntOnes = 0, cntZeros = 0, cntSubstrings = 0;

        while (j < s.length()) {
            if (s.charAt(j) == '0') cntZeros++;
            else cntOnes++;

            while (cntZeros > k && cntOnes > k) {
                if (s.charAt(i) == '0') cntZeros--;
                else cntOnes--;
                i++;
            }

            cntSubstrings += j - i + 1;
            j++;
        }

        return cntSubstrings;
    }
}