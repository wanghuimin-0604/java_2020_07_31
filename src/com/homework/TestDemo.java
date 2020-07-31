package homework;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-04-16
 * Time:12:02
 * 一万年太久，只争朝夕，加油
 */
public class TestDemo {
    public static void main(String[] args) {
        //如果++i和i++不进行赋值给某个变量的话，两个的效果是一样的，都进行了+1；
        // 但是如果把它赋值的话，num++赋值后得到的是加之前的数字，++num是加之后的数字
        int sum;
        int num=sum=7;
        int a=num++;
        int b=++sum;
        //sum++;
       // ++num;
        System.out.println(a);
        System.out.println(b);

    }
}
