'use strict';

angular.module('crudApp').controller('MTController',
    ['MTService', '$scope',  function( MTService, $scope) {
    	
    	$scope.customer = {custId:0,name:'',phone:'',verified:false};
        self.banks=[];
    	
    	console.log("MTController loaded !!!");
    	$scope.mobilehelp="Please enter valid mobile number !!!";
    	
    	this.getVerified=function(){
    		console.log("get verified clicked !!");
    		console.log($scope.customer);
	    		MTService.getVerified($scope.customer)
	            .then(
		                function (response) {
		                    console.log('MTController :: Customer created successfully');
		                    console.log(response);
		                    
		                },
		                function (errResponse) {
		                    console.error('Error while creating User');
		                    
		                }
	            );
    		
    	}
    	
    }


    ]);