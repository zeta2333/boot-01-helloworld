package usts.pycro.boot.config;

import ch.qos.logback.core.db.DBHelper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import usts.pycro.boot.bean.Car;
import usts.pycro.boot.bean.Pet;
import usts.pycro.boot.bean.User;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-08 12:04 PM
 * 配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的singleton
 * 配置类本身也是组件
 * 1.proxyBeanMethods：代理bean的方法
 * 2.FuLL(proxyBeanMethods = true)
 * 3.Lite(proxyBeanMethods = false)
 * 组件依赖
 * 4.Import({User.cLass,DBHelper.class})
 * 给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 */
@Configuration(proxyBeanMethods = true) // 告诉springboot这是一个配置类，功能相当于配置文件
@Import({User.class, DBHelper.class})
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
@EnableConfigurationProperties(Car.class)
//1.开启Car的配置绑定功能
//2.将Car这个组件自动注册到容器中
public class MyConfig {
    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次，获取的都是之前注册容器中的单实例对象
     *
     * @return
     */
    @Bean("user1") //bean注解，方法名为组件id，返回类型为组件类型，返回值为组件在容器中的实例
    public User user01() {
        User pycro = new User("Pycro", 22);
        pycro.setPet(tomcat());
        return pycro;
    }

    @Bean("tom")
    public Pet tomcat() {
        return new Pet("Tomcat");
    }
}
