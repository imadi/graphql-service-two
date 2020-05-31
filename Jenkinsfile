pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                echo "Hello"
            }
        }
        stage('Read pom') {
            steps {
                echo "Reading pom.xml"
//                script {
//                    def text = new XmlSlurper().parse(new File("pom.xml")).version.text()
//                    echo "text ${text}"
//                }
                script {
                    pom = readMavenPom file 'pom.xml'
                    echo "version ${pom.version}"
                }

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