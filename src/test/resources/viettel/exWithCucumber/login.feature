Feature: Login

@tag1
Scenario: Show tooltip mess when log in with invalid value
Given I am on the log in page
When I put invalid user and blank password
And I click on log in button
Then I see to tooltip "Hãy nhập E-mail ở định dạng: user@email.com" at email field
And I see tooltip "Mật khẩu chỉ nhận giá trị chữ và số" at password field

@tag2
Scenario: Display homepage after log in with valid credentail
Given I am on the log in page
When I put valid user and password
And I click on log in button
Then I see the home page