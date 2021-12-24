package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.TbPoiType;
import com.ruoyi.system.mapper.TbPoiTypeMapper;
import com.ruoyi.system.service.ITbPoiTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 位置点类型管理Service业务层处理
 *
 * @author 牛亚朦
 * @date 2021-12-24
 */
@Service
public class TbPoiTypeServiceImpl implements ITbPoiTypeService
{
    @Autowired
    private TbPoiTypeMapper tbPoiTypeMapper;

    /**
     * 查询位置点类型管理
     *
     * @param poitype 位置点类型管理主键
     * @return 位置点类型管理
     */
    @Override
    public TbPoiType selectTbPoiTypeByPoitype(Long poitype)
    {
        return tbPoiTypeMapper.selectTbPoiTypeByPoitype(poitype);
    }

    /**
     * 查询位置点类型管理列表
     *
     * @param tbPoiType 位置点类型管理
     * @return 位置点类型管理
     */
    @Override
    public List<TbPoiType> selectTbPoiTypeList(TbPoiType tbPoiType)
    {
        return tbPoiTypeMapper.selectTbPoiTypeList(tbPoiType);
    }

    /**
     * 查询位置点类型管理列表
     *
     * @return 位置点类型管理
     */
    @Override
    public List<TbPoiType> selectTbPoiTypeListAll()
    {
        return tbPoiTypeMapper.selectTbPoiTypeListAll();
    }

    /**
     * 新增位置点类型管理
     *
     * @param tbPoiType 位置点类型管理
     * @return 结果
     */
    @Override
    public int insertTbPoiType(TbPoiType tbPoiType)
    {
        tbPoiType.setCreateTime(DateUtils.getNowDate());
        return tbPoiTypeMapper.insertTbPoiType(tbPoiType);
    }

    /**
     * 修改位置点类型管理
     *
     * @param tbPoiType 位置点类型管理
     * @return 结果
     */
    @Override
    public int updateTbPoiType(TbPoiType tbPoiType)
    {
        tbPoiType.setUpdateTime(DateUtils.getNowDate());
        return tbPoiTypeMapper.updateTbPoiType(tbPoiType);
    }

    /**
     * 批量删除位置点类型管理
     *
     * @param poitypes 需要删除的位置点类型管理主键
     * @return 结果
     */
    @Override
    public int deleteTbPoiTypeByPoitypes(Long[] poitypes)
    {
        return tbPoiTypeMapper.deleteTbPoiTypeByPoitypes(poitypes);
    }

    /**
     * 删除位置点类型管理信息
     *
     * @param poitype 位置点类型管理主键
     * @return 结果
     */
    @Override
    public int deleteTbPoiTypeByPoitype(Long poitype)
    {
        return tbPoiTypeMapper.deleteTbPoiTypeByPoitype(poitype);
    }
}
