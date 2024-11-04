pipeline {
    agent any
    
    environment {
        USER_CREDENTIALS = credentials('dkpsena')
    }
    stages {
        stage('Run') {
            steps {
                sh "echo $USER_CREDENTIALS_USR"
                sh "echo $USER_CREDENTIALS_PSW"
            }
        }
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
        stage('Deploy WAR') {
            steps {
                script {
                    echo "Running Deploy WAR"
                    sh """
                    /opt/IBM/WebSphere/AppServer/bin/wsadmin.sh -conntype $CONN_TYPE -host $REMOTE_HOST -port $REMOTE_PORT -username $ADMIN_USER -password $ADMIN_PASS -c "AdminApp.install('$WAR_FILE', '[-node $NODE_NAME -server $SERVER_NAME -appname $APP_NAME]')"
                    /opt/IBM/WebSphere/AppServer/bin/wsadmin.sh -conntype $CONN_TYPE -host $REMOTE_HOST -port $REMOTE_PORT -username $ADMIN_USER -password $ADMIN_PASS -c "AdminConfig.save()"
                    /opt/IBM/WebSphere/AppServer/bin/wsadmin.sh -conntype $CONN_TYPE -host $REMOTE_HOST -port $REMOTE_PORT -username $ADMIN_USER -password $ADMIN_PASS -c "AdminControl.invoke(AdminControl.completeObjectName('type=Application,name=$APP_NAME,*'), 'start')"
                    """
                 }
             }
        }
    }
}
