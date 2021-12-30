package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.TbPanoSource;
import com.ruoyi.system.mapper.TbPanoSourceMapper;
import com.ruoyi.system.service.ITbPanoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 全景图Service业务层处理
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
@Service
public class TbPanoSourceServiceImpl implements ITbPanoSourceService
{
    @Autowired
    private TbPanoSourceMapper tbPanoSourceMapper;

    /**
     * 查询全景图
     *
     * @param sourceid 全景图主键
     * @return 全景图
     */
    @Override
    public TbPanoSource selectTbPanoSourceBySourceid(Long sourceid)
    {
        return tbPanoSourceMapper.selectTbPanoSourceBySourceid(sourceid);
    }

    /**
     * 查询全景图列表
     *
     * @param tbPanoSource 全景图
     * @return 全景图
     */
    @Override
    public List<TbPanoSource> selectTbPanoSourceList(TbPanoSource tbPanoSource)
    {
        return tbPanoSourceMapper.selectTbPanoSourceList(tbPanoSource);
    }

    /**
     * 新增全景图
     *
     * @param tbPanoSource 全景图
     * @return 结果
     */
    @Override
    public int insertTbPanoSource(TbPanoSource tbPanoSource)
    {
        tbPanoSource.setCreateTime(DateUtils.getNowDate());
        return tbPanoSourceMapper.insertTbPanoSource(tbPanoSource);
    }

    /**
     * 修改全景图
     *
     * @param tbPanoSource 全景图
     * @return 结果
     */
    @Override
    public int updateTbPanoSource(TbPanoSource tbPanoSource)
    {
        tbPanoSource.setUpdateTime(DateUtils.getNowDate());
        return tbPanoSourceMapper.updateTbPanoSource(tbPanoSource);
    }

    /**
     * 批量删除全景图
     *
     * @param sourceids 需要删除的全景图主键
     * @return 结果
     */
    @Override
    public int deleteTbPanoSourceBySourceids(Long[] sourceids)
    {
        return tbPanoSourceMapper.deleteTbPanoSourceBySourceids(sourceids);
    }

    /**
     * 删除全景图信息
     *
     * @param sourceid 全景图主键
     * @return 结果
     */
    @Override
    public int deleteTbPanoSourceBySourceid(Long sourceid)
    {
        return tbPanoSourceMapper.deleteTbPanoSourceBySourceid(sourceid);
    }
}
