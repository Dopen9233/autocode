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
            /*System.out.println(metaData.getUserName());
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDatabaseProductVersion());
            */
            ResultSet resultSet = metaData.getTables(null, "%", "base%", new String[]{"TABLE"});
            while(resultSet.next()){

                /**/String table_name = resultSet.getString("TABLE_NAME");
                String table_type = resultSet.getString("TABLE_TYPE");
                String test = resultSet.getString("TABLE_SCHEM");

                System.out.println("table_name："+table_name+"    table_type:"+table_type+"  "+test);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void columns(){
        try {
            Connection connection = DBUtil.getConnection();
            String catalog = connection.getCatalog(); //catalog 其实也就是数据库名
            System.out.println(catalog);
            DatabaseMetaData metaData = connection.getMetaData();

            ResultSet resultSet = metaData.getColumns("aishangshop", "%", "test", "%");
            while(resultSet.next()){


                String columnName = resultSet.getString("COLUMN_NAME");
                String columnType = resultSet.getString("TYPE_NAME");
                String test = resultSet.getString("IS_NULLABLE");
                int datasize = resultSet.getInt("COLUMN_SIZE");
                boolean nullable = resultSet.getBoolean("NULLABLE");

                System.out.println(columnName+" "+columnType+" "+datasize+" "+"  "+nullable+"  "+test);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void primaryKey(){
        try {
            Connection connection = DBUtil.getConnection();
            String catalog = connection.getCatalog(); //catalog 其实也就是数据库名

            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getPrimaryKeys("aishangshop","%","test");
            while(resultSet.next()){
                String columnName = resultSet.getString("COLUMN_NAME");
                String pk_name = resultSet.getString("PK_NAME");
                short seq = resultSet.getShort("KEY_SEQ");
                System.out.println(columnName+"  "+" 优先级:"+seq);
                System.out.println("键名："+pk_name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
