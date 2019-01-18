package com.taotao.common.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.List;

public class EuDataGridResult {
    private Long total;
    private List<?> rows;

    public EuDataGridResult(Long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "EuDataGridResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public EuDataGridResult() {
    }
}
