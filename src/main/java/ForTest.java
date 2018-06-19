/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/6
 * @time 19:52
 */
public class ForTest {
    public static void main(String[] args) {

        for(int i= 0;i<5;i++){
            for(int j=6 ;j>3;j--){
                if(i == j){
                    break;
                }else {
                    System.out.println(i+":"+j);
                }
            }
        }


    }
}
