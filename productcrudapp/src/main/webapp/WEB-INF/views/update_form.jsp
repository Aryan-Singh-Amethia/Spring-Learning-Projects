<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

<!-- form begins form here -->
<div class="container align-self-center" style="width:800px">
<h1>Change Product Details</h1>
<form action="${pageContext.request.contextPath}/handle-product" method="post">
    <div class="form-group">
      <label for="productName">Product Name</label>
      <input type="text"
             class="form-control"
             id="productName"  
             name="name"
             placeholder="Enter product's name"
             value="${product.name}">
      <small id="prodNameHelp" class="form-text text-muted">The name of the product which will be stored in the database.</small>
    </div>
    <div class="form-group">
      <label for="prodDesc">Product Description</label>
      <input type="text" 
             class="form-control"
             id="prodDesc"
             name="description" 
             placeholder="Description"
             style="height:200px"
             value="${product.description}">
    </div>
    <div class="form-group">
      <label for="prodPrice">Product Price</label>
      <input type="text" 
             class="form-control" 
             id="prodPrice"
             name="price" 
             placeholder="Price"
             value="${product.price}">
    </div>
    <div class="form-group">
      <label for="prodId">Product Id</label>
      <input type="text" 
             class="form-control" 
             id="prodId"
             name="Id" 
             value="${product.id}">
       <small id="prodIdHelp" class="form-text text-muted">System generated Id.Do NOT change this!</small>             
    </div>
    <a href="${pageContext.request.contextPath}/"
       class="btn btn-warning">Back</a>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
  </div>
</body>
</html>