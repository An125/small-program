package com.taotao.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EuDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品列表服务
 */
@Service
public class TbItemListServiceImpl implements TbItemListService {
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public EuDataGridResult getItemList(Integer pagr, Integer rows) {
        TbItemExample example = new TbItemExample();
        PageHelper.startPage(pagr,rows);
        List<TbItem> itemList = tbItemMapper.selectByExample(example);

        //创建返回值对象
        EuDataGridResult result = new EuDataGridResult();
        result.setRows(itemList);
        PageInfo<TbItem> pageInfo = new PageInfo<>(itemList);
        result.setTotal(pageInfo.getTotal());
        return result;

    }
}
