package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CampusPoiMapper;
import com.ruoyi.system.domain.CampusPoi;
import com.ruoyi.system.service.ICampusPoiService;

/**
 * 位置信息管理Service业务层处理
 * 
 * @author 牛亚朦
 * @date 2021-12-23
 */
@Service
public class CampusPoiServiceImpl implements ICampusPoiService 
{
    @Autowired
    private CampusPoiMapper campusPoiMapper;

    /**
     * 查询位置信息管理
     * 
     * @param poiid 位置信息管理主键
     * @return 位置信息管理
     */
    @Override
    public CampusPoi selectCampusPoiByPoiid(Long poiid)
    {
        return campusPoiMapper.selectCampusPoiByPoiid(poiid);
    }

    /**
     * 查询位置信息管理列表
     * 
     * @param campusPoi 位置信息管理
     * @return 位置信息管理
     */
    @Override
    public List<CampusPoi> selectCampusPoiList(CampusPoi campusPoi)
    {
        return campusPoiMapper.selectCampusPoiList(campusPoi);
    }

    /**
     * 新增位置信息管理
     * 
     * @param campusPoi 位置信息管理
     * @return 结果
     */
    @Override
    public int insertCampusPoi(CampusPoi campusPoi)
    {
        return campusPoiMapper.insertCampusPoi(campusPoi);
    }

    /**
     * 修改位置信息管理
     * 
     * @param campusPoi 位置信息管理
     * @return 结果
     */
    @Override
    public int updateCampusPoi(CampusPoi campusPoi)
    {
        return campusPoiMapper.updateCampusPoi(campusPoi);
    }

    /**
     * 批量删除位置信息管理
     * 
     * @param poiids 需要删除的位置信息管理主键
     * @return 结果
     */
    @Override
    public int deleteCampusPoiByPoiids(Long[] poiids)
    {
        return campusPoiMapper.deleteCampusPoiByPoiids(poiids);
    }

    /**
     * 删除位置信息管理信息
     * 
     * @param poiid 位置信息管理主键
     * @return 结果
     */
    @Override
    public int deleteCampusPoiByPoiid(Long poiid)
    {
        return campusPoiMapper.deleteCampusPoiByPoiid(poiid);
    }
}
