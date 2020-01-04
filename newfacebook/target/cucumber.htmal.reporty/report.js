$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com.feature");
formatter.feature({
  "line": 1,
  "name": "singing up for facebook account",
  "description": "",
  "id": "singing-up-for-facebook-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6646251700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "would like to sign up for facebook account",
  "description": "",
  "id": "singing-up-for-facebook-account;would-like-to-sign-up-for-facebook-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#Given user should navigate to facebook home page"
    },
    {
      "line": 6,
      "value": "#Then user should should enter firstname in first name field"
    },
    {
      "line": 7,
      "value": "#Then user should enter lastname in lastname field"
    },
    {
      "line": 8,
      "value": "#And user should enter email/mobile in email/mobile field"
    },
    {
      "line": 9,
      "value": "#And user should enter password in password field"
    }
  ],
  "line": 10,
  "name": "user should navigate to facebook home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user should should enter \"farrukh\" in first name field",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user should enter \"khan\" in lastname field",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should enter \"812771\" in email/mobile field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user should enter \"ajhdgasjsgd\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefface.user_should_navigate_to_facebook_home_page()"
});
formatter.result({
  "duration": 3664702800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "farrukh",
      "offset": 26
    }
  ],
  "location": "stepdefface.user_should_should_enter_in_first_name_field(String)"
});
formatter.result({
  "duration": 298518700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khan",
      "offset": 19
    }
  ],
  "location": "stepdefface.user_should_enter_in_lastname_field(String)"
});
formatter.result({
  "duration": 142178900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "812771",
      "offset": 19
    }
  ],
  "location": "stepdefface.user_should_enter_in_email_mobile_field(String)"
});
formatter.result({
  "duration": 125115500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ajhdgasjsgd",
      "offset": 19
    }
  ],
  "location": "stepdefface.user_should_enter_in_password_field(String)"
});
formatter.result({
  "duration": 189640500,
  "status": "passed"
});
formatter.after({
  "duration": 73300,
  "status": "passed"
});
});