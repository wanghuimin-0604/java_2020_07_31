package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:加1
 * User:wanghuimin
 * Date:2020-04-23
 * Time:11:33
 * 一万年太久，只争朝夕，加油
 */
//
public class AddOne {
    public static void main(String[] args) {
        int[] digits={2,7,9};
        plusOne(digits);
        System.out.println(Arrays.toString(digits));
    }
    public static int[] plusOne(int[] digits) {
        //for循环遍历这个数组，看这个数组的最后一位是不是9
        //有三种情况：1、最末尾数字为9，但是最末尾-1数字不是9
        //2、最末尾数字和高位都是9
        //3、都不是9
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        //跳出循环了
        int[] nums=new int[digits.length+1];
        nums[0]=1;
        return nums;

    }
}
