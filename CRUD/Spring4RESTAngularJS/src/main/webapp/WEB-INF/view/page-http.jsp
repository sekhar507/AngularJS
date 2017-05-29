<!DOCTYPE html>
<html lang="en-US">
  <head>
    <meta charset="UTF-8" /> 
    <title> Spring 4 REST + AngularJS </title>
  </head>
  <body ng-app="myApp">
    <div ng-controller="PersonController">
       <h1> Spring 4 REST + AngularJS </h1>
       <table>
	      <tr><th>ID </th> <th>Name</th> <th>Location</th></tr>
	      <tr ng-repeat="row in persons">
	         <td><span ng-bind="row.pid"></span></td>
	         <td><span ng-bind="row.name"></span></td>
	         <td><span ng-bind="row.location"></span></td>
	      </tr>	
	   </table>
	</div>
    <script src="${pageContext.request.contextPath}/app-resources/js/lib/angular.min.js"></script>
	<script src="${pageContext.request.contextPath}/app-resources/js/app-http.js"></script>
 </body>
</html>  
  