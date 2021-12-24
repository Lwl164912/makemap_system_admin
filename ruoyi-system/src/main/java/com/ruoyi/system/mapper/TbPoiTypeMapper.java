package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbPoiType;

import java.util.List;

/**
 * 位置点类型管理Mapper接口
 *
 * @author 牛亚朦
 * @date 2021-12-24
 */
public interface TbPoiTypeMapper
{
    /**
     * 查询位置点类型管理
     *
     * @param poitype 位置点类型管理主键
     * @return 位置点类型管理
     */
    public TbPoiType selectTbPoiTypeByPoitype(Long poitype);

    /**
     * 查询位置点类型管理列表
     *
     * @param tbPoiType 位置点类型管理
     * @return 位置点类型管理集合
     */
    public List<TbPoiType> selectTbPoiTypeList(TbPoiType tbPoiType);
    /**
     * 查询位置点类型管理列表
     *
     * @return 位置点类型管理集合
     */
    public List<TbPoiType> selectTbPoiTypeListAll();

    /**
     * 新增位置点类型管理
     *
     * @param tbPoiType 位置点类型管理
     * @return 结果
     */
    public int insertTbPoiType(TbPoiType tbPoiType);

    /**
     * 修改位置点类型管理
     *
     * @param tbPoiType 位置点类型管理
     * @return 结果
     */
    public int updateTbPoiType(TbPoiType tbPoiType);

    /**
     * 删除位置点类型管理
     *
     * @param poitype 位置点类型管理主键
     * @return 结果
     */
    public int deleteTbPoiTypeByPoitype(Long poitype);

    /**
     * 批量删除位置点类型管理
     *
     * @param poitypes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbPoiTypeByPoitypes(Long[] poitypes);
}
