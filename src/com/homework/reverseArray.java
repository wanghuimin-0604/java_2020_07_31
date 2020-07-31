package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:旋转数组
 * User:wanghuimin
 * Date:2020-04-15
 * Time:10:23
 * 一万年太久，只争朝夕，加油
 */
public class reverseArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(nums, k);
        rotate1(nums, k);
        rotate2(nums,k);


    }

    public static void rotate(int[] nums, int k) {
        int[] array = new int[nums.length];
        int t = 0;
        k = k % nums.length;
        for (int i = 0; i < nums.length; i++) {
            t = (i + k) % nums.length;
            array[t] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate1(int[] nums, int k) {
        //最暴力的方式就是让每一个元素每次走k步
        int temp;
        int previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
        System.out.println(Arrays.toString(nums));
    }
}
