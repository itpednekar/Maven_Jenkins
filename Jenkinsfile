pipeline {
    agent any
    tools{
        maven 'maven3.6'
        jdk 'jdk1.8'
    }
    stages {
        stage('Build') {
            steps {
               bat "mvn spring-boot:run"
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
