package usts.pycro.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-08 2:16 PM
 */
@Component //只有容器中的组件，才会拥有SpringBoot提供的强大功能
@ConfigurationProperties(prefix = "mycar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private Integer price;
}
