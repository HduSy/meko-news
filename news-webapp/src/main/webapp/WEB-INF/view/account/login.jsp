<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登录 - 拴蛋头条</title>
    <link rel="stylesheet" href="${ctx}/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="${ctx}/static/css/main.css">
</head>

<body>
<div class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a href="../news/index.jsp" class="navbar-brand">
            </a>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="#">热闻 ⋅ 拴蛋头条</a></li>
            <li><a href="#">国内</a></li>
            <li><a href="#">国际</a></li>
            <li><a href="#">社会</a></li>
            <li><a href="#">数读</a></li>
            <li><a href="#">军事</a></li>
            <li><a href="#">政务</a></li>
            <li><a href="#">公益</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="login.jsp">登录</a></li>
            <li><a href="signup.jsp">注册</a></li>
        </ul>
    </div>
</div>
<div class="container">
  <div class="form-container">
    <h1>登录 <small>没有账号？<a href="signup.jsp">注册</a></small></h1>
    <form>
      <div class="form-group">
        <label>用户名/手机/邮箱</label>
        <input type="text" class="form-control" name="phone" id="phone">
      </div>
      <div class="form-group">
        <label>密码</label>
        <input type="password" class="form-control" name="password" id="password">
      </div>
      <p>忘记密码？</p>
      <div class="form-group">
        <button class="btn btn-primary btn-block" id="loginBtn">登录</button>
      </div>
    </form>
  </div>
</div>
<div class="footer">
  © 2017 拴蛋头条 中国互联网举报中心京ICP证1401号京ICP备125439号-3京公网安备
</div>

<script type="text/javascript">
    $(document).ready(function () {
        //登录
        $('#loginBtn').click(function (e) {
            if (!$('#loginBtn').valid()){
                return false;
            }
            var data = $('#loginBtn').serialize();
            $.ajax({
                url:'${ctx}/login/check',
                type:'POST',
                data:data,
                dataType:'json',
                success: function (data) {
                    if(data.code == 0){

                    }
                }
            })
        });
    })

</script>
</body>

</html>
