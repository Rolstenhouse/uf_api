require_once('PoliceRequest.php');

$policeRequest = new PoliceRequest(); //Create a new PoliceRequest object

/*Inputs*/
$searchType = PoliceRequest::SEARCH_TYPES[0]; //Default "All" option. If in doubt, don't change this.
$searchField = "12/2/2019"; //Dates MUST be formmated in the American MM/DD/YY format
$page = 0; //First page = 0, not 1

/*Processing / Web scraping*/
$html = $policeRequest->getHtml($searchField, $searchType, $page); //Raw HTML pulled from the UF police page
$maxPage = $policeRequest->getMaxPage($html); //The max page found using the raw html. Useful for stringing together multiple requests.
$rows = $policeRequest->getRows($html); //The actual scraped data in the form of assocative arrays. Row format is describe in PoliceRequest.php

/*Displaying results*/
echo("Max page: " . $maxPage);
foreach($rows as $row){
    var_dump($row);
    echo("<br><br>");
}

