package top.dopen.fineAC.util;

import top.dopen.fineAC.po.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: 元数据封装工厂
 * @Package top.dopen.fineAC.util
 * @Description: 根据resultSet生成相应的po类
 * @date 2018/6/9 17:22
 */
public class MetaDataFactory {
    /**
     *<b>Description:</b>获取列实体<br>
     * @param  resultSet
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018/6/12 14:25
     * <br><b>Version:</b> 1.0
     */
    public List<Column> getColumn(ResultSet resultSet){
        List<Column> columns = new ArrayList<>();
        try {
            while (resultSet.next()){
                Column column = new Column();
                //列名
                column.setName(resultSet.getString("COLUMN_NAME"));
                //自增
                column.setAutoincrement(resultSet.getBoolean("IS_AUTOINCREMENT"));
                //默认值
                column.setDefaultValue(resultSet.getString("COLUMN_DEF"));
                //可以为空
                column.setNullable(resultSet.getBoolean("NULLABLE"));
                //类型
                column.setType(resultSet.getString("TYPE_NAME"));
                //长度
                column.setSize(resultSet.getInt("COLUMN_SIZE"));
                //小数长度
                column.setDigits(resultSet.getInt("DECIMAL_DIGITS"));
                //备注
                column.setRemarks(resultSet.getString("REMARKS"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return columns;
    }


    /**
     *<b>Description:</b>获取外键实体<br>
     * @param  resultSet
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018/6/12 14:48
     * <br><b>Version:</b> 1.0
     */
    public List<ForeignKey> getForeignKeys(ResultSet resultSet){
        List<ForeignKey> foreignKeys = new ArrayList<>();
        try {
            while (resultSet.next()){
                ForeignKey foreignKey = new ForeignKey();
                //本表
                foreignKey.setFkColumn(resultSet.getString("FKCOLUMN_NAME"));
                foreignKey.setFkTable(resultSet.getString("FKTABLE_NAME"));
                //外表（主键表）
                foreignKey.setPkColumnName(resultSet.getString("PKCOLUMN_NAME"));
                foreignKey.setPkTableName(resultSet.getString("PKTABLE_NAME"));
                foreignKeys.add(foreignKey);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return foreignKeys;
    }


    /**
     *<b>Description:</b>获取主键实体类<br>
     * @param  resultSet
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018/6/12 15:20
     * <br><b>Version:</b> 1.0
     */
    public Map<String,PrimayKey> getPrimayKey(ResultSet resultSet){
        //主键优先级别为key
        Map<String,PrimayKey> primayKeys = new HashMap<>();
        try {
            while (resultSet.next()){
                PrimayKey primayKey = new PrimayKey();
                //表名
                primayKey.setTableName(resultSet.getString("TABLE_NAME"));
                //列名
                primayKey.setColumnName(resultSet.getString("COLUMN_NAME"));
                //主键优先级
                primayKey.setKeySeq(resultSet.getInt("KEY_SEQ"));
                //主键名称
                primayKey.setPkName(resultSet.getString("PK_NAME"));
                primayKeys.put(String.valueOf(primayKey.getKeySeq()),primayKey);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return primayKeys;
    }
    /**
     *<b>Description:</b>获取表信息<br>
     * @param  resultSet
     * @Note
     * <b>Author:</b> <a>开唯</a>
     * <br><b>Date:</b> 2018/6/12 16:51
     * <br><b>Version:</b> 1.0
     */
    public TableExt getTable(ResultSet resultSet){
        TableExt table = new TableExt();
        try {
            while (resultSet.next()){
                table.setName(resultSet.getString("TABLE_NAME"));
                table.setRemarks(resultSet.getString("REMARKS"));
                table.setType(resultSet.getString("TABLE_TYPE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return table;
    }

}
