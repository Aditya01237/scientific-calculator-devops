pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t adityapareek01/calculator:latest .'
            }
        }

        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                    sh 'docker push adityapareek01/calculator:latest'
                }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh 'ansible-playbook -i ansible/inventory.ini ansible/deploy.yml'
            }
        }

    }

    post {
        success {
            mail (
                to: 'adityapareek874@gmail.com',
                subject: "SUCCESS: Build ${env.BUILD_NUMBER} - ${env.JOB_NAME}",
                body: "Build #${env.BUILD_NUMBER} completed successfully.\nJob: ${env.JOB_NAME}\nBuild URL: ${env.BUILD_URL}"
            )
        }
        failure {
            mail (
                to: 'adityapareek874@gmail.com',
                subject: "FAILED: Build ${env.BUILD_NUMBER} - ${env.JOB_NAME}",
                body: "Build #${env.BUILD_NUMBER} has failed.\nJob: ${env.JOB_NAME}\nBuild URL: ${env.BUILD_URL}\nCheck Jenkins console for details."
            )
        }
    }
}