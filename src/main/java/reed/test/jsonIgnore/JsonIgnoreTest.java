package reed.test.jsonIgnore;

import com.alibaba.fastjson.JSON;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/6/12
 * @time 15:33
 */
public class JsonIgnoreTest {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(100);
        person.setName("reed");

        String json = JSON.toJSONString(person);
        System.out.println(json);

        Person person2 = JSON.parseObject(json, Person.class);



        System.out.println(person2.getAge());
        System.out.println(person2.getName());


    }


}
