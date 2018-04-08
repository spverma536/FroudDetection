<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<html>
  <head>
  <c:url var="home" value="/" scope="request" />

	<link rel="stylesheet" type="text/css"	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
	<c:url value="/css/main.css" var="jstlCss" />
	<link href="${jstlCss}" rel="stylesheet" />
	
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawSeriesChart);
		
	
    function drawSeriesChart() {
    	var data = new google.visualization.DataTable();
    	data.addColumn('string','Location Pin');
				 data.addColumn('number', 'Total Claim');
				 data.addColumn('number', 'Genuine Claim');
				 data.addColumn('number','Fraud Claim');
    	$.get("/search/api/bubble/data", function(result, status){
       			 //alert("Data: " + data + "\nStatus: " + status);
       			$.each(result, function(i, item) {
       			 var arr = item.split(',');
       			 alert(arr);
       			 var a0 =arr[0];
       			 var a1 = arr[1];
       			 var a2 = arr[2];
       			 var a3 = arr[3];
       			 //alert(a0+a1+a2+a3); 
       				data.addRows[a0,a1,a2,a3];
       			});
       			
       			 
       			 
       			 //data = google.visualization.arrayToDataTable([result]);
       	});

      var options = {
        title: 'Location Claim Chart',
        hAxis: {title: 'Location Pin'},
        vAxis: {title: 'Total Claim'},
        bubble: {textStyle: {fontSize: 11}}
      };

      var chart = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));
      chart.draw(data, options);
    }
    </script>
    <script>
    	jQuery(document).ready(function($) {
			//drawSeriesChart();
	});
    </script
  </head>
  <body>
    <div id="series_chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>