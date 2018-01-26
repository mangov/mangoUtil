package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.PdfExport;

/**
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class PdfNode extends AbstractExportNode implements ExportNode {
	public PdfNode(Map data) {
		super(PDF, data);
	}

	@Override
	public IExport getExport()   {

		return new PdfExport(data);
	}

}
