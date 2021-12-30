package com.ruoyi.web.controller.web;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.TbVisiLog;
import com.ruoyi.system.service.ITbVisiLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.utils.DateUtils;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 访问量Controller
 *
 * @author 牛亚朦
 * @date 2021-12-28
 */
@RestController
@RequestMapping("/TbVisiLog")
public class TbVisiLogController extends BaseController
{
    @Autowired
    private ITbVisiLogService tbVisiLogService;

    /**
     * 查询访问量列表
     */
    @PreAuthorize("@ss.hasPermi('system:TbVisiLog:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbVisiLog tbVisiLog)
    {
        startPage();
        List<TbVisiLog> list = tbVisiLogService.selectTbVisiLogList(tbVisiLog);
        return getDataTable(list);
    }

    /**
     * 导出访问量列表
     */
    @PreAuthorize("@ss.hasPermi('system:TbVisiLog:export')")
    @Log(title = "访问量", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbVisiLog tbVisiLog)
    {
        List<TbVisiLog> list = tbVisiLogService.selectTbVisiLogList(tbVisiLog);
        ExcelUtil<TbVisiLog> util = new ExcelUtil<TbVisiLog>(TbVisiLog.class);
        util.exportExcel(response, list, "访问量数据");
    }
    /**
     * 访问量
     */
    @PostMapping(value = "/visi")
    @PreAuthorize("@ss.hasPermi('TbVisiLog:list')")
    public AjaxResult visi(@RequestBody TbVisiLog tbVisiLog)
    {
        List<TbVisiLog> tbVisiLogs = tbVisiLogService.selectTbVisiLogList(tbVisiLog);

        Map<Date, List<TbVisiLog>> collect = tbVisiLogs.stream().collect(Collectors.groupingBy(TbVisiLog::getCreateTime));

        ArrayList<TbVisiLogWeb> objects = new ArrayList<TbVisiLogWeb>();

        collect.forEach((k,v)->{
            Map<Object, List<TbVisiLog>> collect1 = new HashMap<>();

            if ("2".equals(tbVisiLog.getVisiType())){
                collect1 = v.stream().collect(Collectors.groupingBy(TbVisiLog::getCampusId));
            }
            if (Integer.valueOf(tbVisiLog.getVisiType()) >= 3){
                collect1 = v.stream().collect(Collectors.groupingBy(TbVisiLog::getPoiName));
            }
            if ("1".equals(tbVisiLog.getVisiType())){
                TbVisiLogWeb tbVisiLogWeb = new TbVisiLogWeb();
                tbVisiLogWeb.setValue(v.size());
                tbVisiLogWeb.setWeek(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD,k));
                objects.add(tbVisiLogWeb);
            }
            collect1.forEach((k1,v1)->{
                TbVisiLog tbVisiLog2 = v1 == null  || v1.isEmpty()?new TbVisiLog(): v1.get(0);
//                stringObjectHashMap1.put("value",);
//                stringObjectHashMap1.put("campusId",k1);
//                stringObjectHashMap1.put("week",);
//                stringObjectHashMap1.put("poiName",tbVisiLog2.getPoiName());
//                stringObjectHashMap1.put("campusName",tbVisiLog2.getCampusName());
                objects.add(new TbVisiLogWeb(v1.size(),String.valueOf(k1),DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD,k),tbVisiLog2.getPoiName(),tbVisiLog2.getCampusName()));
            });
//            stringObjectHashMap.put("value",v.size());
//            stringObjectHashMap.put("week",k);
//            stringObjectHashMap.put("poiName",tbVisiLog1.getPoiName());
//            stringObjectHashMap.put("campusName",tbVisiLog1.getCampusName());

            //objects.add(stringObjectHashMap);

        });

        Stream<TbVisiLogWeb> sorted = objects.stream().sorted(Comparator.comparing(TbVisiLogWeb::getWeek));
        return AjaxResult.success(
                sorted
        );
    }
    /**
     * 获取访问量详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:TbVisiLog:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(tbVisiLogService.selectTbVisiLogById(id));
    }

    /**
     * 新增访问量
     */
    @PostMapping("/save")
    public AjaxResult add(@RequestBody TbVisiLog tbVisiLog)
    {
        return toAjax(tbVisiLogService.insertTbVisiLog(tbVisiLog));
    }

    /**
     * 修改访问量
     */
    @PreAuthorize("@ss.hasPermi('system:TbVisiLog:edit')")
    @Log(title = "访问量", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbVisiLog tbVisiLog)
    {
        return toAjax(tbVisiLogService.updateTbVisiLog(tbVisiLog));
    }

    /**
     * 删除访问量
     */
    @PreAuthorize("@ss.hasPermi('system:TbVisiLog:remove')")
    @Log(title = "访问量", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbVisiLogService.deleteTbVisiLogByIds(ids));
    }
}
