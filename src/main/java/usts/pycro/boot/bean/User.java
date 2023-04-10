package usts.pycro.boot.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pycro
 * @version 1.0
 * 2023-04-08 11:57 AM
 */
@Data
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
