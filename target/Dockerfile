FROM tomcat:8-jre8-alpine
#this is the image we are trying to create 
#prepare environment

#RUN clear w.e is already in webaps folder --> rf(recursive force) : clear subdirectories
#command being run in container: container user folderr local...
RUN rm -rf /usr/local/tomcat/webapps/*

COPY ServletProj.war /usr/local/tomcat/webapps/ServletProj.war
#^^copy takes artifact from the file directory where the dockerfile is and places it in the tomcat webapp folder
CMD ["catalina.sh", "run"]
# want it to run file cataline.sh