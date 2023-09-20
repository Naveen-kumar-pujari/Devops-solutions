pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'npm install' // Replace with your build commands
            }
        }
        stage('Test') {
            steps {
                sh 'npm test' // Replace with your test commands
            }
        }
        stage('Deploy') {
            steps {
                sh './deploy.sh' // Replace with your deployment script
            }
        }
    }
}
