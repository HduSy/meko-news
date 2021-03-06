<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>注册 - 拴蛋头条</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
</head>

<body>
<div class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a href="index.jsp" class="navbar-brand">
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
            <li><a href="login.jsp">登录</a></li>
            <li  class="active"><a href="#">注册</a></li>
        </ul>
    </div>
</div>
<div class="container">
  <div class="form-container">
    <h1>注册 <small>已有账号？<a href="login.jsp">登录</a></small></h1>
    <form>
      <div class="form-group">
        <label>手机号</label>
        <input type="text" class="form-control">
      </div>
      <div class="form-group">
        <label>验证码</label>
        <div class="input-group">
          <input type="text" class="form-control">
          <div class="input-group-btn"><button class="btn btn-default">发送验证码</button></div>
        </div>
      </div>
      <div class="form-group">
        <label>密码</label>
        <input type="password" class="form-control">
      </div>
      <p>注册即代表您同意<a href="#">拴蛋头条服务条款</a></p>
      <div class="form-group">
        <button class="btn btn-primary btn-block">注册</button>
      </div>
    </form>
  </div>
</div>
<div class="footer">
  © 2017 拴蛋头条 中国互联网举报中心京ICP证1401号京ICP备125439号-3京公网安备
</div>
</body>

</html>
