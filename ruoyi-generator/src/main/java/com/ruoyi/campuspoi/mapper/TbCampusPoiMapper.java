package com.ruoyi.campuspoi.mapper;

import java.util.List;
import com.ruoyi.campuspoi.domain.TbCampusPoi;

/**
 * 位置信息管理Mapper接口
 * 
 * @author 牛亚朦
 * @date 2021-12-23
 */
public interface TbCampusPoiMapper 
{
    /**
     * 查询位置信息管理
     * 
     * @param poiid 位置信息管理主键
     * @return 位置信息管理
     */
    public TbCampusPoi selectTbCampusPoiByPoiid(Long poiid);

    /**
     * 查询位置信息管理列表
     * 
     * @param tbCampusPoi 位置信息管理
     * @return 位置信息管理集合
     */
    public List<TbCampusPoi> selectTbCampusPoiList(TbCampusPoi tbCampusPoi);

    /**
     * 新增位置信息管理
     * 
     * @param tbCampusPoi 位置信息管理
     * @return 结果
     */
    public int insertTbCampusPoi(TbCampusPoi tbCampusPoi);

    /**
     * 修改位置信息管理
     * 
     * @param tbCampusPoi 位置信息管理
     * @return 结果
     */
    public int updateTbCampusPoi(TbCampusPoi tbCampusPoi);

    /**
     * 删除位置信息管理
     * 
     * @param poiid 位置信息管理主键
     * @return 结果
     */
    public int deleteTbCampusPoiByPoiid(Long poiid);

    /**
     * 批量删除位置信息管理
     * 
     * @param poiids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbCampusPoiByPoiids(Long[] poiids);
}
