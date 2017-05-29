var app = angular.module('myApp', ['ngResource']);
app.factory('Person', ['$resource', function ($resource) {
    return $resource('http://localhost:8080/spring4-1/info/person/:personId', {personId: '@pid'});
}]);
app.controller('PersonController', ['$scope', 'Person', function($scope, Person) {
    this.persons=[];
    this.fetchAllPersons = function(){
    	this.persons = Person.query();
    };
    this.fetchPersonById = function(id){
    	this.persons[0] = Person.get({ personId: id}, function() {
    		console.log(id);
 	    });
    };
    this.fetchAllPersons();
    //this.fetchPersonById(2);
}]);    
   