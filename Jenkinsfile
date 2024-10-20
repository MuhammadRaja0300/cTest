pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean test'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts 'target/cucumber-reports/*'
            junit 'target/cucumber-reports/*.xml'
        }
    }
}
