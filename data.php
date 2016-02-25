<?php


$username = "root";
$password = "";
$hostname = "localhost"; 

//connection to the database
$dbhandle = mysql_connect($hostname, $username, $password) 
  or die("Unable to connect to MySQL");
echo "Connected to MySQL<br>";

$selected = mysql_select_db("R",$dbhandle) 
  or die("Could not select examples");
  
  
  $result = mysql_query("SELECT manhattanD FROM Manhattan limit 300000");
  $result1 = mysql_query("select V1,V2,V3,V4 from Profile_Normalized");
  
//fetch tha data from the database
while (($row = mysql_fetch_array($result)) && ($row1 = mysql_fetch_array($result1))) {
  //echo $row1[0];
  echo $row[0];
   if($row{'manhattanD'} >= 0 && $row{'manhattanD'} <= 1)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',0);";
  mysql_query($query);
   }
   else if($row{'manhattanD'} > 1 && $row{'manhattanD'} <= 2)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',1);";
  mysql_query($query);
   }
   else if($row{'manhattanD'} > 2 && $row{'manhattanD'} <= 2.2)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',0);";
  mysql_query($query);
   }
   else if($row{'manhattanD'} > 2.2 && $row{'manhattanD'} <= 2.759)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',1);";
  mysql_query($query);
   }
   else if($row{'manhattanD'} > 2.759 && $row{'manhattanD'} <= 3)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3].".,'".$row[0]."',0);";
  mysql_query($query);
   }
   else if($row{'manhattanD'} > 3 && $row{'manhattanD'} <= 3.25)
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',1);";
  mysql_query($query);
   }
   else 
   {
      $query = "
  INSERT INTO `R`.`final` (`Friend`,`photo`,`group`,`video`,`manhattanD`,`class`) VALUES ('".$row1[0]."','".$row1[1]."','".$row1[2]."','".$row1[3]."','".$row[0]."',0);";
  mysql_query($query);
   }
 
   
}
  mysql_close($dbhandle);
?>
