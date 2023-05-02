pipeline {
    agent any
    
    enviroment {
        workspace =  "${workspace}"
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building.. This is the Value' workspace  
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
