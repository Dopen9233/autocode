package top.dopen.fineAC.dao;

import org.junit.Test;
import top.dopen.fineAC.util.DBUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 苟开唯
 * @date 2018/6/1 11:53
 */
public class MetaDataDao {

    /**
     *<b>Description:</b>获取表名集合<br>
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018/6/9 11:31
     * <br><b>Version:</b> 1.0
     */
    @Test
    public void getTables(){
        try {
            Connection connection = DBUtil.getConnection();
            String catalog = connection.getCatalog(); //catalog 其实也就是数据库名

            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(catalog, "%", "%", new String[]{"TABLE"});
            while(resultSet.next()){
                String table_name = resultSet.getString("TABLE_NAME");
                String table_type = resultSet.getString("TABLE_TYPE");

                System.out.println("table_name："+table_name+"    table_type:"+table_type);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
