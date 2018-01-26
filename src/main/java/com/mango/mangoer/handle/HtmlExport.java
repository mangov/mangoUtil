package com.mango.mangoer.handle;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.rendersnake.HtmlCanvas;

/**
 * 导出html实现
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class HtmlExport extends AbstractExport {

	public HtmlExport(Map data) {
		super(data);
	}

	@Override
	public void exportInnertion(OutputStream servletOut, List header, List data)
			throws IOException {
		String rendered = createHTML(header, data);
		servletOut.write(rendered.getBytes());

	}

	/**
	 * 生成表格
	 */
	public static String createHTML(List header, List data) throws IOException {
		HtmlCanvas html = new HtmlCanvas();
		html = html.html().body().table().tr();

		// 标题行
		Iterator it = header.iterator();
		while (it.hasNext()) {
			Map  head =  (Map)it.next();
			html =html.th().content(String.valueOf(head.get("title"))) ;
		}
		html =html._tr();
	
		// //数据
		it = data.iterator();
		
		while (it.hasNext()) {
			List item = (List)(it.next());
		 
			html =html.tr();
			Iterator sub = item.iterator();
			while (sub.hasNext()) {
			 
				html =html.td().content(String.valueOf(sub.next())) ;
			}
			html =html._tr();

		}
	

		
		html =html._table()._body()._html();

		// 火球htmlstring
		final String rendered = html.toHtml();

		return rendered;
	}
}
