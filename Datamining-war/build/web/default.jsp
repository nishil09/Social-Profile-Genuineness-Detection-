<%-- 
    Document   : default
    Created on : Nov 8, 2015, 8:03:31 PM
    Author     : nishil09
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="newjsp.jsp" method="POST">
        first name :- <input type="text" name ="fname" /><br/>
        Last name :- <input type="text" name ="lname" /><br/>
        Email :- <input type="text" name ="email" /><br/>

        Date Of birth :- <input type="text" name ="dob" /> format : (dd/mm/yyyy)<br/>

    

        Username :- <input type="text" name ="uname" /><br/>
        Password :- <input type="text" name ="pass" /><br/>
      
        street :- <input type="text" name ="street" /><br/>
        state :- <input type="text" name ="state" /><br/>
        Country :- <input type="text" name ="country" /><br/>
        Interests:- <input type="text" name ="interest" /><br/>
        School :- <input type="text" name ="school" /><br/>
         Photos :- <input type="text" name ="photo" /><br/>
          friends :- <input type="text" name ="friends" /><br/>
           groups :- <input type="text" name ="groups" /><br/>
            videos :- <input type="text" name ="videos" /><br/>

        <input type="submit" value="submit" />
        </form>
        <h1></h1>
    </body>
</html>
<%-- 
<%@page import="data.ProfileMatch" %>
/*
<%
    
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String email = request.getParameter("email");
String dob = request.getParameter("dob");
String username = request.getParameter("uname");
String password = request.getParameter("pass");
String street = request.getParameter("street");
String photo = request.getParameter("photo");
String friends = request.getParameter("friends");
String groups = request.getParameter("groups");
String videos = request.getParameter("videos");

double p = (double) (Integer.parseInt(photo) / 1000);
double f= (double)(Integer.parseInt(friends) / 2000);
double g= (double)(Integer.parseInt(groups) / 100);
double v= (double)(Integer.parseInt(videos) / 500);

double man = p + f + g + v;

out.write(fname);
out.write(photo);
ProfileMatch obj = new ProfileMatch();
out.write(obj.nnn(man));




%>
*/
--%>