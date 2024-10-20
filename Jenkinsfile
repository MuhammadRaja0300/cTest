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
                    withMaven(maven: 'Maven 3.x') {
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
