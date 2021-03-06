<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="layui/css/layui.css">
<script type="text/javascript" src="<%=basePath %>/lib/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
<script>

</script>
<style type="text/css">
body {
	background: url("jpp/WW.jpg");
}

* {
	padding: 0;
	marging: 0;
}

.main {
	padding-left: 25px;
	padding-right: 25px;
	padding-top: 15px;
	width: 350px;
	height: 350px;
	background: white;
	/*让表单垂直居中在界面*/
	position: absolute;
	top: 50%;
	left: 50%;
	margin-top: -175px;
	margin-left: -175px;
}

.title {
	height: 40px;
	line-height: 40px;
	padding-left: 140px;
}

.title span {
	font-size: 18px;
}

.title-msg {
	height: 64px;
	line-height: 64px;
}

.title-msg span {
	font-size: 12px;
	color: gray;
}

.input-content input {
	width: 340px;
	height: 40px;
	border: 1px solid #dad9d6;
	padding-left: 10px;
}

.enter-btn {
	margin-top: 20px;
	width: 350px;
	height: 40px;
	color: white;
	background: #0bc5de;
	border: 0px;
	width: 350px;
}

.foor {
	font-size: 12px;
	color: gray;
	margin-top: 20px;
}

.left {
	float: left;
}

.right {
	float: right;
}

a {
	text-decoration: none;
}
</style>
</head>
<div class="main">
	<div class="title">
		<span>登&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;录</span>
	</div>

	<div class="title-msg">
		<span class="">请输入用户名和密码</span>
	</div>

	<form action="<%=basePath%>GuanServlet">
		<!-- 输入框 -->
		<div class="input-content">
			<div>
				<input type="text" placeholder="用户名" name="deng" required>
			</div>
			<div style="margin-top: 16px">
				<input type="password" placeholder="密码" name="mi" required>
			</div>
		</div>

		<!-- 登录按钮 -->
		<div style="text-align: center">
			<button type="submit" class="enter-btn" onclick="ifContext('${loginname}','${pass}')">登录</button>
		</div>

		<div class="foor">
			<div class="left">
				<span><a href="#">忘记密码？</a></span>
			</div>
			<div class="right">
				<span><a href="=.jsp">还没有账号，立即注册</a></span>
			</div>
		</div>
	</form>
</div>
<body>
	<%--  <form action="<%=basePath%>GuanServlet">
      用户名:<input type="text" name="deng">
      密码:<input type="text" name="mi">  
      <button type="submit" class="layui-btn layui-btn-xs layui-btn-normal">提交</button>
       <!-- <input type="submit" value="提交"> -->
    </form> --%>
</body>
</html>
