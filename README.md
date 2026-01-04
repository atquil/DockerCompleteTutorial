# DockerCompleteTutorial


Steps to run Fat Jar

- Step 1: Build the JAR using Gradle
  - (Windows users: use .\gradlew.bat)
  - `./gradlew clean bootJar`

- Step 2: Build the Docker Image
  - -t gives the image a name (tag)
  - `docker build -t java-docker-demo:v1 .`

- Step 3: Run the Container
  - -p 8080:8080 maps your local port 8080 to the container's port 8080
  - `docker run -p 8080:8080 --name my-running-app java-docker-demo:v1`