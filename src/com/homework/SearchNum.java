package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:找数字区间
 * User:wanghuimin
 * Date:2020-04-28
 * Time:11:04
 * 一万年太久，只争朝夕，加油
 */
//给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。找出给定目标值在数组中的开始位置和结
//束位置。你的算法时间复杂度必须是 O(log n) 级别。如果数组中不存在目标值，返回 [-1, -1]
public class SearchNum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));


    }

    public static int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j = 0;
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        while (i < nums.length && j < nums.length) {
            while (i <= j) {
                if (nums[i] == target) {
                    if (nums[j] != target) {
                        return new int[]{i, j - 1};
                    }
                    j++;
                } else {
                    i++;
                    j++;
                }
                break;
            }
        }
        //退出循环有两种
        //1、找到了j位置等于数组长度


        //2、没找到的话，i和j相等
        if (i == j) {
            return new int[]{-1, -1};
        }
        return new int[]{i, j - 1};
    }
}
