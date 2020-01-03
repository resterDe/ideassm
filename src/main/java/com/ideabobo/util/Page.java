package com.ideabobo.util;

import java.util.List;

public class Page {
	public Page(){
		this.pageNo=1;
		this.pageSize=10;
	}
	public Object model;
	public Integer pageNo;
	public Integer pageSize;
	public List rows;
	public Long total;
	public List footer;
}
