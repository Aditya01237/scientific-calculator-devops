pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/YOUR_USERNAME/scientific-calculator-devops.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

    }

    post {

        success {
            mail to: 'developer@example.com',
                 subject: 'Build Successful',
                 body: 'Jenkins build completed successfully.'
        }

        failure {
            mail to: 'developer@example.com',
                 subject: 'Build Failed',
                 body: 'Jenkins build failed. Please check logs.'
        }

    }
}