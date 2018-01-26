package  com.mango.mangoer;

import com.mango.mangoer.exp.NodeException;

/**
 * 导出
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public interface ExportNode {
	IExport node(String name) throws NodeException;

	public ExportNode next(ExportNode next);

	String EXCEL = "excel";
	String HTML = "html";
	String PDF = "pdf";
	String XML = "xml";
	String TXT = "txt";
	String DOC = "doc";

}
