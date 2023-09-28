<!DOCTYPE html>
<html>
    <style type="text/css">
        form{
            text-align: center;
            
           
        }
        h1{
            font-style: italic;
            text-align: center;
        }
        body{
            background-color: azure;
        }
    </style>
    <body>

        <h1>Edit Emp Data</h1>
        <form action="/UpdateEmp" >
       <fieldset style="width: 30%; padding-top: 20px;border-left: 30%;margin: auto;background-color: rgb(246, 245, 244); font-size: large;">
        <legend>Enter Your Data</legend>
        <label  > Id :</label>
        <input style="background-color: aliceblue;" type="text" value="${empdata.id}" name="id" readonly><br><br>
        <label >FirstName :</label>
        <input type="text" value="${empdata.firstName}" required name="firstName"><br><br>
        <label  >LastName :</label>
        <input type="text" value="${empdata.lastName}" required name="lastName"><br><br>
        <label>Salary :</label>
        <input type="text" value="${empdata.sal}" required name="sal"><br><br>
        <label>Age :</label>
        <input type="text" value="${empdata.age}" required name="age"><br><br>
        <button type="submit">Submit</button>
        <button><a href="/getEmployees">Back</a></button>
    </fieldset>
    </form>
    
    </body>
</html>