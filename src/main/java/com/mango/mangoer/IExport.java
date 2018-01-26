package  com.mango.mangoer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 导出抽象接口到到输出流
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */

public interface IExport {
	String TAB = "\t\t\t";
	String ENTER = "\r\n";

	//导出
    void export(OutputStream servletOut) throws IOException;

	String HEADER = "header";
	String DATA = "data";
	
	String TITLE="title";
}
