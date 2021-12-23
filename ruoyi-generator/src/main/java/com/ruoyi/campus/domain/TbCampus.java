package com.ruoyi.campus.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 校园信息管理对象 tb_campus
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
public class TbCampus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 校区id */
    private Long campusid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String campusname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String campusshortname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long cityid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cityname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String address;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long sortindex;

    /** 图片url */
    @Excel(name = "图片url")
    private String picurl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String map3durl;

    /** 详情 */
    @Excel(name = "详情")
    private String describe;

    /** 存放children对象 */
    @Excel(name = "存放children对象")
    private String edgebaidu;

    /** 贴图左上角经度 */
    @Excel(name = "贴图左上角经度")
    private BigDecimal ltlongitudegaode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal ltlatitudegaode;

    /** 贴图右下角经度 */
    @Excel(name = "贴图右下角经度")
    private BigDecimal rblongitudegaode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal rblatitudegaode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal centerlongitudebaidu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal centerlatitudebaidu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal centerlongitudegaode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal centerlatitudegaode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer scalelevelbaidu;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Integer scalelevelgaode;

    /** 相机坐标,隔开 */
    @Excel(name = "相机坐标,隔开")
    private Integer camerahead;

    /** 倾斜 */
    @Excel(name = "倾斜")
    private Integer cameratilt;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private Integer createyear;

    /** 0 存在 1 删除 */
    @Excel(name = "0 存在 1 删除")
    private Long state;

    public void setCampusid(Long campusid)
    {
        this.campusid = campusid;
    }

    public Long getCampusid()
    {
        return campusid;
    }
    public void setCampusname(String campusname)
    {
        this.campusname = campusname;
    }

    public String getCampusname()
    {
        return campusname;
    }
    public void setCampusshortname(String campusshortname)
    {
        this.campusshortname = campusshortname;
    }

    public String getCampusshortname()
    {
        return campusshortname;
    }
    public void setCityid(Long cityid)
    {
        this.cityid = cityid;
    }

    public Long getCityid()
    {
        return cityid;
    }
    public void setCityname(String cityname)
    {
        this.cityname = cityname;
    }

    public String getCityname()
    {
        return cityname;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setSortindex(Long sortindex)
    {
        this.sortindex = sortindex;
    }

    public Long getSortindex()
    {
        return sortindex;
    }
    public void setPicurl(String picurl)
    {
        this.picurl = picurl;
    }

    public String getPicurl()
    {
        return picurl;
    }
    public void setMap3durl(String map3durl)
    {
        this.map3durl = map3durl;
    }

    public String getMap3durl()
    {
        return map3durl;
    }
    public void setDescribe(String describe)
    {
        this.describe = describe;
    }

    public String getDescribe()
    {
        return describe;
    }
    public void setEdgebaidu(String edgebaidu)
    {
        this.edgebaidu = edgebaidu;
    }

    public String getEdgebaidu()
    {
        return edgebaidu;
    }
    public void setLtlongitudegaode(BigDecimal ltlongitudegaode)
    {
        this.ltlongitudegaode = ltlongitudegaode;
    }

    public BigDecimal getLtlongitudegaode()
    {
        return ltlongitudegaode;
    }
    public void setLtlatitudegaode(BigDecimal ltlatitudegaode)
    {
        this.ltlatitudegaode = ltlatitudegaode;
    }

    public BigDecimal getLtlatitudegaode()
    {
        return ltlatitudegaode;
    }
    public void setRblongitudegaode(BigDecimal rblongitudegaode)
    {
        this.rblongitudegaode = rblongitudegaode;
    }

    public BigDecimal getRblongitudegaode()
    {
        return rblongitudegaode;
    }
    public void setRblatitudegaode(BigDecimal rblatitudegaode)
    {
        this.rblatitudegaode = rblatitudegaode;
    }

    public BigDecimal getRblatitudegaode()
    {
        return rblatitudegaode;
    }
    public void setCenterlongitudebaidu(BigDecimal centerlongitudebaidu)
    {
        this.centerlongitudebaidu = centerlongitudebaidu;
    }

    public BigDecimal getCenterlongitudebaidu()
    {
        return centerlongitudebaidu;
    }
    public void setCenterlatitudebaidu(BigDecimal centerlatitudebaidu)
    {
        this.centerlatitudebaidu = centerlatitudebaidu;
    }

    public BigDecimal getCenterlatitudebaidu()
    {
        return centerlatitudebaidu;
    }
    public void setCenterlongitudegaode(BigDecimal centerlongitudegaode)
    {
        this.centerlongitudegaode = centerlongitudegaode;
    }

    public BigDecimal getCenterlongitudegaode()
    {
        return centerlongitudegaode;
    }
    public void setCenterlatitudegaode(BigDecimal centerlatitudegaode)
    {
        this.centerlatitudegaode = centerlatitudegaode;
    }

    public BigDecimal getCenterlatitudegaode()
    {
        return centerlatitudegaode;
    }
    public void setScalelevelbaidu(Integer scalelevelbaidu)
    {
        this.scalelevelbaidu = scalelevelbaidu;
    }

    public Integer getScalelevelbaidu()
    {
        return scalelevelbaidu;
    }
    public void setScalelevelgaode(Integer scalelevelgaode)
    {
        this.scalelevelgaode = scalelevelgaode;
    }

    public Integer getScalelevelgaode()
    {
        return scalelevelgaode;
    }
    public void setCamerahead(Integer camerahead)
    {
        this.camerahead = camerahead;
    }

    public Integer getCamerahead()
    {
        return camerahead;
    }
    public void setCameratilt(Integer cameratilt)
    {
        this.cameratilt = cameratilt;
    }

    public Integer getCameratilt()
    {
        return cameratilt;
    }
    public void setCreateyear(Integer createyear)
    {
        this.createyear = createyear;
    }

    public Integer getCreateyear()
    {
        return createyear;
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
            .append("campusid", getCampusid())
            .append("campusname", getCampusname())
            .append("campusshortname", getCampusshortname())
            .append("cityid", getCityid())
            .append("cityname", getCityname())
            .append("address", getAddress())
            .append("sortindex", getSortindex())
            .append("picurl", getPicurl())
            .append("map3durl", getMap3durl())
            .append("describe", getDescribe())
            .append("edgebaidu", getEdgebaidu())
            .append("ltlongitudegaode", getLtlongitudegaode())
            .append("ltlatitudegaode", getLtlatitudegaode())
            .append("rblongitudegaode", getRblongitudegaode())
            .append("rblatitudegaode", getRblatitudegaode())
            .append("centerlongitudebaidu", getCenterlongitudebaidu())
            .append("centerlatitudebaidu", getCenterlatitudebaidu())
            .append("centerlongitudegaode", getCenterlongitudegaode())
            .append("centerlatitudegaode", getCenterlatitudegaode())
            .append("scalelevelbaidu", getScalelevelbaidu())
            .append("scalelevelgaode", getScalelevelgaode())
            .append("camerahead", getCamerahead())
            .append("cameratilt", getCameratilt())
            .append("createyear", getCreateyear())
            .append("updatetime", getUpdateTime())
            .append("state", getState())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
