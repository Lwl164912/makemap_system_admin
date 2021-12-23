package com.ruoyi.system.controller;

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
import com.ruoyi.system.domain.CampusPoi;
import com.ruoyi.system.service.ICampusPoiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 位置信息管理Controller
 * 
 * @author 牛亚朦
 * @date 2021-12-23
 */
@RestController
@RequestMapping("/campuspoi/poi")
public class CampusPoiController extends BaseController
{
    @Autowired
    private ICampusPoiService campusPoiService;

    /**
     * 查询位置信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:list')")
    @GetMapping("/list")
    public TableDataInfo list(CampusPoi campusPoi)
    {
        startPage();
        List<CampusPoi> list = campusPoiService.selectCampusPoiList(campusPoi);
        return getDataTable(list);
    }

    /**
     * 导出位置信息管理列表
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:export')")
    @Log(title = "位置信息管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CampusPoi campusPoi)
    {
        List<CampusPoi> list = campusPoiService.selectCampusPoiList(campusPoi);
        ExcelUtil<CampusPoi> util = new ExcelUtil<CampusPoi>(CampusPoi.class);
        util.exportExcel(response, list, "位置信息管理数据");
    }

    /**
     * 获取位置信息管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:query')")
    @GetMapping(value = "/{poiid}")
    public AjaxResult getInfo(@PathVariable("poiid") Long poiid)
    {
        return AjaxResult.success(campusPoiService.selectCampusPoiByPoiid(poiid));
    }

    /**
     * 新增位置信息管理
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:add')")
    @Log(title = "位置信息管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CampusPoi campusPoi)
    {
        return toAjax(campusPoiService.insertCampusPoi(campusPoi));
    }

    /**
     * 修改位置信息管理
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:edit')")
    @Log(title = "位置信息管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CampusPoi campusPoi)
    {
        return toAjax(campusPoiService.updateCampusPoi(campusPoi));
    }

    /**
     * 删除位置信息管理
     */
    @PreAuthorize("@ss.hasPermi('campuspoi:poi:remove')")
    @Log(title = "位置信息管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{poiids}")
    public AjaxResult remove(@PathVariable Long[] poiids)
    {
        return toAjax(campusPoiService.deleteCampusPoiByPoiids(poiids));
    }
}
