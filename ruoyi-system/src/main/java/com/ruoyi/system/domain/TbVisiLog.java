package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 访问量对象 tb_visi_log
 *
 * @author 牛亚朦
 * @date 2021-12-28
 */
public class TbVisiLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String visiType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long campusId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long poiId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String urlContent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String campusName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String poiName;

    private Date startTime;

    private Date endTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setVisiType(String visiType)
    {
        this.visiType = visiType;
    }

    public String getVisiType()
    {
        return visiType;
    }
    public void setCampusId(Long campusId)
    {
        this.campusId = campusId;
    }

    public Long getCampusId()
    {
        return campusId;
    }
    public void setPoiId(Long poiId)
    {
        this.poiId = poiId;
    }

    public Long getPoiId()
    {
        return poiId;
    }
    public void setUrlContent(String urlContent)
    {
        this.urlContent = urlContent;
    }

    public String getUrlContent()
    {
        return urlContent;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("visiType", getVisiType())
            .append("campusId", getCampusId())
            .append("poiId", getPoiId())
            .append("urlContent", getUrlContent())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
