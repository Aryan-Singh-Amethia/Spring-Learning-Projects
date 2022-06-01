<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!-- My own css and JS -->
<link href="<c:url value="/resources/css/style.css" />">
<script src="<c:url value="/resources/js/script.js" />"></script>
<title>Complex Form</title>
</head>
<body>
<div align="center">
   <H1>COMPLEX FORM</H1>
   <div class="alert alert-danger" role="alert">Danger Alert</div>
 <!--   <form:errors>"student.*"</form:errors> -->
    <form action="handleform" method="post">
  <div class="form-group">
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" name="email">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Select Language</label>
    <select class="form-control" id="exampleFormControlSelect1" name="language">
      <option>C</option>
      <option>Java</option>
      <option>Python</option>
      <option>Django</option>
      <option>C++</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Example multiple select</label>
    <select multiple class="form-control" id="exampleFormControlSelect2" name="level">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleFormControlTextarea1">Example textarea</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="text"></textarea>
  </div>
  <div class="form-check">
    <input class="form-check-input" type="radio" name="time" id="exampleRadios1" value="option1" checked>
    <label class="form-check-label" for="exampleRadios1">
      3 Months
    </label>
  </div>
  <div class="form-check">
    <input class="form-check-input" type="radio" name="time" id="exampleRadios2" value="option2">
    <label class="form-check-label" for="exampleRadios2">
      6 Months
    </label>
  </div>
  <div class="form-check">
    <input class="form-check-input" type="radio" name="time" id="exampleRadios3" value="option3" disabled>
    <label class="form-check-label" for="exampleRadios3">
      1 Year
    </label>
  </div>
  <button type="submit" class="btn btn-danger">Submit</button>
</form>
</div>
</body>
</html>