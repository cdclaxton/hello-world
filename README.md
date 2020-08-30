# hello-world

Hello World project for playing with Jenkins.

This multi-module Java project uses:
 
* Maven Release Plugin to perform releases (generates Git tags and updates the versions in the POM files); and
* Maven Assembly Plugin to create a runnable 'uber' Jar, i.e. a Jar with all the required dependencies.

A Jenkins build system was set up in a Docker container and this project was built and released. The Jenkinsfile
configures the pipelines for a 'Multibranch Pipeline'.
