package cn.dw.pojo;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-20 16:29
 * 角色实体
 */
public class Role {

    private int rid;
    private String rolename;
    private String roledesc;
    //一个角色对应多个用户
    private List<User> users;


    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", users=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }
}
