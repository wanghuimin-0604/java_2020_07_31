package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:求数组的第三大数
 * User:wanghuimin
 * Date:2020-04-23
 * Time:11:42
 * 一万年太久，只争朝夕，加油
 */
public class ThirdMax {
    public static void main(String[] args) {
        int[] nums={2,5,9,6,5};
        System.out.println(thirdMax(nums));

    }
    /*public static int thirdMax(int[] nums) {
        int thirdMax=0;
        //先进行排序
        Arrays.sort(nums);
        //定义一个集合，来保存不重复的数字
        List<Integer> list=new ArrayList<>();

        for(int i:nums) {
            if (!(list.contains(i))) {
                list.add(i);
            }
        }
        //得到一个没有重复元素的list集合
        if(list.size()==1) {
            thirdMax = list.get(0);
        }
        if(list.size()==2) {
            thirdMax = list.get(1);
        }
        if(list.size()>2){
            thirdMax=list.get(list.size()-3);
    }
        return thirdMax;
}*/
//用堆来找数组中的第三大数字
    public static int thirdMax(int[] nums) {
        int size=nums.length;
        //从后往前遍历，向下调整
        for(int i=(size-1-1)/2;i>=0;i--){
            shiftDown(nums,size,i);
        }
        //如果没有第三大的数字，那就返回数组中最大的
        if(size<3){
            return nums[0];
        }
        //返回第三个
        return nums[2];
}

    private static void shiftDown(int[] nums, int size, int index) {
        int parent=index;
        int child=parent*2+1;
        while(child<size){
            //如果右子树节点的值大于左子树节点的值
            if(child+1<size&&nums[child+1]>nums[child]){
                child=child+1;
            }
            //如果不符合大堆的情况，那就交换
            if(nums[parent]<nums[child]){
                int tmp=nums[parent];
                nums[parent]=nums[child];
                nums[child]=tmp;
            }else{
                break;
            }
            //从后向前遍历，向下调整
            parent=child;
            child=child*2+1;
        }
    }
    }
