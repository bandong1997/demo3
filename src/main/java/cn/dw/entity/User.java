package cn.dw.entity;

import java.io.Serializable;

/**
 * @author INS
 * @create 2020-04-11 15:20
 */
public class User implements Serializable {

    private int id;
    private String name;
    private int age;

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
