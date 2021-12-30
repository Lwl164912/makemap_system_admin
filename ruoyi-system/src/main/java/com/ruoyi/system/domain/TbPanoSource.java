package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * 全景图对象 tb_pano_source
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
public class TbPanoSource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long sourceid;

    /** 资源类型 */
    @Excel(name = "资源类型")
    private Long typeid;

    /** 资源名称 */
    @Excel(name = "资源名称")
    private String sourcename;

    /** 简介 */
    @Excel(name = "简介")
    private String brief;

    /** 校区 */
    @Excel(name = "校区")
    private Long campusid;

    /** 院系 */
    @Excel(name = "院系")
    private Long departmentid;

    /** 建筑 */
    @Excel(name = "建筑")
    private Long buildid;

    /** 楼层 */
    @Excel(name = "楼层")
    private Long floor;

    /** 所属服务id */
    @Excel(name = "所属服务id")
    private Long serviceid;

    /** 上传者 */
    @Excel(name = "上传者")
    private Long userid;

    /** 存储路径 */
    @Excel(name = "存储路径")
    private String sourceurl;

    /** 缩略图路径 */
    @Excel(name = "缩略图路径")
    private String thumburl;

    /** 全景图初始视角维度 */
    @Excel(name = "全景图初始视角维度")
    private BigDecimal latitude;

    /** 全景图初始视角经度 */
    @Excel(name = "全景图初始视角经度")
    private BigDecimal longitude;

    /** 资源大小 */
    @Excel(name = "资源大小")
    private String sourcesize;

    /** 初始为0，1表示删除 */
    @Excel(name = "初始为0，1表示删除")
    private Integer state;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal x;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal y;

    public void setSourceid(Long sourceid)
    {
        this.sourceid = sourceid;
    }

    public Long getSourceid()
    {
        return sourceid;
    }
    public void setTypeid(Long typeid)
    {
        this.typeid = typeid;
    }

    public Long getTypeid()
    {
        return typeid;
    }
    public void setSourcename(String sourcename)
    {
        this.sourcename = sourcename;
    }

    public String getSourcename()
    {
        return sourcename;
    }
    public void setBrief(String brief)
    {
        this.brief = brief;
    }

    public String getBrief()
    {
        return brief;
    }
    public void setCampusid(Long campusid)
    {
        this.campusid = campusid;
    }

    public Long getCampusid()
    {
        return campusid;
    }
    public void setDepartmentid(Long departmentid)
    {
        this.departmentid = departmentid;
    }

    public Long getDepartmentid()
    {
        return departmentid;
    }
    public void setBuildid(Long buildid)
    {
        this.buildid = buildid;
    }

    public Long getBuildid()
    {
        return buildid;
    }
    public void setFloor(Long floor)
    {
        this.floor = floor;
    }

    public Long getFloor()
    {
        return floor;
    }
    public void setServiceid(Long serviceid)
    {
        this.serviceid = serviceid;
    }

    public Long getServiceid()
    {
        return serviceid;
    }
    public void setUserid(Long userid)
    {
        this.userid = userid;
    }

    public Long getUserid()
    {
        return userid;
    }
    public void setSourceurl(String sourceurl)
    {
        this.sourceurl = sourceurl;
    }

    public String getSourceurl()
    {
        return sourceurl;
    }
    public void setThumburl(String thumburl)
    {
        this.thumburl = thumburl;
    }

    public String getThumburl()
    {
        return thumburl;
    }
    public void setLatitude(BigDecimal latitude)
    {
        this.latitude = latitude;
    }

    public BigDecimal getLatitude()
    {
        return latitude;
    }
    public void setLongitude(BigDecimal longitude)
    {
        this.longitude = longitude;
    }

    public BigDecimal getLongitude()
    {
        return longitude;
    }
    public void setSourcesize(String sourcesize)
    {
        this.sourcesize = sourcesize;
    }

    public String getSourcesize()
    {
        return sourcesize;
    }
    public void setState(Integer state)
    {
        this.state = state;
    }

    public Integer getState()
    {
        return state;
    }
    public void setX(BigDecimal x)
    {
        this.x = x;
    }

    public BigDecimal getX()
    {
        return x;
    }
    public void setY(BigDecimal y)
    {
        this.y = y;
    }

    public BigDecimal getY()
    {
        return y;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sourceid", getSourceid())
            .append("typeid", getTypeid())
            .append("sourcename", getSourcename())
            .append("brief", getBrief())
            .append("campusid", getCampusid())
            .append("departmentid", getDepartmentid())
            .append("buildid", getBuildid())
            .append("floor", getFloor())
            .append("serviceid", getServiceid())
            .append("userid", getUserid())
            .append("sourceurl", getSourceurl())
            .append("thumburl", getThumburl())
            .append("latitude", getLatitude())
            .append("longitude", getLongitude())
            .append("sourcesize", getSourcesize())
            .append("state", getState())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("x", getX())
            .append("y", getY())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}
