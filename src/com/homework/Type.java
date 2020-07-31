package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-22
 * Time:14:42
 * 一万年太久，只争朝夕，加油
 */
//你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
//你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True
public class Type {
    public static void main(String[] args) {
        String name="saed";
        String typed="ssaaedd";
        System.out.println(isLongPressedName(name, typed));


    }
    public static boolean isLongPressedName(String name, String typed) {
        //双指针
        int i = 0;
        int j = 0;
        if (name.length() > typed.length()) {
            return false;
        }
        while (i <name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
            if(i==name.length()){
                return true;
            }
        }

        return false;
    }
}
