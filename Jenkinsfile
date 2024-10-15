pipeline {
    agent any

    stages {
        stage('Pull Code') {
            steps {
                checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sgupta8limitless/jendemo.git']])
            }
        }
        stage('Build Jar') {
            steps {
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Build Docker Image') {
            steps {
                bat "docker build -t jendemo-img ."
            }
        }
        stage('Run Docker Image') {
            steps {
                bat "docker run --name=jendemo-cont -p 8081:8080 -d jendemo-img"
            }
        }
    }
}
