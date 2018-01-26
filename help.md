# mangoUtil
主要包含两个模块，mango和mango-client:
1.mango模块是项目的核心，用于实现导出。 
2.mango-client模块是mango使用的一个实现，包括一个web版本简单实例，可以部署到容器中运行。

 1.pom.xml引入mango-1.0.0.jar 

    	<dependency>
   		<groupId>com.mango</groupId>
   		<artifactId>mango</artifactId>
   		<version>1.0.0</version>
   	</dependency>
2.在配置文件web.xml中配置servlet用于导出文件: XXX xml

<servlet>
	<servlet-name>ReportServer</servlet-name>
	<servlet-class>
	com.mango.mango.servlet.ReportServlet
	</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>ReportServer</servlet-name>
	<url-pattern>/ReportServer</url-pattern>
</servlet-mapping>
3.建立jsp并引入jquery和export.js
 XXX.xml
<script src="http://code.jquery.com/jquery-1.4.1.min.js"></script>
<script src="export.js"></script>
<script>
var webRootPath="<%=request.getContextPath()%>";
</script>
4.初始化表格数据：

   <table id="bookTable">
    <thead>
   		<tr>
   			<th type="number">...
   		 
   		</tr>
   	</thead>
   	<tbody>
   		<tr class="hover">
   			<td>...</td>
   			...
   		</tr>
   		 ...
   		</tbody>
   	
   </table>
5.导出表格数据

	<input type='button' id='excelexport' value='导出excel' />
  <input type='button' id='docexport' value='导出doc' />
  <input type='button' id='txtexport' value='导出txt' />
  <input type='button' id='xmlexport' value='导出xml' />
  <input type='button' id='pdfexport' value='导出pdf' />
  
  <script>
  $(function() {
  	$("#excelexport").click(function(e) {
  		exportFile("excel", $("#bookTable"));
  	});
  	$("#docexport").click(function(e) {
  		exportFile("doc", $("#bookTable"));
  	});
  	$("#txtexport").click(function(e) {
  		exportFile("txt", $("#bookTable"));
  	});
  	$("#xmlexport").click(function(e) {
  		exportFile("xml", $("#bookTable"));
  	});
  	$("#pdfexport").click(function(e) {
  		exportFile("pdf", $("#bookTable"));
  	});
  });
</script>


有问题请联系微信mangoQvQ。
