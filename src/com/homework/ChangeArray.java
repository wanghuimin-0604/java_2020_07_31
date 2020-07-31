package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-29
 * Time:12:22
 * 一万年太久，只争朝夕，加油
 */
public class ChangeArray {
    public static void main(String[] args) {
        char[] chars=new char[]{'a','a','b'};
        System.out.println((compress(chars)));
    }
    public static int compress(char[] chars) {
        int n = chars.length, cur = 0;
        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && chars[j] == chars[i]) j++;
            chars[cur++] = chars[i];
            if (j - i == 1) continue;
            for (char c : String.valueOf(j - i).toCharArray()) chars[cur++] = c;
        }
        return cur;
    }
}
