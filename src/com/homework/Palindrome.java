package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:判断回文数（回文序列）
 * User:wanghuimin
 * Date:2020-04-16
 * Time:10:51
 * 一万年太久，只争朝夕，加油
 */
public class Palindrome {
    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));

    }
    public static  boolean isPalindrome(int x) {
        //将这个数字转换成字符串有三种方式
        //1、String类的静态方法valueOf(参数）
        //2、基本类型的值+" "
        //3、包装类的静态方法toString（参数）
        //String str= String.valueOf(x);
        //String str=x+" ";
        String str=Integer.toString(x);
        //将字符串转换成数组
        /*char[] array=str.toCharArray();
        int i=0;
        int j=array.length-1;
        while(i<j){
            if(array[i]==array[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;*/
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if (str.charAt(i) == str.charAt(j)) {

                i++;
                j--;
            }else{
                return false;
            }
        }
   return true;
    }
}
