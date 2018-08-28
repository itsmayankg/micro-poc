app.controller("myController", function ($scope, $http) {

    $scope.saveUserInfo = function () {
        var url = 'http://localhost:9999/registration';
        var data = {username: $scope.username, password: $scope.password, passwordConfirm: $scope.passwordConfirm};

        alert($scope.username+$scope.password+$scope.passwordConfirm);
        var config = 'application/json';

        $http.post(url, JSON.stringify(data), config).then(function (response) {
            alert("Post Data Submitted Successfully!");
        }, function (response) {
            alert("Error in Data Post!");
        });
    };

});