<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Hospital', 'Total Claim'],
          [ 102,      80],
          [ 103,      120],
          [ 104,      175],
          [ 105,      125],
          [ 106,      50],
          [ 107,      97],
          [ 108,      65],
          [ 111,      87],
          [ 114,      90],
          [ 116,      92],
          [ 117,      105],
          
        ]);

        var options = {
          title: 'Hospital vs. Total Claim',
          hAxis: {title: 'Hospital', minValue: 100, maxValue: 120},
          vAxis: {title: 'Total Claim', minValue: 40, maxValue: 200},
          legend: 'none'
        };

        var chart = new google.visualization.ScatterChart(document.getElementById('chart_div'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>