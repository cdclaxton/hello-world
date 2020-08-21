pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK 1.8'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out branch ${branch}"
                git branch: "${env.BRANCH_NAME}", credentialsId: 'Github-login', url: 'https://github.com/cdclaxton/hello-world.git'
            }
        }

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

                  echo "Preparing release ..."
                  sh "mvn --batch-mode release:prepare -Dusername=${USERNAME} -Dpassword=${PASSWORD}"

                  echo "Performing release ..."
                  sh "mvn --batch-mode release:perform -Dusername=${USERNAME} -Dpassword=${PASSWORD}"
                }
            }
        }

        stage('Deploy') {
            when {
                branch 'master'
            }
            steps {
                echo "Deploying the software ..."
            }
        }
    }
}