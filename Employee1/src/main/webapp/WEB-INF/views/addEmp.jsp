<!DOCTYPE html>
<html>
    <style type="text/css">
        form{
            margin: auto;
            text-align: center;
           
        }
        fieldset{
           margin: auto;
            width: 30%;
            padding-top: 20px;
            padding-bottom: 20px;
            background-color: azure;
            font-size: large;
        }
        h1{
            font-style: italic;
            color:black

        }
        body{
            background-color: bisque;
        }

    </style>
    <body>
        <form action="/addEmp" method="post">
           <h1>Add Employee Data</h1>
          <!--  <input type="number" required value="id" placeholder="Id"><br> -->
          <fieldset>
            <legend>AddEmp Data</legend>
            <input type="text" required  name="firstName" placeholder="First Name" /><br><br>
            <input type="text" required name="lastName" placeholder="Last Name" /><br><br>
            <input type="number" required name="sal" placeholder="Salary " /><br><br>
            <input type="number" required name="age" placeholder="Age" /> <br><br>
            <input type="password" required name="password" placeholder=" Password " /> <br><br>
            <button type="submit">Submit</button>
            <button><a href="/">Back</a></button>
        </fieldset>
        </form>
    </body>
</html>