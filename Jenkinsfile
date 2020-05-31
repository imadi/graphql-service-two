pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo "Hello"
            }
        }
        stage('mvn') {
            steps {
                sh 'mvn -version'
            }
        }
    }
    post {
        success {
            slackSend channel: '#update',
                    color: 'good',
                    message: "Release, success: ${currentBuild.fullDisplayName}."
        }
        failure {
            slackSend channel: '#update',
                    color: 'danger',
                    message: "Release, FAILED: ${currentBuild.fullDisplayName}."
        }
    }
}