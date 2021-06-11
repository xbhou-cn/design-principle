import lombok.RequiredArgsConstructor;

import java.sql.Connection;

/**
 * 将获取连接的方法剔出，将业务单独封装在一个类中
 * @author HZ
 */
@RequiredArgsConstructor
public class UserServiceAfter {
    final private UserDao dao;

    public void saveUser() {
        System.out.println("新增用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");
    }

}

class UserDao {
    public Connection getConnection() {
        System.out.println("获取连接对象");
        return null;
    }
}
