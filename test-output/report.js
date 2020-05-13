$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Account Holder withdraws cash",
  "description": "",
  "id": "account-holder-withdraws-cash",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Account has sufficient funds",
  "description": "",
  "id": "account-holder-withdraws-cash;account-has-sufficient-funds",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches URL",
  "keyword": "Given "
});
formatter.match({
  "location": "testBase.user_launches_URL()"
});
formatter.result({
  "duration": 58142063480,
  "status": "passed"
});
});