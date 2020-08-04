# Start Spring-boot-gradle project

STEPS

1. Download spring-boot-cli
 - http://repo.spring.io/release/org/springframework/boot/spring-boot-cli/1.3.6.RELEASE/spring-boot-cli-1.3.6.RELEASE-bin.zip
 - Other versions :: https://repo.spring.io/release/org/springframework/boot/spring-boot-cli
  
2. Add Spring-boot-cli to Environment Path
 - Win + R -> Type "sysdm.cpl" -> Advanced Settings ...
 
3. Check Spring-boot-cli well set
 - CMD -> Type "spring --version"
 
4. Make Gradle 
 - CMD -> Type "spring init -d=web,thymeleaf,data-jpa,h2 --groupId=com.manning \
 --artifactId=readinglist --name="Reading List" --package-name=readinglist \
 --description="Reading List Demo" --build gradle readinglist"
 
 - PS. \ is line feed
 
 5. Execute Project
  - CMD -> Type "gradlew.bat bootRun"
 
 6. Build Project
  - CMD -> Type "gradlew.bat build"
  
 7. Excute Project
  - CMD -> Type "java -jar build/libs/readinglist-0.0.1-SNAPSHOT.jar"
 
 8. Execute Browser to Check All done
  - http://localhost:8080
   404 Not Found -> It's done
