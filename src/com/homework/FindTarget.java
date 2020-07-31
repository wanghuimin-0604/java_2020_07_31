package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:两数之和
 * User:wanghuimin
 * Date:2020-04-24
 * Time:22:02
 * 一万年太久，只争朝夕，加油
 */
public class FindTarget {
    public static void main(String[] args) {
        int[] nums=new int[]{1,5,3,4,8};
        int target=4;
        System.out.println(Arrays.toString(twoSum1(nums, target)));


    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target&&i!=j){
                    ret[0]=i;
                    ret[1]=j;
                }
            }
        }
        return ret;
    }
    public static int[] twoSum1(int[] nums,int target){
        //利用哈希表
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int ret = target - nums[i];
            if (map.containsKey(ret)) {
                return new int[]{map.get(ret), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
