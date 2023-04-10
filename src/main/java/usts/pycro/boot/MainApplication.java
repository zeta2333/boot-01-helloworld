package usts.pycro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-07 9:15 PM
 * 主程序类，应用的入口
 * @SpringBootApplication 这是一个SpringBoot应用
 */
//@SpringBootApplication()
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("usts.pycro.boot")
@ImportResource("classpath:beans.xml")
public class MainApplication {
    public static void main(String[] args) {
        //1.获取IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //
        //String[] beanNamesForType = run.getBeanNamesForType(User.class);
        //System.out.println("============");
        //for (String s : beanNamesForType) {
        //    System.out.println(s);
        //}
        //DBHelper dbHelper = run.getBean(DBHelper.class);
        //System.out.println(dbHelper);
        boolean tom = run.containsBean("tom");
        System.out.println("容器中有tom组件：" + tom);
        boolean user1 = run.containsBean("user1");
        System.out.println("容器中有user1组件：" + user1);

        boolean uu = run.containsBean("uu");
        System.out.println("uu：" + uu);
        boolean pp = run.containsBean("pp");
        System.out.println("pp：" + pp);

        System.out.println("容器中组件的数量为："+run.getBeanDefinitionCount());

        String[] beanNamesForType = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println("WebMvc:"+beanNamesForType.length);

    }
}
