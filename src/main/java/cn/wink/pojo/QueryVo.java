package cn.wink.pojo;

/**
 * @author INS
 * @create 2020-04-19 12:36
 */
public class QueryVo {
    private User user;

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
