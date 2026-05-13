class Solution {
    public boolean isAnagram(String s, String t) {
     char[] s_c=s.toCharArray();
     char[] t_c=t.toCharArray();
     Arrays.sort(s_c);
     Arrays.sort(t_c);
     return Arrays.equals(s_c,t_c);
    }
}
