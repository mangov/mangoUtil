package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.XmlExport;

/**
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class XmlNode extends AbstractExportNode implements ExportNode {
	public XmlNode(Map data) {
		super(XML, data);
	}

	@Override
	public IExport getExport()   {

		return new XmlExport(data);
	}

}
