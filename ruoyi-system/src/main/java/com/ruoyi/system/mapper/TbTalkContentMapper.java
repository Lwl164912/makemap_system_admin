package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbTalkContent;

import java.util.List;

/**
 * 建筑论坛Mapper接口
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
public interface TbTalkContentMapper
{
    /**
     * 查询建筑论坛
     *
     * @param id 建筑论坛主键
     * @return 建筑论坛
     */
    public TbTalkContent selectTbTalkContentById(Long id);

    /**
     * 查询建筑论坛列表
     *
     * @param tbTalkContent 建筑论坛
     * @return 建筑论坛集合
     */
    public List<TbTalkContent> selectTbTalkContentList(TbTalkContent tbTalkContent);

    /**
     * 新增建筑论坛
     *
     * @param tbTalkContent 建筑论坛
     * @return 结果
     */
    public int insertTbTalkContent(TbTalkContent tbTalkContent);

    /**
     * 修改建筑论坛
     *
     * @param tbTalkContent 建筑论坛
     * @return 结果
     */
    public int updateTbTalkContent(TbTalkContent tbTalkContent);

    /**
     * 删除建筑论坛
     *
     * @param id 建筑论坛主键
     * @return 结果
     */
    public int deleteTbTalkContentById(Long id);

    /**
     * 批量删除建筑论坛
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbTalkContentByIds(Long[] ids);
}
