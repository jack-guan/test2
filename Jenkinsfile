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
        sh 'mvn package'
      }
    }
    stage('Image') {
      steps { 
        sh 'buildImage.sh'
      }
    }	
  }
}
