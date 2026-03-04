pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/Aditya01237/scientific-calculator-devops.git'
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
            mail to: 'adityapareek874@gmail.com',
                 subject: 'Build Successful',
                 body: 'Jenkins build completed successfully.'
        }

        failure {
            mail to: 'adityapareek874@gmail.com',
                 subject: 'Build Failed',
                 body: 'Jenkins build failed. Please check logs.'
        }

    }
}