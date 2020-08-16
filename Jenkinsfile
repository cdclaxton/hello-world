pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK 1.8'
    }

    stages {
        stage('Compile') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }

        stage('Release') {
            when {
                branch 'master'
            }
            steps {
                echo "Running release for master branch"
                withCredentials([usernamePassword(credentialsId: 'Github-login', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                  echo "username is $USERNAME"
                }
            }
        }
    }
}