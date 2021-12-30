package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TbVisiLog;

/**
 * 访问量Service接口
 * 
 * @author 牛亚朦
 * @date 2021-12-28
 */
public interface ITbVisiLogService 
{
    /**
     * 查询访问量
     * 
     * @param id 访问量主键
     * @return 访问量
     */
    public TbVisiLog selectTbVisiLogById(Long id);

    /**
     * 查询访问量列表
     * 
     * @param tbVisiLog 访问量
     * @return 访问量集合
     */
    public List<TbVisiLog> selectTbVisiLogList(TbVisiLog tbVisiLog);

    /**
     * 新增访问量
     * 
     * @param tbVisiLog 访问量
     * @return 结果
     */
    public int insertTbVisiLog(TbVisiLog tbVisiLog);

    /**
     * 修改访问量
     * 
     * @param tbVisiLog 访问量
     * @return 结果
     */
    public int updateTbVisiLog(TbVisiLog tbVisiLog);

    /**
     * 批量删除访问量
     * 
     * @param ids 需要删除的访问量主键集合
     * @return 结果
     */
    public int deleteTbVisiLogByIds(Long[] ids);

    /**
     * 删除访问量信息
     * 
     * @param id 访问量主键
     * @return 结果
     */
    public int deleteTbVisiLogById(Long id);
}
