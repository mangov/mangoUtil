package com.mango.mangoer.handle;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 导出txt
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class TxtExport extends AbstractExport {

	public TxtExport(Map data) {
		super(data);
	}

	@Override
    public void exportInnertion(OutputStream servletOut, List header,
			List data) throws IOException {
		StringBuilder br = new StringBuilder();
		Iterator it = header.iterator();
		while (it.hasNext()) {
			Map hd = (Map) it.next();
			String title = (String) hd.get(TITLE);
			br.append(title + TAB);
		}

		if (br.length() > 0) {
			br.append(ENTER);
		}

		it = data.iterator();
		while (it.hasNext()) {
			List hd = (List) it.next();
			Iterator sub = hd.iterator();
			while (sub.hasNext()) {
				br.append(sub.next() + TAB);
			}
			br.append(ENTER);
		}
		if (br.length() > 0) {
			servletOut.write(br.toString().getBytes());
		}

	}

}
