# jagacy-cucumber-bdd-example
Automated Acceptance tests for Mainframe Green screens with Jagacy &amp; Cucumber

This example requires Jagacy3270 library from 2015 Please download the Jagacy evaluation bundle from https://web.archive.org/web/20160731191730/http://jagacy.com/Jagacy3270_evaluation.zip and copy  ```jagacy3270.jar``` file from the bundle to ```src/test/resources/lib``` folder

To run the example:

```
right click RunCukesTest.java in eclipse -> run as -> junit test

It will not work in office SQS wifi it has to be connected to an open wifi for the project to work
```

```
jagacy.properties contains the mainframe automation URL information so it can pointed to different servers
```

```
jagacy.jar in this project is from the 2015 build and can be downloaded here : https://web.archive.org/web/20160731191730/http://jagacy.com/Jagacy3270_evaluation.zip
```

This will launch a test on sample interface provided with Jagacy

