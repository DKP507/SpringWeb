pipeline {
    agent any

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
                echo "JENKINS_HOME - ${env.JENKINS_HOME}//workspace/Test100/target/  || WORKSPACE - ${env.WORKSPACE} BUIL URL- ${env.BUILD_URL}"
            }
        }
    }
}
