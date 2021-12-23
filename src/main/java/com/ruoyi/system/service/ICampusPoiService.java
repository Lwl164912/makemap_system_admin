package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CampusPoi;

/**
 * 位置信息管理Service接口
 * 
 * @author 牛亚朦
 * @date 2021-12-23
 */
public interface ICampusPoiService 
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
     * 批量删除位置信息管理
     * 
     * @param poiids 需要删除的位置信息管理主键集合
     * @return 结果
     */
    public int deleteCampusPoiByPoiids(Long[] poiids);

    /**
     * 删除位置信息管理信息
     * 
     * @param poiid 位置信息管理主键
     * @return 结果
     */
    public int deleteCampusPoiByPoiid(Long poiid);
}
