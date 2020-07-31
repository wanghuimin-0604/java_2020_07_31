package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-16
 * Time:11:15
 * 一万年太久，只争朝夕，加油
 */
public class LastWord {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        //如果字符串为空
        if (s == null) {
            return 0;
        }
        String str=s.trim();
        //记录单词的长度
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            } else {
                return 0;
            }
        }
        return count;
    }
}
