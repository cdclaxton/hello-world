pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Time') {
            steps {
                sh 'date'
                sh 'whoami'
            }
        }
    }
}