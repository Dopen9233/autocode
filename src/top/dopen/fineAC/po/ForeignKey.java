package top.dopen.fineAC.po;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: ForeignKey
 * @Package top.dopen.po
 * @Description: 外键po类
 * @date 2018/6/9 17:13
 */
public class ForeignKey {
    //外键表
    private String pkTableName;
    //外键列
    private String pkColumnName;
    //关联表
    private String fkTable;
    //关联列
    private String fkColumn;

    public String getPkTableName() {
        return pkTableName;
    }

    public void setPkTableName(String pkTableName) {
        this.pkTableName = pkTableName;
    }

    public String getPkColumnName() {
        return pkColumnName;
    }

    public void setPkColumnName(String pkColumnName) {
        this.pkColumnName = pkColumnName;
    }

    public String getFkTable() {
        return fkTable;
    }

    public void setFkTable(String fkTable) {
        this.fkTable = fkTable;
    }

    public String getFkColumn() {
        return fkColumn;
    }

    public void setFkColumn(String fkColumn) {
        this.fkColumn = fkColumn;
    }
}
