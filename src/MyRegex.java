import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public static void main(String[] args) {

        String regex = "[a-z]+[0-9]+";
        String str = "aaa2223bb";
//      Pattern p= Pattern.compile("([a-z]+)([0-9]+)");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        boolean flag = Pattern.matches(regex, str);
        System.out.println(m.find()); //匹配aaa2223
        System.out.println(flag);
        System.out.println(m.group());
    }
}
