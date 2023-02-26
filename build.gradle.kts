plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "com.backdoor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
application {
    mainClass.set("MainKt")
}