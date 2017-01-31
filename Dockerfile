FROM java:8-jre

RUN mkdir -p /usr/local/app
Add build/libs/*.jar /usr/local/app
CMD java -jar /usr/local/app/*.jar