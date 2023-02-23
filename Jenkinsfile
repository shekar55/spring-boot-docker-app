
pipeline {
    agent any 
      tools {
    	maven "Maven3"
     
    } 
       
      stages {
        
        stage('Clone Repo') {
          steps {
            sh 'rm -rf spring-boot-docker-app'
            sh 'git clone https://github.com/shekar55/spring-boot-docker-app.git'
            }
        }
        
        stage('Build'){
		steps{
			sh "mvn clean package"
		}
	  }
       
        stage('Build Docker Image') {
            steps {
              sh 'docker build -t chandu5562/springboot:latest .'
              }
        }
        stage('Push Docker image') {
            environment {
                DOCKER_HUB_LOGIN = credentials('docker')
            }
            steps {
                sh 'docker login --username=$DOCKER_HUB_LOGIN_USR --password=$DOCKER_HUB_LOGIN_PSW'
                sh    'docker push chandu5562/springboot:latest'
            }
        }
          
        stage('K8S Deploy') {
            steps {
                withKubeConfig([credentialsId: 'k8s', serverUrl: '']) {
                    sh ('kubectl apply -f  kube.yaml')
                }
            }
        }
        stage('Check WebApp Rechability') {
          steps {
          sh 'sleep 10s'
          sh ' curl http://3.108.67.219:30007'
          }
        }
        
      }
}
