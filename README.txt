Requirements for fully-functional project viewing/editing:

Eclipse J2EE version: http://www.eclipse.org/downloads/moreinfo/jee.php
AWS Eclipse plugin, Update site: http://aws.amazon.com/eclipse/
Google Eclipse plugin, Update site: http://dl.google.com/eclipse/plugin/3.6 (or whichever matches your version of eclipse)

Also, in order for the integration with AWS to function properly, you have to set
access and secret keys in Window > Preferences > AWS Toolkit

Import the existing elastic beanstalk environment into eclipse's list of servers, 
or create a new Elastic beanstalk environment.

A tomcat 7 server can be used to test changes locally (not tomcat 6 for some reason,
maybe eclipse gets confused because the AWS server is also tomcat 6?)

The basic workflow is, code change, GWT compile, re-publish to local or AWS server, load page(s) in browser.
