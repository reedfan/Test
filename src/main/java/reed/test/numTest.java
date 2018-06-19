package reed.test;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/6
 * @time 17:17
 */
public class numTest {
    public static void main(String[] args) {

        String str1 = "00";
        String str2 = "24";

        if(str1.matches("[0-9]+")) {
            System.out.println("str1 yes");
        }else {
            System.out.println("str1 no");
        }

        if(str2.matches("[0-9]+")) {
            System.out.println("str2 yes");
        }else {
            System.out.println("str2 no");
        }




    }

}
