import java.util.*;

public class HuiSu {

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2").toString());
        char a = 'a' - 32;
        System.out.println(a);

        HuiSu hs = new HuiSu();
        System.out.println(Arrays.toString(hs.permutation("abc")));
    }

    static Set<String> set = new HashSet<>();

    public static List<String> letterCasePermutation(String S) {

        set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add(S);
        char[] chars = S.toCharArray();

        trans(S, chars, 0);

        for (String str : set) {
            list.add(str);
        }
        return list;
    }

    private static void trans(String S, char[] chars, int i) {

        if (i >= S.length()) {
            set.add(String.valueOf(chars));
            return;
        }
        char[] tmp = chars.clone();
        if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
            trans(S, chars, i + 1);
            tmp[i] -= 32;
            trans(S, tmp, i + 1);
        } else if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
            trans(S, chars, i + 1);
            tmp[i] += 32;
            trans(S, tmp, i + 1);
        } else {
            trans(S, chars, i + 1);
        }
    }

    //字符串全排列
    static HashSet<String> res2 = new HashSet<>();

    public String[] permutation(String s) {

        StringBuilder sb;
        HashSet<Integer> set = null;

        for (int i = 0; i < s.length(); i++) {
            set = new HashSet<>();
            sb = new StringBuilder();
            sb.append(s.charAt(i));
            set.add(i);
            next(s, sb, set);
        }

        String[] res = new String[res2.size()];
        int i = 0;

        for (String str : res2) {
            res[i++] = str;
        }
        return res;
    }

    void next(String s, StringBuilder sb, HashSet<Integer> set) {

        if (sb.length() == s.length()) {
            res2.add(sb.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
                set.add(i);
                next(s, sb, set);
                set.remove(i);
                sb.delete(sb.length() - 1, sb.length());
            }
        }
    }
}
