package com.taotao.controller;

import com.taotao.common.pojo.EuDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemListService;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class TbItemController {
    @Autowired
    private TbItemService tbItemService;

    @Autowired
    private TbItemListService listService;

    @RequestMapping("/{itemid}")
    public TbItem getItemById(@PathVariable Long itemid) {
        TbItem tbItem = tbItemService.getItemById(itemid);
        return tbItem;
    }

    @RequestMapping("/list")
    @ResponseBody
    public EuDataGridResult getItemList(@RequestParam(value = "page",defaultValue = "0") Integer page,
                                        @RequestParam(value = "rows",defaultValue = "10") Integer rows) {
        EuDataGridResult result = listService.getItemList(page, rows);
        return result;
    }
}
