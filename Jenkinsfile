pipeline {
    agent any
    tools{
        maven 'maven3.6'
    }
    stages {
        stage('Build') {
            steps {
               echo 'Building..' 
                bat "mvn install"
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
                bat "mvn deploy"
            }
        }
    }
}
