# 1. Base Image
FROM eclipse-temurin:21-jre

# 2. The Transfer (The Bottleneck)
# Copy the entire fat jar (dependencies + code)
ADD build/libs/dockerDemo.jar app.jar

# 3. Execution
ENTRYPOINT ["java","-jar","/app.jar"]

# 4. Optimization
# The "Greedy Roommate" Fix (Container Awareness)
ENV JAVA_OPTS="-XX:MaxRAMPercentage=75.0"
CMD ["--spring.profiles.active=prod"]
