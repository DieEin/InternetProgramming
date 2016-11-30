$(document).ready(function() {
	$("#getAnimalsButton").click(function (){
		$.get({
			url: "http://localhost:8080/rst2/api/animals",
			dataType: "json",
			success: function(data){
				console.log(data);
				$.each(data, function(index){
					var tr = $('<tr>');
					tr.append("<td> " + data[index].name + "</td>");
					$("#animalsTable").append(tr);
				});
			}

		});
	});
	
	function formToJSON() {
		return JSON.stringify({
			"age": "10",
			"name": "testtttt",
			"type": "testtttttttt" 
		});
	}
	
	var myarray = {"age": "10", "name": "test", "type": "testt"};
	var testing = {"anim": myarray};
	
	$("#addAnimalButton").click(function () {
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
});