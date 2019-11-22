<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="template/navbar.jsp" %>

  <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">Product</h5>
            <sf:form class="form-signin" method="post" modelAttribute="product" action="${pageContext.request.contextPath}/addProduct">
             <div class="form-label-group">
                <sf:input type="text" path="productId" class="form-control" placeholder="Product Id" />
                <label for="productId">Product Id</label>
              </div>
              
              
              <div class="form-label-group">
                <sf:input type="text" path="productName" class="form-control" placeholder="Product Name" />
                <label for="productName">Product Name</label>
              </div>
              
              <div class="form-label-group">
                <sf:input type="text" path="productDesc" class="form-control" placeholder="Product Description" />
                <label for="productDescription">Product Description</label>
              </div>
              <c:if test="${category.categoryName ==null}">
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Add</button>
             </c:if>
             
             
             <div class="row">
              <sf:select path="categoryId">
               <c:forEach items="${categoryList}" var="cat" >
               <sf:option value="${cat.categoryId}">${cat.categoryName}</sf:option>
               </c:forEach>
               </sf:select>
                </div>
              
              
              </sf:form>
              