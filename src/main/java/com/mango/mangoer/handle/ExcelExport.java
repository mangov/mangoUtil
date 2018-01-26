package com.mango.mangoer.handle;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.mango.mangoer.util.ExcelUtil;

/**
 * ，使用POI组件，导出excel
 * 
 * @author zr
 * 有问题请联系 微信：mangoQvQ
 * 
 */
public class ExcelExport extends AbstractExport {

	public ExcelExport(Map data) {
		super(data);
	}

	@Override
    public void exportInnertion(OutputStream servletOut, List header,
			List data) throws IOException {
		if (header == null || header.isEmpty()) {
			return;
		}
		HSSFWorkbook workbook = ExcelUtil.export(header, data);
		workbook.write(servletOut);

	}

}
