package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbCampusPoiMapper;
import com.ruoyi.system.domain.TbCampusPoi;
import com.ruoyi.system.service.ITbCampusPoiService;

/**
 * 位置信息管理Service业务层处理
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
@Service
public class TbCampusPoiServiceImpl implements ITbCampusPoiService
{
    @Autowired
    private TbCampusPoiMapper tbCampusPoiMapper;

    /**
     * 查询位置信息管理
     *
     * @param poiid 位置信息管理主键
     * @return 位置信息管理
     */
    @Override
    public TbCampusPoi selectTbCampusPoiByPoiid(Long poiid)
    {
        return tbCampusPoiMapper.selectTbCampusPoiByPoiid(poiid);
    }

    /**
     * 查询位置信息管理列表
     *
     * @param tbCampusPoi 位置信息管理
     * @return 位置信息管理
     */
    @Override
    public List<TbCampusPoi> selectTbCampusPoiList(TbCampusPoi tbCampusPoi)
    {
        return tbCampusPoiMapper.selectTbCampusPoiList(tbCampusPoi);
    }

    /**
     * 新增位置信息管理
     *
     * @param tbCampusPoi 位置信息管理
     * @return 结果
     */
    @Override
    public int insertTbCampusPoi(TbCampusPoi tbCampusPoi)
    {
        tbCampusPoi.setCreateTime(DateUtils.getNowDate());
        return tbCampusPoiMapper.insertTbCampusPoi(tbCampusPoi);
    }

    /**
     * 修改位置信息管理
     *
     * @param tbCampusPoi 位置信息管理
     * @return 结果
     */
    @Override
    public int updateTbCampusPoi(TbCampusPoi tbCampusPoi)
    {
        tbCampusPoi.setUpdateTime(DateUtils.getNowDate());
        return tbCampusPoiMapper.updateTbCampusPoi(tbCampusPoi);
    }

    /**
     * 批量删除位置信息管理
     *
     * @param poiids 需要删除的位置信息管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCampusPoiByPoiids(Long[] poiids)
    {
        return tbCampusPoiMapper.deleteTbCampusPoiByPoiids(poiids);
    }

    /**
     * 删除位置信息管理信息
     *
     * @param poiid 位置信息管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCampusPoiByPoiid(Long poiid)
    {
        return tbCampusPoiMapper.deleteTbCampusPoiByPoiid(poiid);
    }
}
