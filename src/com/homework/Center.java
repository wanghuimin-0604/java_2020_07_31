package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-22
 * Time:19:41
 * 一万年太久，只争朝夕，加油
 */
public class Center {
    public static void main(String[] args) {
        int[] nums=new int[]{1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));


    }
    public static int pivotIndex(int[] nums) {
        int length=nums.length;
        int sum=0;
        int sumLeft=0;
        int sumRight=0;
        //求总和
        for(int i:nums){
            sum+=i;
        }
        // 遍历自变量
        for (int i = 0; i < length; i++){
            if (sumLeft*2 == sum - nums[i]) {
                return i;
            }
            sumLeft += nums[i];
        }
        return -1;
    }
}

