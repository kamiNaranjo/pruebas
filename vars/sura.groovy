def call(url) {
    gradle 'Gradle 2.3'
    pipeline {
      agent any
      stages {
        stage('Build') {
          stage('GIT') {
            steps {
                git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: "${url}"

            }
        }
        stage('Gradle') {
            steps {
                sh 'gradle clean build'
            }
        }
        }
      }
    }
} 
