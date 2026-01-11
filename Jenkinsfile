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

        stage('Notify') {
            steps {
                echo 'Notification Slack...'
                withCredentials([string(credentialsId: 'slack-webhook', variable: 'SLACK_URL')]) {
                    sh '''
                        curl -X POST -H 'Content-type: application/json' \
                        --data '{"text":"SUCCESS: PipeLine-HafdiYoussef Build #'"$BUILD_NUMBER"' OK!"}' \
                        $SLACK_URL
                    '''
                }
            }
        }
    }

    post {
        success {
            echo 'Build reussi!'
        }
        failure {
            echo 'Build echoue!'
        }
        always {
            cleanWs()
        }
    }
}
