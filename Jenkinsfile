pipeline {
    agent any
    
    environment {
        workspace =  ""
    }

    stages {
        stage('Build') {
            steps {
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
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "JENKINS_HOME - ${env.JENKINS_HOME} on - ${env.WORKSPACE_TMP} BUIL URL- ${env.BUILD_URL}"
            }
        }
    }
}
