class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();
        int n = nums.length;
        for (String s : nums) {
            set.add(s);
        }
        StringBuilder sb = new StringBuilder();
        return backtrack(n, sb, set);
    }

    public String backtrack(int n, StringBuilder sb, HashSet<String> set) {
        if (sb.length() == n) {
            if (!set.contains(sb.toString()))
                return sb.toString();
            return null;
        }

        sb.append('0');
        String ans = backtrack(n, sb, set);
        if (ans != null)
            return ans;
        sb.deleteCharAt(sb.length() - 1);

        sb.append('1');
        ans = backtrack(n, sb, set);
        if (ans != null)
            return ans;
        sb.deleteCharAt(sb.length() - 1);
        return null;
    }
}