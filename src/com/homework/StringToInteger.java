package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:将字符串转换成整数
 * User:wanghuimin
 * Date:2020-04-28
 * Time:10:05
 * 一万年太久，只争朝夕，加油
 */
//假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，
// 则你的函数不需要进行转换，即无法进行有效转换。
public class StringToInteger {
    public static void main(String[] args) {
        String str="  4.1458";
        int ret=myAtoi(str);
        System.out.println(ret);

    }
    public static int myAtoi(String str) {
        //创建一个可变长字符串
        StringBuilder sb=new StringBuilder();
        //遍历传进来的字符串

            //如果0号位置的字符是"-"，那么就把他追加到sb里面
            if(str.charAt(0)=='-'){
                sb.append(str.charAt(0));
            }else if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                sb.append(str.charAt(0));
            }else if(str.charAt(0)==' '){
            }else{
                return 0;
        }
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='-'){
                sb.append(str.charAt(i));
            }else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                sb.append(str.charAt(i));
            }else if(str.charAt(i)=='.') {
                break;
            }else{
                continue;
            }
        }
        //现在得到的还是一个字符串，只是这个字符串是满足题目要求的字符串
        //把StringBuilder转换成String
        String str1=""+sb;
        //把字符串转换成整数
        long ret=Long.parseLong(str1);
        if(ret>2147483647||ret<-2147483648){
            return -2147483648;
        }
        int ret1=(int)ret;
        return ret1;
    }
}
