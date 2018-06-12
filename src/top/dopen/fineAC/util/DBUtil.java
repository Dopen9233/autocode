package top.dopen.fineAC.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 苟开唯
 * @date 2018/6/1 11:54
 */
public class DBUtil {
    private static String URL;//数据库地址
    private static String USER;//用户
    private static String PASSWORD;//密码


    static {
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            init();
        } catch (Exception e) {
            System.out.println("初始化失败");
            e.printStackTrace();
        }
    }
    /**
     *
     * <b>Description:</b>获取连接<br>
     * @return 连接
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018年5月24日 下午4:17:06
     * <br><b>Version:</b> 1.0
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    private static void init(String url,String user,String password) throws Exception {
        URL = url;
        USER = user;
        PASSWORD = password;
    }

    private static void init() throws Exception {
        Properties properties = new Properties();
        InputStream is = new FileInputStream("config/db.properties");
        properties.load(is);
        URL = properties.getProperty("db.url");
        USER = properties.getProperty("db.username");
        PASSWORD = properties.getProperty("db.password");
    }
}
