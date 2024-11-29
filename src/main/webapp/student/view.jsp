<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>Title</title>
</head>
<body>
<div class="container">
    <p>
        <a href="/students"></a>
    </p>
    <table class="table table-bordered table-hover">
        <tr>
            <td>ID</td>
            <td>${requestScope["student"].getId()}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${requestScope["student"].getName()}</td>
        </tr>
        <tr>
            <td>Score</td>
            <td>${requestScope["student"].getScore()}</td>
        </tr>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</body>
</html>
