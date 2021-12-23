package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CampusPoi;

/**
 * 位置信息管理Mapper接口
 * 
 * @author 牛亚朦
 * @date 2021-12-23
 */
public interface CampusPoiMapper 
{
    /**
     * 查询位置信息管理
     * 
     * @param poiid 位置信息管理主键
     * @return 位置信息管理
     */
    public CampusPoi selectCampusPoiByPoiid(Long poiid);

    /**
     * 查询位置信息管理列表
     * 
     * @param campusPoi 位置信息管理
     * @return 位置信息管理集合
     */
    public List<CampusPoi> selectCampusPoiList(CampusPoi campusPoi);

    /**
     * 新增位置信息管理
     * 
     * @param campusPoi 位置信息管理
     * @return 结果
     */
    public int insertCampusPoi(CampusPoi campusPoi);

    /**
     * 修改位置信息管理
     * 
     * @param campusPoi 位置信息管理
     * @return 结果
     */
    public int updateCampusPoi(CampusPoi campusPoi);

    /**
     * 删除位置信息管理
     * 
     * @param poiid 位置信息管理主键
     * @return 结果
     */
    public int deleteCampusPoiByPoiid(Long poiid);

    /**
     * 批量删除位置信息管理
     * 
     * @param poiids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCampusPoiByPoiids(Long[] poiids);
}
