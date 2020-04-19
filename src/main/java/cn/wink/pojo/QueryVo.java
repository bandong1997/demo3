package cn.wink.pojo;

import java.util.List;

/**
 * @author INS
 * @create 2020-04-19 12:36
 * 用户
 */
public class QueryVo {
    private User user;
    private List ids;

    public List getIds() {
        return ids;
    }

    public void setIds(List ids) {
        this.ids = ids;
    }

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
