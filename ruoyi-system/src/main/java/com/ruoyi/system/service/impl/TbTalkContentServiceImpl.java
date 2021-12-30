package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.TbTalkContent;
import com.ruoyi.system.mapper.TbTalkContentMapper;
import com.ruoyi.system.service.ITbTalkContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 建筑论坛Service业务层处理
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
@Service
public class TbTalkContentServiceImpl implements ITbTalkContentService
{
    @Autowired
    private TbTalkContentMapper tbTalkContentMapper;

    /**
     * 查询建筑论坛
     *
     * @param id 建筑论坛主键
     * @return 建筑论坛
     */
    @Override
    public TbTalkContent selectTbTalkContentById(Long id)
    {
        return tbTalkContentMapper.selectTbTalkContentById(id);
    }

    /**
     * 查询建筑论坛列表
     *
     * @param tbTalkContent 建筑论坛
     * @return 建筑论坛
     */
    @Override
    public List<TbTalkContent> selectTbTalkContentList(TbTalkContent tbTalkContent)
    {
        return tbTalkContentMapper.selectTbTalkContentList(tbTalkContent);
    }

    /**
     * 新增建筑论坛
     *
     * @param tbTalkContent 建筑论坛
     * @return 结果
     */
    @Override
    public int insertTbTalkContent(TbTalkContent tbTalkContent)
    {
        tbTalkContent.setCreateTime(DateUtils.getNowDate());
        return tbTalkContentMapper.insertTbTalkContent(tbTalkContent);
    }

    /**
     * 修改建筑论坛
     *
     * @param tbTalkContent 建筑论坛
     * @return 结果
     */
    @Override
    public int updateTbTalkContent(TbTalkContent tbTalkContent)
    {
        tbTalkContent.setUpdateTime(DateUtils.getNowDate());
        return tbTalkContentMapper.updateTbTalkContent(tbTalkContent);
    }

    /**
     * 批量删除建筑论坛
     *
     * @param ids 需要删除的建筑论坛主键
     * @return 结果
     */
    @Override
    public int deleteTbTalkContentByIds(Long[] ids)
    {
        return tbTalkContentMapper.deleteTbTalkContentByIds(ids);
    }

    /**
     * 删除建筑论坛信息
     *
     * @param id 建筑论坛主键
     * @return 结果
     */
    @Override
    public int deleteTbTalkContentById(Long id)
    {
        return tbTalkContentMapper.deleteTbTalkContentById(id);
    }
}
