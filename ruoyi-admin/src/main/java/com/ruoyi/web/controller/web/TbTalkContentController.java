package com.ruoyi.web.controller.web;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TbCampusPoi;
import com.ruoyi.system.domain.TbTalkContent;
import com.ruoyi.system.service.ITbCampusPoiService;
import com.ruoyi.system.service.ITbTalkContentService;
import com.ruoyi.system.service.impl.TbCampusPoiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * 建筑论坛Controller
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
@RestController
@RequestMapping("/TbTalkContent/content")
public class TbTalkContentController extends BaseController
{
    @Autowired
    private ITbTalkContentService tbTalkContentService;

    @Autowired
    private ITbCampusPoiService tbCampusPoiService;

    /**
     * 查询建筑论坛列表
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbTalkContent tbTalkContent)
    {
        startPage();
        List<TbTalkContent> list = tbTalkContentService.selectTbTalkContentList(tbTalkContent);

        list.forEach(item->{
            TbCampusPoi tbCampusPoi = tbCampusPoiService.selectTbCampusPoiByPoiid(item.getPoiId());
            item.setPoiName(tbCampusPoi.getPoiname());

            TbTalkContent tbTalkContent1 = new TbTalkContent();

            tbTalkContent1.setParentId(item.getId());

            List<TbTalkContent> resultData1 = tbTalkContentService.selectTbTalkContentList(tbTalkContent1);

            if (resultData1 != null && !resultData1.isEmpty()){
                item.setChildren(resultData1);
            }

        });

        return getDataTable(list);
    }

    /**
     * 查询建筑论坛列表
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:getTalkList')")
    @GetMapping("/getTalkList")
    public AjaxResult listTalkContent(TbTalkContent tbTalkContent)
    {
        List<TbTalkContent> resultData = tbTalkContentService.selectTbTalkContentList(tbTalkContent);
        resultData.forEach(item->{

            TbTalkContent tbTalkContent1 = new TbTalkContent();

            tbTalkContent1.setParentId(item.getId());

            List<TbTalkContent> resultData1 = tbTalkContentService.selectTbTalkContentList(tbTalkContent1);

            if (resultData1 != null && !resultData1.isEmpty()){
                item.setChildren(resultData1);
            }
        });
        return AjaxResult.success(resultData);
    }

    /**
     * 导出建筑论坛列表
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:export')")
    @Log(title = "建筑论坛", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbTalkContent tbTalkContent)
    {
        List<TbTalkContent> list = tbTalkContentService.selectTbTalkContentList(tbTalkContent);
        ExcelUtil<TbTalkContent> util = new ExcelUtil<TbTalkContent>(TbTalkContent.class);
        util.exportExcel(response, list, "建筑论坛数据");
    }

    /**
     * 获取建筑论坛详细信息
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tbTalkContentService.selectTbTalkContentById(id));
    }

    /**
     * 新增建筑论坛
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:add')")
    @Log(title = "建筑论坛", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbTalkContent tbTalkContent)
    {
        tbTalkContent.setCreateTime(new Date());
        return toAjax(tbTalkContentService.insertTbTalkContent(tbTalkContent));
    }

    /**
     * 修改建筑论坛
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:edit')")
    @Log(title = "建筑论坛", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbTalkContent tbTalkContent)
    {
        return toAjax(tbTalkContentService.updateTbTalkContent(tbTalkContent));
    }

    /**
     * 删除建筑论坛
     */
    @PreAuthorize("@ss.hasPermi('TbTalkContent:content:remove')")
    @Log(title = "建筑论坛", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbTalkContentService.deleteTbTalkContentByIds(ids));
    }
}
