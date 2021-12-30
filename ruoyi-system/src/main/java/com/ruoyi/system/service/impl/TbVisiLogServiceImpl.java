package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbVisiLogMapper;
import com.ruoyi.system.domain.TbVisiLog;
import com.ruoyi.system.service.ITbVisiLogService;

/**
 * 访问量Service业务层处理
 * 
 * @author 牛亚朦
 * @date 2021-12-28
 */
@Service
public class TbVisiLogServiceImpl implements ITbVisiLogService 
{
    @Autowired
    private TbVisiLogMapper tbVisiLogMapper;

    /**
     * 查询访问量
     * 
     * @param id 访问量主键
     * @return 访问量
     */
    @Override
    public TbVisiLog selectTbVisiLogById(Long id)
    {
        return tbVisiLogMapper.selectTbVisiLogById(id);
    }

    /**
     * 查询访问量列表
     * 
     * @param tbVisiLog 访问量
     * @return 访问量
     */
    @Override
    public List<TbVisiLog> selectTbVisiLogList(TbVisiLog tbVisiLog)
    {
        return tbVisiLogMapper.selectTbVisiLogList(tbVisiLog);
    }

    /**
     * 新增访问量
     * 
     * @param tbVisiLog 访问量
     * @return 结果
     */
    @Override
    public int insertTbVisiLog(TbVisiLog tbVisiLog)
    {
        tbVisiLog.setCreateTime(DateUtils.getNowDate());
        return tbVisiLogMapper.insertTbVisiLog(tbVisiLog);
    }

    /**
     * 修改访问量
     * 
     * @param tbVisiLog 访问量
     * @return 结果
     */
    @Override
    public int updateTbVisiLog(TbVisiLog tbVisiLog)
    {
        tbVisiLog.setUpdateTime(DateUtils.getNowDate());
        return tbVisiLogMapper.updateTbVisiLog(tbVisiLog);
    }

    /**
     * 批量删除访问量
     * 
     * @param ids 需要删除的访问量主键
     * @return 结果
     */
    @Override
    public int deleteTbVisiLogByIds(Long[] ids)
    {
        return tbVisiLogMapper.deleteTbVisiLogByIds(ids);
    }

    /**
     * 删除访问量信息
     * 
     * @param id 访问量主键
     * @return 结果
     */
    @Override
    public int deleteTbVisiLogById(Long id)
    {
        return tbVisiLogMapper.deleteTbVisiLogById(id);
    }
}
