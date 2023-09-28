<!DOCTYPE html>
<html>
    <head>

        <style type="text/css">
            h1{
                text-align: center;
                font-style: italic;
            }
            fieldset{
                width: 30%;
                margin: auto;
                text-align: center;
                font-size: large;
                background-color: aliceblue;
            }
            legend{
                text-align: left;
            }
            
        </style>
    </head>
    <body style="background-color: antiquewhite;">
        <h1>
            Employee ${empdata.firstName} Data </h1>
            <fieldset>
                <legend>Info</legend>
                <label>
                    Id :
                </label>
              <b>  ${empdata.id}</b>  <br><br>
                <label>
                FirstName :
                </label>
              <b>  ${empdata.firstName} </b> <br><br>
                <label>
                    LastName :
                </label>
              <b>  ${empdata.lastName} </b>  <br><br>
                <label>
                    Sal :
                </label>
               <b> ${empdata.sal} </b> <br><br>
                <label>
                    Age :
                </label>
               <b> ${empdata.age} </b>  <br><br>
                <label>
                    Password :
                </label>
               <b> ${empdata.password} </b> <br><br>
                <button><a href="/getEmployees">Back</a></button>
            </fieldset>
       
    </body>
</html>