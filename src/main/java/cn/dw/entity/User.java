package cn.dw.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author INS
 * @create 2020-04-10 20:36
 */
public class User implements Serializable {
    private String username;
    private String password;
    private int age;

    private List list;
    private Role role;
    private List<Role>roleList;
    private Map<String , Object>map;
    private Map<String ,Role>roleMap;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", role=" + role +
                ", roleList=" + roleList +
                ", map=" + map +
                ", roleMap=" + roleMap +
                '}';
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Map<String, Role> getRoleMap() {
        return roleMap;
    }

    public void setRoleMap(Map<String, Role> roleMap) {
        this.roleMap = roleMap;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
