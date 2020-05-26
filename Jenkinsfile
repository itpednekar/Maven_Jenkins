pipeline {
    agent any
    tools{
        maven 'maven3.6'
    }
    stages {
        stage('Build') {
            steps {
               echo 'Building..' 
                sh "mvn install"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh "mvn deploy"
            }
        }
    }
}
