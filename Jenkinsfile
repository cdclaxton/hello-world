pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo "Running job ${env.JOB_NAME} for build ${env.BUILD_ID}"
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