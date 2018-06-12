package top.dopen.fineAC.po;

import java.util.List;
import java.util.Map;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: ${file_name}
 * @Package top.dopen.po
 * @Description: ${TODO}
 * @date 2018/6/9 16:55
 */
public class TableExt extends Table {
    //字段
    private List<Column> columns;
    //主键    --key 优先级
    private Map<String,PrimayKey> primayKeys;
    //外键    --key
    private List<ForeignKey> foreignKeys;



    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public Map<String, PrimayKey> getPrimayKeys() {
        return primayKeys;
    }

    public void setPrimayKeys(Map<String, PrimayKey> primayKeys) {
        this.primayKeys = primayKeys;
    }

    public List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    public void setForeignKeys(List<ForeignKey> foreignKeys) {
        this.foreignKeys = foreignKeys;
    }
}
