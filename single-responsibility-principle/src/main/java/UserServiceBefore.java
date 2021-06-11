import java.sql.Connection;

/**
 * 获取连接，以及业务处理都在一个类中
 */
public class UserServiceBefore {

    public Connection getConnection() {
        System.out.println("获取连接对象");
        return null;
    }

    public void saveUser() {
        System.out.println("新增用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

}
