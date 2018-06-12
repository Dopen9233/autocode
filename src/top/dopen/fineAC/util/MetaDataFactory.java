package top.dopen.fineAC.util;

import top.dopen.fineAC.po.Column;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: 元数据封装工厂
 * @Package top.dopen.fineAC.util
 * @Description: 根据resultSet生成相应的po类
 * @date 2018/6/9 17:22
 */
public class MetaDataFactory {
    public List<Column> getColumn(ResultSet resultSet){

        try {
            List<Column> columns = new ArrayList<>();
            while (resultSet.next()){
                Column column = new Column();
                column.setName(resultSet.getString("COLUMN_NAME"));

                resultSet.getString("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
