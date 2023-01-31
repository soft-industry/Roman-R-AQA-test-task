#Changes were made in the project:
* Renamed post_product.feature to search_product feature according to tested functionality
* Rename class CarsAPI to SearchApi according to the functionality being tested
* Added two classes for encapsulation @Steps - SearchRequestsSteps and SearchVerificationSteps 
* Made steps definitions, e.g. in the .feature file replaced the full URLs with keywords
* A SearchResultItem class was created to parse a response that contains search results. The solution is stupid but I wasn't able to find a method which was able to do it "out of the box"
* Added description of testing scenarios
* Updated methods that verify responses of the server

#To run tests and generate report use maven command
```json
$ mvn clean verify
```