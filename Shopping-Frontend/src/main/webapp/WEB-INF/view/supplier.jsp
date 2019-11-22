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
            <h5 class="card-title text-center">Supplier</h5>
            <sf:form class="form-signin" method="post" modelAttribute="supplier" action="${pageContext.request.contextPath}/addSupplier">
             
             
             <c:if test="${supplier.supplierName != null }">
              <div class="form-label-group">
                <sf:input type="text" path="supplierId" class="form-control" placeholder="Supplier Id" />
                <label for="supplierId">Supplier Id</label>
              </div>
             </c:if>
             
              <div class="form-label-group">
                <sf:input type="text" path="supplierName" class="form-control" placeholder="Supplier Name" />
                <label for="supplierName">Supplier Name</label>
              </div>
              
              <div class="form-label-group">
                <sf:input type="text" path="supplierAdd" class="form-control" placeholder="supplier Add" />
                <label for="supplierAdd">Supplier Address</label>
              </div>
              
          <c:if test="${supplier.supplierName ==null}">  
           <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Add</button></a>
              
            </c:if>  
               <c:if test="${supplier.supplierName !=null}">
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Update</button>
              </c:if>
            </sf:form>
          </div>
        </div>
      </div>
    </div>
    
    
    <div class="row">
    <c:if test="${supplierList !=null}">
    <table border="1">
    <c:forEach items="${supplierList}" var="cat" >
    <tr>
    <td>${cat.supplierId}</td><td>${cat.supplierName}</td> <td>${cat.supplierAdd}</td>
    
  <td> <a href="deleteSupplier/${cat.supplierId}"> delete </a>  </td>
  
  <td> <a href="updateSupplier/${cat.supplierId} ">update</a> </td>
  
   </tr>
    </c:forEach>
    </table>
    </c:if>
    </div>
    
  </div>
              
    