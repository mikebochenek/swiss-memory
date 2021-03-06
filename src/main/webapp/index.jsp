<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>

<%
    BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Swiss Memory Image Library</title>
    <script type="text/javascript" src="/js/base.js"></script>
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap-responsive.css">
    <link type="text/css" rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">Swiss Memory Image Library</a>
            <div class="nav-collapse collapse pull-right">
                <a href="javascript:void(0);" class="btn" id="signinButton">Sign in</a>
            </div>
        </div>
    </div>
</div>
<div class="container">

    <div id="outputLog"></div>

    <form action="javascript:void(0);">
        <h2>Get Greeting</h2>
        <div><span class="label">Greeting ID: </span><input id="id" /></div>
        <div><input id="getGreeting" type="submit" class="btn btn-small" value="Submit"></div>
    </form>
    
    <form action="javascript:void(0);">
        <h2>List Greetings</h2>
        <div><input id="listGreeting" type="submit" class="btn btn-small" value="Submit"></div>
    </form>
    
    <form action="javascript:void(0);">
        <h2>Multiply Greetings</h2>
        <div><span class="label">Greeting: </span><input id="greeting" /></div>
        <div><span class="label">Count: </span><input id="count" /></div>
        <div><input id="multiplyGreetings" type="submit" class="btn btn-small" value="Submit"></div>
    </form>
    
    <form action="javascript:void(0);">
        <h2>Authenticated Greeting</h2>
        <div><input id="authedGreeting" type="submit" class="btn btn-small" disabled value="Submit"></div>
    </form>

    <hr/>
    
    <form action="<%= blobstoreService.createUploadUrl("/upload") %>" method="post" enctype="multipart/form-data">
            <div><input type="text" name="foo"></div>
            <div><input type="file" name="myFile"></div>
            <div><input type="submit" value="Submit"></div>
    </form>
    
    <script type="text/javascript">
        function init() {
            google.devrel.samples.hello.init('//' + window.location.host + '/_ah/api');
        }
    </script>
    <script src="https://apis.google.com/js/client.js?onload=init"></script>
</div>
</body>
</html>


