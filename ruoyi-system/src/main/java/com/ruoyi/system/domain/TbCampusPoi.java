package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 位置信息管理对象 tb_campus_poi
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
public class TbCampusPoi extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long poiid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String poiuuid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String poiname;

    /** 类型id */
    @Excel(name = "类型id")
    private Long poitype;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long poisubtype;

    /** 是否迎新,0不是,1是 */
    @Excel(name = "是否迎新,0不是,1是")
    private Long isforfreshman;

    /** 是否是热门景点，0不是，1是 */
    @Excel(name = "是否是热门景点，0不是，1是")
    private Long ishotspot;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long campusid;

    /** buildingID 或 草木PlantID */
    @Excel(name = "buildingID 或 草木PlantID")
    private Long objectid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal longitude;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal latitude;

    /** 高度 */
    @Excel(name = "高度")
    private Integer height;

    /** 相机坐标 */
    @Excel(name = "相机坐标")
    private String cameraview;

    /** 封面图片url */
    @Excel(name = "封面图片url")
    private String coverpicurl;

    /** 轮播图图片链接，多张图片由;隔开 */
    @Excel(name = "轮播图图片链接，多张图片由;隔开")
    private String picurls;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pic720url;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pic720defaultlng;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long pic720defaultlat;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String videourl;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String weburl;

    /** 简介 */
    @Excel(name = "简介")
    private String shortdescribe;

    /** 详情 */
    @Excel(name = "详情")
    private String detaildescribe;

    /** 存放单体化children对象 */
    @Excel(name = "存放单体化children对象")
    private String data;

    /** 存放pin children对象 前缀为buildPin_ */
    @Excel(name = "存放pin children对象 前缀为buildPin_")
    private String pindata;

    /** 0 存在 1 删除 */
    @Excel(name = "0 存在 1 删除")
    private Long state;

    public void setPoiid(Long poiid)
    {
        this.poiid = poiid;
    }

    public Long getPoiid()
    {
        return poiid;
    }
    public void setPoiuuid(String poiuuid)
    {
        this.poiuuid = poiuuid;
    }

    public String getPoiuuid()
    {
        return poiuuid;
    }
    public void setPoiname(String poiname)
    {
        this.poiname = poiname;
    }

    public String getPoiname()
    {
        return poiname;
    }
    public void setPoitype(Long poitype)
    {
        this.poitype = poitype;
    }

    public Long getPoitype()
    {
        return poitype;
    }
    public void setPoisubtype(Long poisubtype)
    {
        this.poisubtype = poisubtype;
    }

    public Long getPoisubtype()
    {
        return poisubtype;
    }
    public void setIsforfreshman(Long isforfreshman)
    {
        this.isforfreshman = isforfreshman;
    }

    public Long getIsforfreshman()
    {
        return isforfreshman;
    }
    public void setIshotspot(Long ishotspot)
    {
        this.ishotspot = ishotspot;
    }

    public Long getIshotspot()
    {
        return ishotspot;
    }
    public void setCampusid(Long campusid)
    {
        this.campusid = campusid;
    }

    public Long getCampusid()
    {
        return campusid;
    }
    public void setObjectid(Long objectid)
    {
        this.objectid = objectid;
    }

    public Long getObjectid()
    {
        return objectid;
    }
    public void setLongitude(BigDecimal longitude)
    {
        this.longitude = longitude;
    }

    public BigDecimal getLongitude()
    {
        return longitude;
    }
    public void setLatitude(BigDecimal latitude)
    {
        this.latitude = latitude;
    }

    public BigDecimal getLatitude()
    {
        return latitude;
    }
    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public Integer getHeight()
    {
        return height;
    }
    public void setCameraview(String cameraview)
    {
        this.cameraview = cameraview;
    }

    public String getCameraview()
    {
        return cameraview;
    }
    public void setCoverpicurl(String coverpicurl)
    {
        this.coverpicurl = coverpicurl;
    }

    public String getCoverpicurl()
    {
        return coverpicurl;
    }
    public void setPicurls(String picurls)
    {
        this.picurls = picurls;
    }

    public String getPicurls()
    {
        return picurls;
    }
    public void setPic720url(String pic720url)
    {
        this.pic720url = pic720url;
    }

    public String getPic720url()
    {
        return pic720url;
    }
    public void setPic720defaultlng(Long pic720defaultlng)
    {
        this.pic720defaultlng = pic720defaultlng;
    }

    public Long getPic720defaultlng()
    {
        return pic720defaultlng;
    }
    public void setPic720defaultlat(Long pic720defaultlat)
    {
        this.pic720defaultlat = pic720defaultlat;
    }

    public Long getPic720defaultlat()
    {
        return pic720defaultlat;
    }
    public void setVideourl(String videourl)
    {
        this.videourl = videourl;
    }

    public String getVideourl()
    {
        return videourl;
    }
    public void setWeburl(String weburl)
    {
        this.weburl = weburl;
    }

    public String getWeburl()
    {
        return weburl;
    }
    public void setShortdescribe(String shortdescribe)
    {
        this.shortdescribe = shortdescribe;
    }

    public String getShortdescribe()
    {
        return shortdescribe;
    }
    public void setDetaildescribe(String detaildescribe)
    {
        this.detaildescribe = detaildescribe;
    }

    public String getDetaildescribe()
    {
        return detaildescribe;
    }
    public void setData(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }
    public void setPindata(String pindata)
    {
        this.pindata = pindata;
    }

    public String getPindata()
    {
        return pindata;
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
            .append("poiid", getPoiid())
            .append("poiuuid", getPoiuuid())
            .append("poiname", getPoiname())
            .append("poitype", getPoitype())
            .append("poisubtype", getPoisubtype())
            .append("isforfreshman", getIsforfreshman())
            .append("ishotspot", getIshotspot())
            .append("campusid", getCampusid())
            .append("objectid", getObjectid())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("height", getHeight())
            .append("cameraview", getCameraview())
            .append("coverpicurl", getCoverpicurl())
            .append("picurls", getPicurls())
            .append("pic720url", getPic720url())
            .append("pic720defaultlng", getPic720defaultlng())
            .append("pic720defaultlat", getPic720defaultlat())
            .append("videourl", getVideourl())
            .append("weburl", getWeburl())
            .append("shortdescribe", getShortdescribe())
            .append("detaildescribe", getDetaildescribe())
            .append("data", getData())
            .append("pindata", getPindata())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("state", getState())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
