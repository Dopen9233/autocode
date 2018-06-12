package top.dopen.fineAC.po;

/*
 * @Title:数据库字段po类
 * @ClassName: Column
 * @Description: 数据库字段po类
 * @author 苟开唯
 * @date 2018年6月9日 下午4:39:47
 */

public class Column {
    //列名
    private String name;
    //字段类型
    private String type;
    //字段长度
    private Integer size;
    //小数长度
    private Integer digits;
    //允许为空
    private Boolean nullable;
    //自动增长
    private Boolean autoincrement;
    //默认值
    private String defaultValue;
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getDigits() {
        return digits;
    }

    public void setDigits(Integer digits) {
        this.digits = digits;
    }

    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public Boolean getAutoincrement() {
        return autoincrement;
    }

    public void setAutoincrement(Boolean autoincrement) {
        this.autoincrement = autoincrement;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
