package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.HtmlExport;

/**
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class HtmlNode extends AbstractExportNode implements ExportNode {
	public HtmlNode(Map data) {
		super(HTML, data);
	}

	@Override
	public IExport getExport()   {

		return new HtmlExport(data);
	}

}
