package homework;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:赎金信
 * User:wanghuimin
 * Date:2020-04-16
 * Time:10:21
 * 一万年太久，只争朝夕，加油
 */
public class Construct {

    public static void main(String[] args) {
        String ransomNote="aa";
        String magazine="aab";
        System.out.println(canConstruct(ransomNote, magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //先将字符串拆分成数组
        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();
        //调用排序方法，将数组升序排序
        Arrays.sort(r);
        Arrays.sort(m);
        int i=0;
        int j=0;
        boolean b=true;
        if(r.length>m.length){
            return false;
        }
        while(i<r.length&&j<m.length){
            if(r[i]<m[j]){
                return false;
            }else if(r[i]>m[j]){
                j++;
            }else{
                i++;
                j++;
            }
        }


        return i==r.length;
    }
}
