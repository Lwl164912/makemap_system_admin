package com.ruoyi.web.controller.web;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TbCampus;
import com.ruoyi.system.service.ITbCampusService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 校园信息管理Controller
 *
 * @author 牛亚朦
 * @date 2021-12-23
 */
@RestController
@RequestMapping("/campus/campus")
public class TbCampusController extends BaseController
{
    @Autowired
    private ITbCampusService tbCampusService;

    /**
     * 查询校园信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbCampus tbCampus)
    {
        startPage();
        List<TbCampus> list = tbCampusService.selectTbCampusList(tbCampus);
        return getDataTable(list);
    }

    /**
     * 导出校园信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:export')")
    @Log(title = "校园信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbCampus tbCampus)
    {
        List<TbCampus> list = tbCampusService.selectTbCampusList(tbCampus);
        ExcelUtil<TbCampus> util = new ExcelUtil<TbCampus>(TbCampus.class);
        util.exportExcel(response, list, "校园信息管理数据");
    }

    /**
     * 获取校园信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:query')")
    @GetMapping(value = "/{campusid}")
    public AjaxResult getInfo(@PathVariable("campusid") Long campusid)
    {
        return AjaxResult.success(tbCampusService.selectTbCampusByCampusid(campusid));
    }

    /**
     * 新增校园信息管理
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:add')")
    @Log(title = "校园信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbCampus tbCampus)
    {
        return toAjax(tbCampusService.insertTbCampus(tbCampus));
    }

    /**
     * 修改校园信息管理
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:edit')")
    @Log(title = "校园信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbCampus tbCampus)
    {
        return toAjax(tbCampusService.updateTbCampus(tbCampus));
    }

    /**
     * 删除校园信息管理
     */
    @PreAuthorize("@ss.hasPermi('campus:campus:remove')")
    @Log(title = "校园信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{campusids}")
    public AjaxResult remove(@PathVariable Long[] campusids)
    {
        return toAjax(tbCampusService.deleteTbCampusByCampusids(campusids));
    }
}
