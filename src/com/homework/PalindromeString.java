package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:判断回文串，只判断数字和字母，字符忽略大小写
 * User:wanghuimin
 * Date:2020-04-29
 * Time:11:50
 * 一万年太久，只争朝夕，加油
 */
public class PalindromeString {
    public static void main(String[] args) {
        String str="race a car";
        System.out.println(isPalindrome(str));;
    }

    private static boolean isPalindrome(String str) {
        //先把它全部转化为小写
       String str1= str.toLowerCase();
        //再把除过数字和字母的字符去掉
        //先创建一个StringBuilder来接收这个
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)>='a'&&str1.charAt(i)<='z'||str1.charAt(i)>='0'&&str1.charAt(i)<='9'){
                sb.append(str1.charAt(i));
            }
        }
        //StringBuilder有一个现成的方法来反转字符串
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

}
