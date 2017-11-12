<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage - ${title}</title>
    
    <script>
    	window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="/onlineshopping/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap flatly -->
    <link href="/onlineshopping/resources/css/bootstrap-flatly-theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/onlineshopping/resources/css/shop-homepage.css" rel="stylesheet">

  </head>

  <body>
	
	<div class = "wrapper">
    <!-- Navigation -->
    <%@include file="./shared/navar.jsp" %>

	<div class = "content">
    <!-- Page Content -->
	<!-- Content of home -->
	<c:if test = "${userClickHome == true}">
		<%@include file="home.jsp" %>
	</c:if>
	
	<!-- Show about when user click about button -->
	<c:if test = "${userClickAbout == true}">
		<%@include file="about.jsp" %>
	</c:if>
	
	<!-- Show contact when user click contact button -->
	<c:if test = "${userClickContact == true}">
		<%@include file="contact.jsp" %>
	</c:if>
	
	<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
		<%@include file="listProducts.jsp" %>
	</c:if>
	
	</div>
	
    <!-- Footer come here -->
    <%@include file="./shared/footer.jsp" %>
	

    <!-- Bootstrap core JavaScript -->
    <script src="/onlineshopping/resources/js/jquery.min.js"></script>
    <script src="/onlineshopping/resources/js/bootstrap.bundle.min.js"></script>
	<!-- my code javascript -->
	<script src="/onlineshopping/resources/js/myapp.js"></script>
	</div>
  </body>

</html>