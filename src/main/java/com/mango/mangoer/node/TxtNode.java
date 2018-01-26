package com.mango.mangoer.node;

import java.util.Map;

import com.mango.mangoer.AbstractExportNode;
import com.mango.mangoer.ExportNode;
import com.mango.mangoer.IExport;
import com.mango.mangoer.handle.TxtExport;

/**
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class TxtNode extends AbstractExportNode implements ExportNode {
	public TxtNode(Map data) {
		super(TXT, data);
	}

	@Override
	public IExport getExport()   {

		return new TxtExport(data);
	}

}
