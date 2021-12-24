package com.ruoyi.web.controller.web;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
import com.ruoyi.system.domain.TbPoiType;
import com.ruoyi.system.service.ITbPoiTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 位置点类型管理Controller
 *
 * @author 牛亚朦
 * @date 2021-12-24
 */
@RestController
@RequestMapping("/TbPoiType/type")
public class TbPoiTypeController extends BaseController
{
    @Autowired
    private ITbPoiTypeService tbPoiTypeService;

    /**
     * 查询位置点类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbPoiType tbPoiType)
    {
        startPage();
        List<TbPoiType> list = tbPoiTypeService.selectTbPoiTypeList(tbPoiType);
        return getDataTable(list);
    }

    /**
     * 查询位置点类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:list')")
    @GetMapping("/listAll")
    public AjaxResult list()
    {
        List<TbPoiType> list = tbPoiTypeService.selectTbPoiTypeListAll();

//        Map<Long, List<TbPoiType>> collect = list.stream().collect(Collectors.groupingBy(TbPoiType::getParenttype));

        return AjaxResult.success(list);
    }

    /**
     * 导出位置点类型管理列表
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:export')")
    @Log(title = "位置点类型管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbPoiType tbPoiType)
    {
        List<TbPoiType> list = tbPoiTypeService.selectTbPoiTypeList(tbPoiType);
        ExcelUtil<TbPoiType> util = new ExcelUtil<TbPoiType>(TbPoiType.class);
        util.exportExcel(response, list, "位置点类型管理数据");
    }

    /**
     * 获取位置点类型管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:query')")
    @GetMapping(value = "/{poitype}")
    public AjaxResult getInfo(@PathVariable("poitype") Long poitype)
    {
        return AjaxResult.success(tbPoiTypeService.selectTbPoiTypeByPoitype(poitype));
    }

    /**
     * 新增位置点类型管理
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:add')")
    @Log(title = "位置点类型管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbPoiType tbPoiType)
    {
        return toAjax(tbPoiTypeService.insertTbPoiType(tbPoiType));
    }

    /**
     * 修改位置点类型管理
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:edit')")
    @Log(title = "位置点类型管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbPoiType tbPoiType)
    {
        return toAjax(tbPoiTypeService.updateTbPoiType(tbPoiType));
    }

    /**
     * 删除位置点类型管理
     */
    @PreAuthorize("@ss.hasPermi('TbPoiType:type:remove')")
    @Log(title = "位置点类型管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{poitypes}")
    public AjaxResult remove(@PathVariable Long[] poitypes)
    {
        return toAjax(tbPoiTypeService.deleteTbPoiTypeByPoitypes(poitypes));
    }
}
