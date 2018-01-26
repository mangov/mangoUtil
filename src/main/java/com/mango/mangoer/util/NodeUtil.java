package com.mango.mangoer.util;

import java.util.Map;

import com.mango.mangoer.ExportNode;
import com.mango.mangoer.node.DocNode;
import com.mango.mangoer.node.ExcelNode;
import com.mango.mangoer.node.HtmlNode;
import com.mango.mangoer.node.PdfNode;
import com.mango.mangoer.node.TxtNode;
import com.mango.mangoer.node.XmlNode;

/**
 * 
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public final class NodeUtil {

	public static ExportNode createExportNode(Map data)  {
		ExportNode root = new ExcelNode(data);
		root.next(new PdfNode(data)).next(new HtmlNode(data)).next(
				new XmlNode(data)).next(new DocNode(data)).next(
				new TxtNode(data));
		return root;
	}
}
