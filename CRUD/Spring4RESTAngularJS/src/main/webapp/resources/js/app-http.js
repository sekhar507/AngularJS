var myApp = angular.module('myApp', []);
myApp.controller('PersonController', function($scope, $http){
    $scope.persons = [];
    $http.get('http://localhost:8080/spring4-1/info/person')
		.then(function (response){
			$scope.persons = response.data; //For multiple row
			//$scope.persons[0] = response.data; //For single row
			console.log("status:" + response.status);
		}).catch(function(response) {
		  console.error('Error occurred:', response.status, response.data);
		}).finally(function() {
			 console.log("Task Finished.");
		});
});  