package com.njust.utils;

import java.util.List;

public class Page<T> {
   //分页工具
	private int total;//总条数
	private int page;//表示从第几条开始，前面默认为1
	private int size;//显示数量
    private List<T> rows;//数据
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
    

    
}
