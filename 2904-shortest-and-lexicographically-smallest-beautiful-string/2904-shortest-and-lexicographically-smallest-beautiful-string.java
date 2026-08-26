class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int l = 0;
        int ones = 0;

        StringBuilder ans = new StringBuilder();

        for (int r = 0; r < n; r++) {

            if (s.charAt(r) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(l) == '1') {
                    ones--;
                }
                l++;
            }

            if (ones == k) {

                while (s.charAt(l) == '0') {
                    l++;
                }
                StringBuilder curr = new StringBuilder();

                for (int i = l; i <= r; i++) {
                    curr.append(s.charAt(i));
                }

                if (ans.length() == 0 ||
                    curr.length() < ans.length() ||
                    (curr.length() == ans.length()
                     && curr.toString().compareTo(ans.toString()) < 0)) {
                    ans = curr;
                }
            }
        }

        return ans.toString();
    }
}