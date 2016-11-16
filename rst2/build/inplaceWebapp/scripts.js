$(document).ready(function() {
	$("#button").click(function (){
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
});