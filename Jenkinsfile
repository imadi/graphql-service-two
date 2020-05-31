pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo "Hello"
            }
        }
        stage('mvn') {
            stages {
                sh 'mvn -version'
            }
        }
    }
}