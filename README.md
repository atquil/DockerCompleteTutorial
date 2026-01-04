# DockerCompleteTutorial


Steps to run Fat Jar

- Step 1: Build the JAR using Gradle
  - (Windows users: use .\gradlew.bat)
  - `./gradlew clean bootJar`

- Step 2: Build the Docker Image
  - -t gives the image a name (tag)
  - `docker build -t java-fatjar-docker-demo:v1 .`

- Step 3: Run the Container
  - -p 8080:8080 maps your local port 8080 to the container's port 8080
  - `docker run -p 8080:8080 --name dockerTutorialContainer java-fatjar-docker-demo:v1`


# DockerCompleteTutorial

## Phase 1 : Fat Jar (basic)
Steps to run Fat Jar

- Step 1: Build the JAR using Gradle
  - (Windows users: use .\gradlew.bat)
  - `./gradlew clean bootJar`

- Step 2: Build the Docker Image
  - -t gives the image a name (tag)
  - `docker build -t java-fatjar-docker-demo:v1 .`

- Step 3: Run the Container
  - -p 8080:8080 maps your local port 8080 to the container's port 8080
  - `docker run -p 8080:8080 --name dockerTutorialContainer java-fatjar-docker-demo:v1`

## Phase 2 : Multi-step (Layered)
-	Step 1: Build the JAR using Gradle: `./gradlew clean bootJar`
-	Step 2: Build the Docker Image: `docker build -t java-docker-layred:v1 .`
-	Step 3: Run the Container : `docker run -p 8080:8080 --name dockerLayeredTutorial java-docker-layered:v1`

## Phase 3 : Orchestration with Docker Compose
-	Step 1: Build the JAR using Gradle: ./gradlew clean bootJar
-	Step 2: Build the Docker Image: docker build -t java-docker-layred:v1 .
-	Step 3: Run the Container : docker run -p 8080:8080 --name dockerLayeredTutorial java-docker-layered:v1
