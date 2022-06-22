$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:CreateNewAccount.feature");
formatter.feature({
  "name": "To check fb 1st page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To click create new account and sign button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@jo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click create new button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toClickCreateNewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass fb first name",
  "rows": [
    {
      "cells": [
        "aala",
        "vino",
        "car"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.passFbFirstName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pass sur name",
  "rows": [
    {
      "cells": [
        "audi",
        "a4",
        "multithronic"
      ]
    },
    {
      "cells": [
        "bmw",
        "x series",
        "s drive"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.passSurName(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickSignupButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Login.feature");
formatter.feature({
  "name": "To check login functions",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toOpenChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass valid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@vinoth"
    }
  ]
});
formatter.step({
  "name": "To pass valid username nd password",
  "rows": [
    {
      "cells": [
        "username",
        "rolls royce"
      ]
    },
    {
      "cells": [
        "password",
        "ghost"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassValidUsernameNdPassword(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:98)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy23.sendKeys(Unknown Source)\r\n\tat org.base.BaseClass.sendkey(BaseClass.java:50)\r\n\tat org.step.StepDefinition.toPassValidUsernameNdPassword(StepDefinition.java:82)\r\n\tat ✽.To pass valid username nd password(file:Login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click LoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toOpenChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mini"
    }
  ]
});
formatter.step({
  "name": "To pass invalid username nd invalid password",
  "rows": [
    {
      "cells": [
        "moive",
        "lang",
        "hero"
      ]
    },
    {
      "cells": [
        "vikram",
        "tamil",
        "kamal"
      ]
    },
    {
      "cells": [
        "beast",
        "tamil",
        "vijay"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassInvalidUsernameNdInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click LoginButton",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});