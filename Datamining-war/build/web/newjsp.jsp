<%-- 
    Document   : newjsp
    Created on : Nov 17, 2015, 1:09:27 AM
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
        <h1></h1>
 
<%@page import="data.ProfileMatch,data.NewClass" %>
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

double p = (double) (Integer.parseInt(photo) / 1000.0);
double f= (double)(Integer.parseInt(friends) / 2000.0);
double g= (double)(Integer.parseInt(groups) / 100.0);
double v= (double)(Integer.parseInt(videos) / 500.0);
//Freinds Photoos Groups Videos
System.out.println(p);
double man = p + f + g + v;
String s = String.valueOf(man);
//out.write(s + "Man");
//out.write(fname);
//out.write(photo);
ProfileMatch obj = new ProfileMatch();
NewClass onj;

onj = obj.nnn(man,f,p,g,v);


out.write(onj.overAllResult + "\n" + "\n");


//out.write("\n");
out.write("\n");
//out.write(onj.friendResult + "\n");
out.write("\n");
//out.write(onj.photoResult + "\n");
out.write("\n");
//out.write(onj.groupResult + "\n");
out.write("\n");
//out.write(onj.videoResult);
//out.write(obj.nnn(man,f,p,g,v));
//out.println(onj.overAllResult);
//out.println(onj.friendResult);
//out.println(onj.photoResult);
//out.println(onj.groupResult);
//out.println(onj.videoResult);


%>
<br></br>
<%
    
out.write(onj.friendResult + "\n");

    %>
    <br></br>
<%
    
out.write(onj.photoResult + "\n");

    %>
    <br></br>
<%
    
out.write(onj.groupResult + "\n");

    %>
<br></br>
<%
    
out.write(onj.videoResult);

    %>
    
    </body>
</html>
