package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.DocExport;

/**
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class DocNode extends AbstractExportNode implements ExportNode {
	public DocNode(Map data) {
		super(DOC, data);
	}

	@Override
	public IExport getExport() {

		return new DocExport(data);
	}

}
