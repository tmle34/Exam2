<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
    <title>You Won't Believe These Viruses!</title>
    <style>
        table {
            font-family: Times New Roman, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 2px solid #cccccc;
            text-align: left;
            padding: 9px;
        }

        tr:nth-child(odd) {
            background-color: #eeeeee;
        }
    </style>
</head>
<body>

<h2>Top 5 Viruses of 2020</h2>

<table>
    <tr>

        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>MortalityRate</th>
        <th>Duration</th>
        <th>Images</th>
    </tr>
    <c:forEach var = "list" items = "${listfor}">
        <tr>

            <td>${list.name}</td>
            <td>${list.description}</td>
            <td>${list.symptoms}</td>
            <td>${list.mortalityrate}</td>
            <td>${list.duration}</td>
            <td><img src ="${list.image}" alt = ""/></td>

        </tr>
    </c:forEach>
</table>

</body>
</html>
