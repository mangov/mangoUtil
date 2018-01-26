package com.mango.mangoer;

import java.util.Map;

import com.mango.mangoer.exp.NodeException;

/**
 * 导出类型查找实现d
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public abstract class AbstractExportNode implements ExportNode {
	protected String name = "";
	protected Map data;// //数据
/**
 * 
 * @param name  定义导出类型
 */
	public AbstractExportNode(String name, Map data) {
		this.name = name;
		this.data = data;
	}

	private ExportNode next;

	public ExportNode next(ExportNode next) {
		this.next = next;
		return next;
	}

 
	public abstract IExport getExport() ;

	public IExport node(String name) throws NodeException {
		if (this.name.equals(name)) {
			return this.getExport();
		} else {
			if (next == null) {
				throw new NodeException("已经到达结位！");
			}
			return next.node(name);
		}
	}

}
