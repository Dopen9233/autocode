package top.dopen.fineAC.po;

/**
 * @author 苟开唯
 * @version V1.0
 * @Title: Table
 * @Package top.dopen.po
 * @Description: ${TODO}
 * @date 2018/6/9 16:54
 */
public class Table {
    //表名
    private String name;
    //表类型
    private String type;
    //备注
    private String remarks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

