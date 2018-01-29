# To be 

import secrets
from selenium import webdriver

options = webdriver.ChromeOptions()

# Set chrome to run without a head
options.add_argument('headless')
options.add_argument('window-size=1200x600')

# Initialize the driver
driver = webdriver.Chrome(chrome_options=options)

driver.get("https://ufl.instructure.com")
# This takes you to elearning

# If you're not logged in, it redirects you to a page with login information

# Fill the login form and submit it
driver.find_element_by_id('username').send_keys(secrets.login['USERNAME'])
driver.find_element_by_id('password').send_keys(secrets.login['PASSWORD'])
driver.find_element_by_id('submit').click()

driver.get("https://ufl.instructure.com")

# Can now be used to access any UF site where authentication was needed.

## USEFUL FOR DEBUGGING
# driver.get_screenshot_as_file('elearning.png')