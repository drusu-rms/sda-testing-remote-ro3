## Task1 - Explore http://qatools.ro/calculate/appApi.html via Chrome DevTools 

- use Elements and Console tabs to inspect all elements visible on the front end (browser) 
    
	- write at least 2 CSS selectors for each
	
	- get/set the text for all elements (tags) that accept that 

    - get/set the values for input and select elements 
	
	- try clicking the CALCULATE button via console
	
- using the Network tab - explore network calls for each operation type (SUM, MULTIPLICATION, DIVISION)
  
  - write down the URL, HTTP Method, url params and returned JSON
   
  - print the fetched JSON in a huma readable format (indented) 
  
    i.e. (Console)
	```
	result = { resultFromSum }
	JSON.stringify(result, ...
	```