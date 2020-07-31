package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:反转字母
 * User:wanghuimin
 * Date:2020-04-22
 * Time:17:01
 * 一万年太久，只争朝夕，加油
 */
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
public class Reverse {
    public static void main(String[] args) {
        String s="I love you";
        System.out.println(reverseOnlyLetters(s));


    }
    public static String  reverseOnlyLetters(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while (i <=j) {
            if (!Character.isLetter(array[i])) {
                i++;
            } else if (!Character.isLetter(array[j])) {
                j--;
            } else {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return String.valueOf(array);
    }
}
