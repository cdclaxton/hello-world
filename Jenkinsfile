pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK 1.8'
    }

    stages {
        stage('Compile') {
            steps {
                deleteDir()
                sh 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp target/*.jar com.github.cdclaxton.Main'
            }
        }
    }
}