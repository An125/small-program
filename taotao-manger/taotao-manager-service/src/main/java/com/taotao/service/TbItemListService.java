package com.taotao.service;

import com.taotao.common.pojo.EuDataGridResult;

public interface TbItemListService {
    EuDataGridResult getItemList(Integer pagr,Integer rows);
}
