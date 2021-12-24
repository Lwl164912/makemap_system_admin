package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TbCampus;

/**
 * 校园信息管理Service接口
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
public interface ITbCampusService
{
    /**
     * 查询校园信息管理
     *
     * @param campusid 校园信息管理主键
     * @return 校园信息管理
     */
    public TbCampus selectTbCampusByCampusid(Long campusid);

    /**
     * 查询校园信息管理列表
     *
     * @param tbCampus 校园信息管理
     * @return 校园信息管理集合
     */
    public List<TbCampus> selectTbCampusList(TbCampus tbCampus);

    /**
     * 新增校园信息管理
     *
     * @param tbCampus 校园信息管理
     * @return 结果
     */
    public int insertTbCampus(TbCampus tbCampus);

    /**
     * 修改校园信息管理
     *
     * @param tbCampus 校园信息管理
     * @return 结果
     */
    public int updateTbCampus(TbCampus tbCampus);

    /**
     * 批量删除校园信息管理
     *
     * @param campusids 需要删除的校园信息管理主键集合
     * @return 结果
     */
    public int deleteTbCampusByCampusids(Long[] campusids);

    /**
     * 删除校园信息管理信息
     *
     * @param campusid 校园信息管理主键
     * @return 结果
     */
    public int deleteTbCampusByCampusid(Long campusid);
}
