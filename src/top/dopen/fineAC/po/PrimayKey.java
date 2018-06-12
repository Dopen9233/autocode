package top.dopen.fineAC.po;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: PrimayKey
 * @Package top.dopen.po
 * @Description: 主键po类
 * @date 2018/6/9 17:04
 */
public class PrimayKey {
    //主键名称
    private String pkName;
    //表名
    private String tableName;
    //字段名
    private String columnName;
    //主键优先级
    private Integer keySeq;

    public String getPkName() {
        return pkName;
    }

    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getKeySeq() {
        return keySeq;
    }

    public void setKeySeq(Integer keySeq) {
        this.keySeq = keySeq;
    }
}
