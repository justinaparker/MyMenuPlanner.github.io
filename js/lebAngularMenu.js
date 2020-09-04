var app  = angular.module("myApp", ['ngSanitize']);
    app.controller("myCon", function($scope, $http, $parse, $sce){
        
        $http.get("/meals/all").then(function(response){
            
            var output = response.data;
            console.log("output");
            console.log(output);
            
            $scope.meals = output;
            
            
        }); //closes my http
        
        
        $http.get("/recepies/all").then(function(response){
            
            var output = response.data;
            console.log("output");
            console.log(output);
            
            $scope.recepie = output;
            $scope.hide();
            $scope.show(1);
            $scope.instructions(1);  
        }); //closes my $http.get("/recepies/all") 
        
        $scope.recepieName = function(id){ 
            var rList = $scope.recepie;
            
            
            for (var i = 0; i < rList.length; i++){
                if(id == rList[i].id){
                   return rList[i].name;
                }
                
            }
            
            return 'Not Found';
            
        }; //closes recepieName()
        
        $scope.instructions = function(id){
            
            var rList = $scope.recepie; 
            
            for (var i = 0; i < rList.length; i++){
                if(id == rList[i].id){
                    return rList[i].cookinginstructions;                 
                }
            }
            
            return "<strong>Step 1</strong><br>   Dice the boneless skinless chicken breast into ½ inch cubes. Lightly season with salt and pepper. Cook in butter over medium high heat until thoroughly cooked.   <br><br>  <strong>Step 2</strong><br>   Combine Grilled Chicken, Romaine Lettuce, Parmesan Cheese, and Croutons in a bowl. Toss ingredients until fully mixed.   <br><br>  <strong>Step 3</strong><br>   Add Caesar Salad Dressing to taste and enjoy.";
        };
        
        
      $scope.hide = function(){
           var rList = $scope.recepie;
           
           
            for (var i = 0; i < rList.length; i++){
                $scope["card" + i] = false;
                 
                
            }
        };
        
        $scope.show = function(id){
            $scope["card" + id] = true;
            
            
        };
        
        $scope.current = 1;
        $scope.next = function(){
            $scope.current = $scope.current + 1;
            if($scope.current >= $scope.recepie.length){ 
               $scope.current = 1;              
               }
            
            $scope.hide();
            $scope.show($scope.current);
            $scope.ins = $sce.trustAsHtml("<strong>working</strong>");
            $scope.recepieIndex = $scope.current;
        };
        
        $scope.previous = function(){
            $scope.current = $scope.current - 1;
            if($scope.current < 1){
                $scope.current = $scope.recepie.length - 1;
               }
            
            $scope.hide();
            $scope.show($scope.current);
            $scope.ins = "working both ways";
            $scope.recepieIndex = $scope.current;
        };       
 
      
//$scope.hide();       
//$scope.show(2); 
        
        //var the_string = 'r.cookinginstructions';

        // Get the model
        //var model = $parse(the_string);

        // Assigns a value to it
        //model.assign($scope, $scope.current);

        // Apply it to the scope
        //$scope.$apply();
        //console.log("Should be cooking instructions")
        //console.log($scope.r.cookinginstructions);  // logs 42        
        
    });