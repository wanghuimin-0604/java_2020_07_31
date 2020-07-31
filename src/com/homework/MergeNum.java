package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:合并两个有序数组，使之称为一个有序数组（双指针）
 * User:wanghuimin
 * Date:2020-04-16
 * Time:11:58
 * 一万年太久，只争朝夕，加油
 */
public class MergeNum {
    public static void main(String[] args) {
        int[] nums1={4,5,6,0,0,0};
        int[] nums2={1,2,3};
        int m=3;
        int n=3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //从后向前进行存储
        int i=m-1;
        int j=n-1;
        int len=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[len]=nums1[i];
                len--;
                i--;
            }else{
                nums1[len]=nums2[j];
                len--;
                j--;
            }
        }
        while(j>=0){
            nums1[len]=nums2[j];
            len--;
            j--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
