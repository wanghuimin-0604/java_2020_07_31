package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:删除数组中与给定值相等的元素，并返回数组的长度
 * User:wanghuimin
 * Date:2020-04-15
 * Time:11:01
 * 一万年太久，只争朝夕，加油
 */
public class DeleteElements {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3, 4};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(removeElement1(nums, val));
    }
        public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
     return i;

    }
    public static int removeElement1(int[] nums, int val) {
        //双指针
        int i = 0;
        int j = nums.length;
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j-1];
                j--;
            } else {
                i++;
            }
        }
        return j;
    }
}
