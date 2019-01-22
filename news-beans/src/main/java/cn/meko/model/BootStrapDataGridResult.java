package cn.meko.model;

import java.util.List;
/**
 *@ClassName BootStrapDataGridResult
 *@Description TODO
 *@Author meko
 *@Date 19-1-20 上午12:46
 *@Version 1.0
 **/
public class BootStrapDataGridResult {
    private long total;
    private int page;
    private int rows ;
    private int totalPage;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    private List<?> rowsList;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<?> getRowsList() {
        return rowsList;
    }

    public void setRowsList(List<?> rowsList) {
        this.rowsList = rowsList;
    }
}
