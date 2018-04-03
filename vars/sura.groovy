def call(url) {
    pipeline {
      agent any
      stages {
        stage('Build') {
          steps {
            cleanWs()
            git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: "${url}"
            gradle 'Gradle 2.3' 
            sh 'gradle clean build'
          }
        }
      }
    }
} 
