import java.util.*;

public class HuaDongChuangKou {

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;

        int max = 0;
        int num = 0;
        LinkedList<Character> list = new LinkedList<>();
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            list.add(c);
            num++;
            while (set.contains(c)) {
                set.remove(list.poll());
                num--;
            }
            set.add(c);
            max = (max >= num) ? max : num;
        }
        return max;
    }
    //s2中包含s1的全排列
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        char[] crr = s1.toCharArray();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : crr) {
            arr1[c - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        if (equal(s1,arr1,arr2)) return true;

        for (int i = 1; i < s2.length() - s1.length() + 1; i++) {
            arr2[s2.charAt(i - 1) - 'a']--;
            arr2[s2.charAt(i - 1 + s1.length()) - 'a']++;
            if (equal(s1,arr1,arr2)) return true;
        }
        return false;
    }

    private boolean equal(String s1, int[] arr1, int[] arr2) {
        for (char a : s1.toCharArray()) {
            if (arr1[a - 'a'] != arr2[a - 'a']) {
                return false;
            }
        }
        return true;
    }
}
