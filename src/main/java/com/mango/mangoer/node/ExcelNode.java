package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.ExcelExport;

/**
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class ExcelNode extends AbstractExportNode implements ExportNode {
	public ExcelNode(Map data) {
		super(EXCEL, data);
	}

	@Override
	public IExport getExport(){

		return new ExcelExport(data);
	}

}
