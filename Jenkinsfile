pipeline {
    agent any
    tools{
        maven 'maven3.6'
    }
    stages {
        stage('Build') {
            steps {
               bat "mvn package"
               echo 'Building..' 
              
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
                
            }
        }
    }
}
