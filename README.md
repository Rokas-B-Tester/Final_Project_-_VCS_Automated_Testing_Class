## Vilnius Coding School Automated Testing Class 20220916

## Final Project

## Automation tests for www.biofitus.lt

### Link to the webpage - [www.biofitus.lt](https://biofitus.lt/)

### Technologies:
- JAVA
- Maven

### Dependency Packages used
- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`

### Test Suites (3):
- Log in/out to and from the website, positive/negative
- Website search functionality testing positive/negative
- Random customer interactions on the website

## Test Suite No.1 - Log in/out to and from the website
### Test Case 1 - Login to the website using valid data
* Test steps:
  * [x] Input valid email
  * [x] Input valid password
  * [x] Click LogIn
    * Expected result: User is redirected to https://biofitus.lt/mano-paskyra
<br> <br/>
### Test Case 2 - Login to the website using invalid data
* Test steps:
    * [x] Input invalid email
    * [x] Input valid password
    * [x] Click LogIn
      * Expected result: warning message "Neteisingi prisijungimo duomenys arba tokiu el. paštu registruotos paskyros nėra." appears
<br> <br/>
### Test Case 3 - Logout from the website (using valid data)
* Test steps:
    * [x] Input valid email
    * [x] Input valid password
    * [x] Click LogIn
    * [x] User is redirected to https://biofitus.lt/mano-paskyra
    * [x] User clicks logout button
        * Expected result: User is successfully logged out from his account
<br> <br/>
## Test Suite No.2 - Website search functionality testing
### Test Case 1 - Using websites search function w/valid data
* Test steps:
    * [x] Input valid Keywords into search
    * [x] Click on search Button
    * [x] Search results are displayed
          * Expected result: User is redirected to https://biofitus.lt/index.php?fc=module&module=leoproductsearch&controller=productsearch&cate=&search_query="yoursearchkeyword"
<br> <br/>
### Test Case 2 - Using websites search function w/invalid data
* Test steps:
    * [x] Input invalid Keywords into search
    * [x] Click on search Button
    * [x] Empty search result page is displayed
      * Expected result: User gets a warning message "Rezultatų nerasta."
<br> <br/>
### Test Case 3 - Search using empty search input field
* Test steps:
    * [x] Leave search input empty
    * [x] Click on search Button
    * [x] Empty search result page is displayed
        * Expected result: User gets a warning message "Įveskite paieškos žodį."
<br> <br/>
## Test Suite No.3 - Random user interacitons with website
### Test Case 1 - Adding product to wishlist while NOT logged in
* Test steps:
    * [x] Random product from default display in homepage is selected
    * [x] User is redirected to product page
    * [x] Add to wish list button is clicked
    * [x] Warning modal window pops-up
      * Expected result: User gets warning message "You must be logged in to manage your wishlist" in pop up modal
<br> <br/>
### Test Case 2 - Adding product to wishlist while logged in
* Test steps:
    * [x] Input valid email
    * [x] Input valid password
    * [x] Click LogIn
    * [x] User is redirected to his account page https://biofitus.lt/mano-paskyra
    * [x] User clicks on homepage button from his account page
    * [x] Random product from default display in homepage is selected
    * [x] User is redirected to a product page
    * [x] Add to wish list button is clicked
        * Expected result: WishList (NORŲ SĄRAŠAS) quantity is increased by 1
<br> <br/>
### Test Case 1 - Adding product to wishlist while NOT logged in
* Test steps:
  * [x] Random product from default display in homepage is selected
  * [x] User is redirected to product page
  * [x] Product quantity is increased by 1
  * [x] Add to cart Button is clicked
  * [x] Pop-up modal window appears
    * Expected result: User gets message "Prekė sėkmingai pridėta į krepšelį" about products being successfully added to the cart