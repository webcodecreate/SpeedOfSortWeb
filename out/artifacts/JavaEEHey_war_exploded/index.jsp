<%@ page import="sort.main"%><%--
  Created by IntelliJ IDEA.
  User: webco
  Date: 01.04.2019
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <style>
        body {background-color: aliceblue;
            font-family: "Times New Roman", Times, serif;
            font-size: 25px;
            background-color: aliceblue;
            margin: 30px;
        }
    </style>

    <head>
      <title>Speed of Sort</title>
    </head>
    <body>
    <jsp:useBean id="link" scope="application" class = "sort.main" />
    <%main m = new main();%>
    <%out.print(m.startTimeString);%>
    <br><br>
    <%out.print(m.bubbleSortRunString);%>
    <br><br>
    <%out.print(m.recursiveBubbleSortString);%>
    <br><br>
    <%out.print(m.selectionSortString);%>
    <br><br>
    <%out.print(m.insertionSortString);%>
    <br><br>
    <%out.print(m.recursiveInsertionSortString);%>
    <br><br>
    <%out.print(m.mergeSortString);%>
    <br><br>
    <%out.print(m.recursiveMergeSortString);%>
    <br><br>
    <%out.print(m.quickSortString);%>
    <br><br>
    <%out.print(m.iterativeQuickSortString);%>
    <br><br>
    <%out.print(m.recursiveQuickSortString);%>
    <br><br>
    <%out.print(m.heapSortString);%>
    <br><br>
    <%out.print(m.radixSortString);%>
    <br><br>
    <%out.print(m.shellSortString);%>
    <br><br>
    <%out.print(m.combSortString);%>
    <br><br>
    <%out.print(m.finallyTimeString);%>
    </body>
</html>
