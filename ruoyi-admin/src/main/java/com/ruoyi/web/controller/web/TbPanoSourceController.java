package com.ruoyi.web.controller.web;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TbPanoSource;
import com.ruoyi.system.service.ITbPanoSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 全景图Controller
 *
 * @author 牛亚朦
 * @date 2021-12-26
 */
@RestController
@RequestMapping("/TbPanoSource/panoSource")
public class TbPanoSourceController extends BaseController
{
    @Autowired
    private ITbPanoSourceService tbPanoSourceService;

    /**
     * 查询全景图列表
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbPanoSource tbPanoSource)
    {
        startPage();
        List<TbPanoSource> list = tbPanoSourceService.selectTbPanoSourceList(tbPanoSource);
        return getDataTable(list);
    }

    /**
     * 导出全景图列表
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:export')")
    @Log(title = "全景图", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbPanoSource tbPanoSource)
    {
        List<TbPanoSource> list = tbPanoSourceService.selectTbPanoSourceList(tbPanoSource);
        ExcelUtil<TbPanoSource> util = new ExcelUtil<TbPanoSource>(TbPanoSource.class);
        util.exportExcel(response, list, "全景图数据");
    }

    /**
     * 获取全景图详细信息
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:query')")
    @GetMapping(value = "/{sourceid}")
    public AjaxResult getInfo(@PathVariable("sourceid") Long sourceid)
    {
        return AjaxResult.success(tbPanoSourceService.selectTbPanoSourceBySourceid(sourceid));
    }

    /**
     * 新增全景图
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:add')")
    @Log(title = "全景图", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbPanoSource tbPanoSource)
    {
        return toAjax(tbPanoSourceService.insertTbPanoSource(tbPanoSource));
    }

    /**
     * 修改全景图
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:edit')")
    @Log(title = "全景图", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbPanoSource tbPanoSource)
    {
        return toAjax(tbPanoSourceService.updateTbPanoSource(tbPanoSource));
    }

    /**
     * 删除全景图
     */
    @PreAuthorize("@ss.hasPermi('TbPanoSource:panoSource:remove')")
    @Log(title = "全景图", businessType = BusinessType.DELETE)
	@DeleteMapping("/{sourceids}")
    public AjaxResult remove(@PathVariable Long[] sourceids)
    {
        return toAjax(tbPanoSourceService.deleteTbPanoSourceBySourceids(sourceids));
    }
}
