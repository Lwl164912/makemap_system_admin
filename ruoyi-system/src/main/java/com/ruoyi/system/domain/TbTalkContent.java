package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * 建筑论坛对象 tb_talk_content
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
public class TbTalkContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long campusId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgDes;

    @Excel(name = "${poiName}", readConverterExp = "$column.readConverterExp()")
    private String poiName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgImg;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String msgName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date msgTimer;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long parentId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long poiId;

    private List<TbTalkContent> Children;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setCampusId(Long campusId)
    {
        this.campusId = campusId;
    }

    public Long getCampusId()
    {
        return campusId;
    }
    public void setMsgDes(String msgDes)
    {
        this.msgDes = msgDes;
    }

    public String getMsgDes()
    {
        return msgDes;
    }
    public void setMsgImg(String msgImg)
    {
        this.msgImg = msgImg;
    }

    public String getMsgImg()
    {
        return msgImg;
    }
    public void setMsgName(String msgName)
    {
        this.msgName = msgName;
    }

    public String getMsgName()
    {
        return msgName;
    }
    public void setMsgTimer(Date msgTimer)
    {
        this.msgTimer = msgTimer;
    }

    public Date getMsgTimer()
    {
        return msgTimer;
    }
    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public Long getParentId()
    {
        return parentId;
    }
    public void setPoiId(Long poiId)
    {
        this.poiId = poiId;
    }

    public Long getPoiId()
    {
        return poiId;
    }

    public List<TbTalkContent> getChildren() {
        return Children;
    }

    public void setChildren(List<TbTalkContent> children) {
        Children = children;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("campusId", getCampusId())
            .append("msgDes", getMsgDes())
            .append("msgImg", getMsgImg())
            .append("msgName", getMsgName())
            .append("msgTimer", getMsgTimer())
            .append("parentId", getParentId())
            .append("poiId", getPoiId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
