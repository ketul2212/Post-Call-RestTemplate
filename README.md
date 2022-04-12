# Post-Call-RestTemplate
Post Call with RestTemplate



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
#<b>Information Table</b><br/>
<table border="2" style="border-collapse: collapse;">
        <tr>
          <th>Project Name</th>
          <th>Project URL</th>
          <th>Project URl-Type</th>
          <th>Project Request-Body</th>
        </tr>
        
        <tr>
          <td>Post-Api</td>
          <td>http://localhost:8081/postRequest </td>
          <td>POST</td>
          <td>
            {
              "user": {
                "name": "ketul Patel",
                "email": "p"
              }
            }
          </td>
        </tr>
        
        <tr>
          <td>Call-Post-Api</td>
          <td>http://localhost:8082?name=ketul&email=pketul@gmail.com</td>
          <td>GET</td>
          <td></td>
        </tr>
</table>

        </body>
</html>
