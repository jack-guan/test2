pipeline {
  agent any
  stages {
    stage('myStage'){
      steps {
        sh 'ls -la' 
      }
    }
    stage('Build') {
      steps { 
        sh 'mvn clean'
      }
    }
    stage('Image') {
      steps { 
        sh './buildImg.sh'
      }
    }	
  }
}
