<?php
    
    /**
     * Example code (commented) at the bottom of this file.
     * If you have any problems, open an issue on GitHub or
     * email me at cameron.white@ufl.edu
     **/

    class PoliceRequest {

        const SEARCH_TYPES = array("All", "Report Number", "Report Date", "Crime Log Data", "Type of Crime", "Location", "Disposition");

        /**
         * Parses the input HTML and returns an associative array containing crime data.
         * Indices of the returned arrays are as follow: agency, reportNumber, reportDate, reportTime,
         * crimeLogDate, crimeType, crimeDate, location, disposition
         **/
        function getRows($html){
            $dom = new DOMDocument();
            $dom->loadHtml($html);
            $tables = $dom->getElementsByTagName("table");
            $rows = array();
        
            for($i = 4; $i < sizeof($tables) - 2; $i = $i + 1){
                $tableRow = $tables[$i]->getElementsByTagName("tr")[0];
                $data = $tableRow->getElementsByTagName("td");
        
                $row = array('agency' => $data[0]->textContent,
                'reportNumber' => $data[1]->textContent,
                'reportDate' => $data[2]->textContent,
                'reportTime' => $data[3]->textContent,
                'crimeLogDate' => $data[4]->textContent,
                'crimeType' => $data[5]->textContent,
                'crimeDate' => $data[6]->textContent,
                'location' => $data[7]->textContent,
                'disposition' => $data[8]->textContent
                );
        
                array_push($rows, $row);
            }

            return $rows;
        }

        /**
         * $searchField: The actual "thing" you're searching for. Varies according the search type. 
         *      - If you use the default option (element 0 of SEARCH_TYPES) or search by date, you should input a MM/YY/DD
         *        formatted year. 
         * $searchType: An element of the PoliceRequest::SEARCH_TYPES constant
         * $page: Specifies which page of data you want to scrape. 10 results per page.
         */
        function getHtml($searchField, $searchType, $page){
            $url = "http://archive.police.ufl.edu/wp-content/asp/crimelog/search.asp?intpage=$page";
            $data = array('searchType' => $searchType, 'searchField' => $searchField);
            $options = array(
                'http' => array(
                    'header'  => "Content-type: application/x-www-form-urlencoded\r\n",
                    'method'  => 'POST',
                    'content' => http_build_query($data)
                )
            );
            $context  = stream_context_create($options);
            return file_get_contents($url, false, $context);
        }

        function getMaxPage($html){
            $index = strpos($html, "Page: ");
            $temp = "";
            while($html[$index] != "<"){     //Makes $temp equal "Page: x of y"
                $temp = $temp . $html[$index];
                $index = $index + 1;
            }
            $maxPages = explode(" ", $temp)[3];
            return $maxPages;
        }
    }

    /*Example code! Yay!*/

    /*Inputs*/
    //$searchField = "12/2/2019"; //Dates MUST be formmated in the American MM/DD/YY format
    //$searchType = PoliceRequest::SEARCH_TYPES[0]; //Default "All" option. If in doubt, don't change this.
    //$page = 0; //First page = 0, not 1

    //$policeRequest = new PoliceRequest();

    /*Processing*/
    //$html = $policeRequest->getHtml($date, $searchType, $page);
    //$maxPage = $policeRequest->getMaxPage($html);
    //$rows = $policeRequest->getRows($html);

    /*Displaying*/

    //echo("Max page: " . $maxPage);

    //foreach($rows as $row){
    //    var_dump($row);
    //    echo("<br><br>");
    //}

?>