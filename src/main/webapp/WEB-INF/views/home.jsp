<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="<c:url value="/resources/style/bootstrap.css"/>" >
</head>
<style>
.top-buffer { margin-top:100px; }
</style>
<body>
<div class="container top-buffer">
	<div class="alert alert-info col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4" role="alert" hidden="" id="submitCollector"></div>
<div class="row">
<div class="col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4">
<input type="button" class="btn btn-success col-md-12" onclick="onClickCreate()" value="Send"/>
<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Customer:</span>
  <input type="text" class="form-control" id="customer">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">CCYPair:</span>
  <input type="text" class="form-control" id="ccyPair">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Type:</span>
  <input type="text" class="form-control" id="type">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Direction:</span>
  <input type="text" class="form-control" id="direction">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">TradeDate(YYYY-MM-DD format):</span>
  <input type="text" class="form-control" id="tradeDate">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">ValueDate(YYYY-MM-DD format):</span>
  <input type="text" class="form-control" id="valueDate">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Amount1:</span>
  <input type="text" class="form-control" id="amount1">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Amount2:</span>
  <input type="text" class="form-control" id="amount2">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Rate:</span>
  <input type="text" class="form-control" id="rate">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">LegalEntity:</span>
  <input type="text" class="form-control" id="legalEntity">
</div>

<div class="input-group">
  <span class="input-group-addon" id="basic-addon2">Trader:</span>
  <input type="text" class="form-control" id="trader">
</div>

<input type="button" class="btn btn-success col-md-12" onclick="onClickCreate()" value="Send"/>


</div>
</div>
</div>
</body>
<script type="text/javascript"src="<c:url value="/resources/scripts/add.js"/>"></script>
<script src="<c:url value="/resources/jquery-3.1.1.min.js"/>"></script>
</html>
