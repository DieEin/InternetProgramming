$(document).ready(function() {

	function formToJSON() {
		return JSON.stringify({
			"age": $("#age").val(),
			"name": $("#name").val(),
			"type": $("#type").val() 
		});
	}
	
	var myarray = {"age": "10", "name": "test", "type": "testt"};
	var testing = {"anim": myarray};
	
	$("#addAnimal").click(function () {
		$.post({ 
			url: "http://localhost:8080/rst2/api/animals",
			data: formToJSON(),
			dataType: "json",
			contentType: "application/json",
			success: function(data){
				alert("Animal added successfully!!!");
			}
		});
	});
	
	$("#backButton").click(function() {
		window.location.href = "http://localhost:8080/rst2/";
	});
});