pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    // Use the configured Maven installation
                    withMaven(maven: 'Apache Maven 3.9.9') {
                        sh 'mvn clean test'
                    }
                }
            }
        }
        stage('Post Actions') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
