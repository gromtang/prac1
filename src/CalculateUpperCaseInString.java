import java.util.Scanner;

public class CalculateUpperCaseInString {

    public static int[] Calculate(String str){
        char[] strchar = str.toCharArray();
        int[] arr = new int[2];
        for(int i = 0;i < strchar.length;i++){
            if(Character.isUpperCase(strchar[i]))
                arr[0]++;
            else if (Character.isLowerCase(strchar[i]))
                arr[1]++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("请输入任意字符串");
        Scanner sc = new Scanner(System.in);
        int[] arr = Calculate(sc.nextLine());
        System.out.println("输入的字符串中大写字母有：" + arr[0] + "个，小写字母有：" + arr[1] + "个");
        System.gc();
    }
}
