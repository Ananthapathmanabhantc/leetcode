// Last updated: 14/9/2026, 8:51:49 pm
class Solution {
    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        if (ls != lt)
            return false;
        String[] cs = new String[ls];
        String[] ct = new String[lt];
        for (int i = 0; i < ls; i++) {
            cs[i] = s.substring(i, i + 1);
            ct[i] = t.substring(i, i + 1);
        }
        Arrays.sort(cs);
        Arrays.sort(ct);
        for (int i = 0; i < ls; i++) {
            if (cs[i].compareTo(ct[i])!=0)
                return false;
        }

        return true;
    }
}