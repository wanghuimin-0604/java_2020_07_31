package homework;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:判断数组中是否出现重复元素，出现：true,未出现：false
 * User:wanghuimin
 * Date:2020-04-22
 * Time:14:31
 * 一万年太久，只争朝夕，加油
 */
public class DeleteAgainNum {
    public static void main(String[] args) {
        int[] nums={1,2,6,6,4,4,5};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
