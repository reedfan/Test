package reed.test;

/*created by fanqunsong
    Date : 2018/2/24
    Time : 17:08
    */

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
public class StringUtilsTest {
    @Test
    public void isEmptyAndisBlankTest(){
        String s = " ";
        System.out.println(StringUtils.isBlank(s)); //true
        System.out.println(StringUtils.isEmpty(s));  //false
    }
}
