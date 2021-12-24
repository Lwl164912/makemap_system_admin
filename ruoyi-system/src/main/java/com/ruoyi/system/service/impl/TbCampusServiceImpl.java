package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbCampusMapper;
import com.ruoyi.system.domain.TbCampus;
import com.ruoyi.system.service.ITbCampusService;

/**
 * 校园信息管理Service业务层处理
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
@Service
public class TbCampusServiceImpl implements ITbCampusService
{
    @Autowired
    private TbCampusMapper tbCampusMapper;

    /**
     * 查询校园信息管理
     *
     * @param campusid 校园信息管理主键
     * @return 校园信息管理
     */
    @Override
    public TbCampus selectTbCampusByCampusid(Long campusid)
    {
        return tbCampusMapper.selectTbCampusByCampusid(campusid);
    }

    /**
     * 查询校园信息管理列表
     *
     * @param tbCampus 校园信息管理
     * @return 校园信息管理
     */
    @Override
    public List<TbCampus> selectTbCampusList(TbCampus tbCampus)
    {
        return tbCampusMapper.selectTbCampusList(tbCampus);
    }

    /**
     * 新增校园信息管理
     *
     * @param tbCampus 校园信息管理
     * @return 结果
     */
    @Override
    public int insertTbCampus(TbCampus tbCampus)
    {
        tbCampus.setCreateTime(DateUtils.getNowDate());
        return tbCampusMapper.insertTbCampus(tbCampus);
    }

    /**
     * 修改校园信息管理
     *
     * @param tbCampus 校园信息管理
     * @return 结果
     */
    @Override
    public int updateTbCampus(TbCampus tbCampus)
    {
        tbCampus.setUpdateTime(DateUtils.getNowDate());
        return tbCampusMapper.updateTbCampus(tbCampus);
    }

    /**
     * 批量删除校园信息管理
     *
     * @param campusids 需要删除的校园信息管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCampusByCampusids(Long[] campusids)
    {
        return tbCampusMapper.deleteTbCampusByCampusids(campusids);
    }

    /**
     * 删除校园信息管理信息
     *
     * @param campusid 校园信息管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCampusByCampusid(Long campusid)
    {
        return tbCampusMapper.deleteTbCampusByCampusid(campusid);
    }
}
