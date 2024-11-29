<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <title>JSP - Hello World</title>
</head>
<body>

<br/>
<div class="px-4 py-5 my-5 text-center">
  <img class="d-block mx-auto mb-4" src="https://github.githubassets.com/assets/GitHub-Mark-ea2971cee799.png" alt="" width="72" >
  <h1 class="display-5 fw-bold"><%= "Welcome" %></h1>
  <div class="col-lg-6 mx-auto">
    <p class="lead mb-4">Let's manage your students, the easy way</p>
    <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
      <a href="/students" class="btn btn-primary btn-lg px-4 gap-3">Login</a>
    </div>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>