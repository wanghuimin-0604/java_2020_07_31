package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:反转字符串
 * User:wanghuimin
 * Date:2020-04-15
 * Time:11:45
 * 一万年太久，只争朝夕，加油
 */
public class reverseString {
    public static void main(String[] args) {
        String str="abcdef";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        /*String str="abcdef";
        char temp;
        char[] array=str.toCharArray();
        int i=0;
        int j=array.length-1;
        while(i<j){
            temp=array[j];
            array[j]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }*/
        StringBuilder bs = new StringBuilder("abcdef");
        System.out.println(bs.reverse());
    }
}
