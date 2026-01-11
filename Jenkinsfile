pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Recuperation du code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Tests unitaires...'
                sh 'mvn test'
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging...'
                sh 'mvn package -DskipTests'
            }
        }

        stage('Archive') {
            steps {
                echo 'Archivage...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Notify Slack') {
            steps {
                echo 'Notification Slack...'
                slackSend(
                    channel: '#devops-notifications',
                    color: 'good',
                    message: "SUCCESS: PipeLine-HafdiYoussef Build #${env.BUILD_NUMBER} termine avec succes!"
                )
            }
        }
    }

    post {
        success {
            echo 'Build reussi!'
        }
        failure {
            echo 'Build echoue!'
            slackSend(
                channel: '#devops-notifications',
                color: 'danger',
                message: "ECHEC: PipeLine-HafdiYoussef Build #${env.BUILD_NUMBER} a echoue!"
            )
        }
        always {
            cleanWs()
        }
    }
}
