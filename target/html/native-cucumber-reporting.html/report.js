$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/googleHome.feature");
formatter.feature({
  "name": "google home page test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User goes to Google Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DucoTest"
    }
  ]
});
formatter.step({
  "name": "user is on Google homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User asserts google logo",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters \"\u003csearch\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks search",
  "keyword": "And "
});
formatter.step({
  "name": "User is shown their search",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on their desired site",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "search"
      ]
    },
    {
      "cells": [
        "hudl"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User goes to Google Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DucoTest"
    }
  ]
});
formatter.step({
  "name": "user is on Google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "googleStepsDef.user_is_on_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User asserts google logo",
  "keyword": "When "
});
formatter.match({
  "location": "googleStepsDef.user_asserts_google_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"hudl\"",
  "keyword": "And "
});
formatter.match({
  "location": "googleStepsDef.the_user_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "googleStepsDef.user_clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown their search",
  "keyword": "And "
});
formatter.match({
  "location": "googleStepsDef.user_is_shown_their_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on their desired site",
  "keyword": "Then "
});
formatter.match({
  "location": "googleStepsDef.user_clicks_on_their_desired_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I\u0027m feeling lucky test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DucoTest"
    }
  ]
});
formatter.step({
  "name": "user is on Google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "googleStepsDef.user_is_on_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User asserts google logo",
  "keyword": "When "
});
formatter.match({
  "location": "googleStepsDef.user_asserts_google_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on feeling lucky",
  "keyword": "And "
});
formatter.match({
  "location": "feelingLucky.user_clicks_on_feeling_lucky()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user asserts intro text",
  "keyword": "Then "
});
formatter.match({
  "location": "feelingLucky.user_asserts_intro_text()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User goes to Google Homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DucoTest"
    }
  ]
});
formatter.step({
  "name": "user is on Google homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "googleStepsDef.user_is_on_Google_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User asserts google logo",
  "keyword": "When "
});
formatter.match({
  "location": "googleStepsDef.user_asserts_google_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes last 1 hour activity",
  "keyword": "Then "
});
formatter.match({
  "location": "googleStepsDef.deletesCookies()"
});
formatter.result({
  "status": "passed"
});
});