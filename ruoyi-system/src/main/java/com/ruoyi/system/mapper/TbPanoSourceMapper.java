package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbPanoSource;

import java.util.List;

/**
 * 全景图Mapper接口
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
public interface TbPanoSourceMapper
{
    /**
     * 查询全景图
     *
     * @param sourceid 全景图主键
     * @return 全景图
     */
    public TbPanoSource selectTbPanoSourceBySourceid(Long sourceid);

    /**
     * 查询全景图列表
     *
     * @param tbPanoSource 全景图
     * @return 全景图集合
     */
    public List<TbPanoSource> selectTbPanoSourceList(TbPanoSource tbPanoSource);

    /**
     * 新增全景图
     *
     * @param tbPanoSource 全景图
     * @return 结果
     */
    public int insertTbPanoSource(TbPanoSource tbPanoSource);

    /**
     * 修改全景图
     *
     * @param tbPanoSource 全景图
     * @return 结果
     */
    public int updateTbPanoSource(TbPanoSource tbPanoSource);

    /**
     * 删除全景图
     *
     * @param sourceid 全景图主键
     * @return 结果
     */
    public int deleteTbPanoSourceBySourceid(Long sourceid);

    /**
     * 批量删除全景图
     *
     * @param sourceids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbPanoSourceBySourceids(Long[] sourceids);
}
