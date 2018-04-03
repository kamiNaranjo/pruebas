def call(url) {
    pipeline {
        agent any
        tools {
            gradle 'Gradle 2.3'
        }
        stages {
            stage('GIT') {
                steps {
                    git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url:'http://inboggit01.suramericana.com.co:8080/gitbucket/git/Devops/DevopsApi.git'
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
