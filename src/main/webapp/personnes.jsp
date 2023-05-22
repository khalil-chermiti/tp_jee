<%@ page import="com.example.tp_final.Personne" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <style>
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }

        td, tr {
            border: 1px solid black;
            padding: 5px;
        }
    </style>
</head>
<body>
<h1><%= "List Des Personnes" %>
</h1>
<br/>


<table>
    <tr>
        <th>Id</th>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Adresse</th>
    </tr>

    <% for (Personne p : (List<Personne>) request.getAttribute("personnes")) { %>
    <tr>
        <td><%= p.getId() %>
        </td>
        <td><%= p.getNom() %>
        </td>
        <td><%= p.getPrenom() %>
        </td>
        <td><%= p.getAdresse() %>
        </td>
    </tr>
    <% } %>
</table>
</body>
</html>