pipeline {
    agent any

    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'Special greeting')
    }

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