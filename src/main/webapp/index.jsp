<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>HTML5 Upload</title>

<body>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<form action="<%=request.getContextPath()%>/upload" method="post" enctype="multipart/form-data">
   <input type="file" name="uploadFile" />
   	<br/><br/>
   	<input type="submit" value="立即分析" />
</form>
<img id="preview" src="">

<script type="text/javascript">
$('#upload').change(function(){
  // 获取FileList的第一个元素
var f = document.getElementsByTagName('input')[0].files[0];
var src = window.URL.createObjectURL(f);
document.getElementById('preview').src = src

})
</script>
</body>
</html>
