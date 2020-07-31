package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:二进制字符串相加
 * User:wanghuimin
 * Date:2020-04-25
 * Time:9:42
 * 一万年太久，只争朝夕，加油
 */
public class AddBinary {
    public static void main(String[] args) {
        String a="111";
        String b="010";
        System.out.println(addBinary(a,b));

    }
    public static String addBinary(String a, String b) {
        //先把字符串转化为数字（二进制）
        int aa=Integer.parseInt(a);
        int bb=Integer.parseInt(b);
        //先把两个数字进行异或操作，在左移一位
        int cc=(aa^bb);
        int dd=cc<<1;
        return String.valueOf(dd);
    }
}
