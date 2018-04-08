<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawSeriesChart);

    function drawSeriesChart() {

      var data = google.visualization.arrayToDataTable([
        ['Location', 'Total Claim', 'Geunine Claim', 'Fraud Claim'],
        ['201301',    33,              23,      10],
      	['110092',    26,			   19,      7],
      	['221309',    34,              28,      6],
      	['451005',    28,              25,      3],
      	['812007',    21,              14,      7]
      ]);

      var options = {
        title: 'Location Claim Chart',
        hAxis: {title: 'Location'},
        vAxis: {title: 'Total Claim'},
        bubble: {textStyle: {fontSize: 11}}
      };

      var chart = new google.visualization.BubbleChart(document.getElementById('series_chart_div'));
      chart.draw(data, options);
    }
    </script>
  </head>
  <body>
    <div id="series_chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>