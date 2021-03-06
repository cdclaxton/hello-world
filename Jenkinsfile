pipeline {
    agent any

    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK 1.8'
    }

    stages {
        stage('Checkout') {
            steps {
                echo "Cleaning the workspace ..."
                cleanWs()

                echo "Checking out branch: ${env.BRANCH_NAME}"
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
                sh 'java -jar frontend/target/*-jar-with-dependencies.jar'
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
            post {
                success {
                    echo "Archiving build"
                    archiveArtifacts artifacts: 'frontend/target/*-jar-with-dependencies.jar',
                        excludes: 'frontend/target/*SNAPSHOT*-jar-with-dependencies.jar'
                }
            }
        }

        stage('Deploy release') {
            when {
                branch 'master'
            }
            steps {
                echo "Deploying the software ..."
            }
        }
    }
}