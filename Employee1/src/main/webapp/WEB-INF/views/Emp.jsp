
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
    <style type="text/css">
        table{
            width: 100%;
        }
        table,th,td{
           
            border: 1px solid black;
            text-align: center;
            padding: 10px;
            border-collapse: collapse;
          
           
        }
        th{
            background-color: antiquewhite;
        }
        td{
            background-color:cornsilk;
        }
        h1{
            text-align: center;
            color: black;
            font-style: italic;
            
        }

    </style>
    </head>
    
    <body style="background-color: rgb(219, 228, 226);">
     <form action="/getEmployees" method="get">
        <h1> Employees Data</h1>
            <table>
                <tr>
                    <th>Id</th>
                    <th>FirstName</th>
                    <th>LastName</th>
                    <th>Salary</th>
                    <th>Age</th>
                    <th>Edit</th>
                    <th>Delete</th>
                    <th>Info</th>
                 
                </tr>
                <c:forEach var="emps" items="${empli}">
                <tr>
                    <td>
                        ${emps.id}
                    </td>
                    <td>
                        ${emps.firstName}
                    </td>
                    <td>
                        ${emps.lastName}
                    </td>
                    <td>
                        ${emps.sal}
                    </td>
                    <td>
                        ${emps.age}
                    </td>
                    <td><a href="UpdateEmps/${emps.id}">Edit</a></td>
                    <td><a href="/deleteEmp/${emps.id}"> Delete</a></td>
                    <td><a href="/getEmpById/${emps.id}">View</a></td>
                    </td></a>

                </tr>
                </c:forEach>
            </table>
            <button><a href="/">Back</a></button>
       


     </form>
    </body>
</html>