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
            <h5 class="card-title text-center">Category</h5>
            <sf:form class="form-signin" method="post" modelAttribute="category" action="${pageContext.request.contextPath}/addCategory">
              
              <c:if test="${category.categoryName !=null}">
              <div class="form-label-group">
                <sf:input type="text" path="categoryId" class="form-control" placeholder="Category Id" />
                <label for="categoryId">Category Id</label>
              </div>
             </c:if>
             
              <div class="form-label-group">
                <sf:input type="text" path="categoryName" class="form-control" placeholder="Category Name" />
                <label for="categoryName">Category Name</label>
              </div>

              <div class="form-label-group">
                <sf:input type="text" path="categoryDescription" class="form-control" placeholder="Category Description" />
                <label for="categoryDescription">Category Description</label>
              </div>
              
            <c:if test="${category.categoryName ==null}">
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Add</button></c:if>
              
               <c:if test="${category.categoryName !=null}">
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Update</button></c:if>
            </sf:form>
          </div>
        </div>
      </div>
    </div>
    
    
    <div class="row">
    <c:if test="${categoryList !=null}">
    <table border="1">
    <c:forEach items="${categoryList}" var="cat" >
    <tr>
    <td>${cat.categoryId}</td><td>${cat.categoryName}</td> <td>${cat.categoryDescription}</td>
    
  <td> <a href="deleteCategory/${cat.categoryId}"> delete </a>  </td>
  
  <td> <a href="updateCategory/${cat.categoryId} ">update</a> </td>
  
   </tr>
    </c:forEach>
    </table>
    </c:if>
    </div>
    
  </div>
