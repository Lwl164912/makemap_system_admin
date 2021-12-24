package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 位置点类型管理对象 tb_poi_type
 *
 * @author 牛亚朦
 * @date 2021-12-24
 */
public class TbPoiType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long poitype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String poitypename;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long parenttype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer hassubtype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String awesomeicon;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sortindex;

    /** children模板 */
    @Excel(name = "children模板")
    private String data;

    /** 0 存在 1删除 */
    @Excel(name = "0 存在 1删除")
    private Long state;

    public void setPoitype(Long poitype)
    {
        this.poitype = poitype;
    }

    public Long getPoitype()
    {
        return poitype;
    }
    public void setPoitypename(String poitypename)
    {
        this.poitypename = poitypename;
    }

    public String getPoitypename()
    {
        return poitypename;
    }
    public void setParenttype(Long parenttype)
    {
        this.parenttype = parenttype;
    }

    public Long getParenttype()
    {
        return parenttype;
    }
    public void setHassubtype(Integer hassubtype)
    {
        this.hassubtype = hassubtype;
    }

    public Integer getHassubtype()
    {
        return hassubtype;
    }
    public void setAwesomeicon(String awesomeicon)
    {
        this.awesomeicon = awesomeicon;
    }

    public String getAwesomeicon()
    {
        return awesomeicon;
    }
    public void setSortindex(Long sortindex)
    {
        this.sortindex = sortindex;
    }

    public Long getSortindex()
    {
        return sortindex;
    }
    public void setData(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }
    public void setState(Long state)
    {
        this.state = state;
    }

    public Long getState()
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("poitype", getPoitype())
            .append("poitypename", getPoitypename())
            .append("parenttype", getParenttype())
            .append("hassubtype", getHassubtype())
            .append("awesomeicon", getAwesomeicon())
            .append("sortindex", getSortindex())
            .append("data", getData())
            .append("createtime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("state", getState())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
