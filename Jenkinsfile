pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo "Running job ${env.JOB_NAME} for build ${env.BUILD_ID}"
                sh "touch /tmp/${BUILD_TAG}"
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