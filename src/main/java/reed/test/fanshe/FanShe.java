package reed.test.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author fanqunsong@corp.netease.com
 * @date 2018/5/21
 * @time 16:07
 */
public class FanShe {
    public static void main(String[] args) throws Exception {
        try {
            Class clazz = Class.forName("reed.test.fanshe.Student");
            Constructor[] constructors = clazz.getConstructors();
            System.out.println("**********************所有公有构造方法*********************************");
            for(Constructor constructor:constructors){
                System.out.println(constructor);
            }

            System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
            Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
            for(Constructor constructor:declaredConstructors){
                System.out.println(constructor);
            }

            Field[] fields = clazz.getDeclaredFields();
            for(Field field:fields){
                System.out.println(field);
            }


            Field name = clazz.getDeclaredField("name");

            Student student = new Student();
            name.setAccessible(true);
            name.set(student,"REED");
            System.out.println(student.getName());


            System.out.println("************所有的方法(包括：私有、受保护、默认、公有)***************");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method:methods){
                System.out.println(method);
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
