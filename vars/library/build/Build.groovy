package library.build

def call(url) {
	def config = [:]
	
	pipeline {
		agent any
		
		stages {
			stage('Build') {
				steps{
					git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: '${config.url}'
					gradle 'Gradle 2.3'
					sh 'gradle clean build'
				}
			}
		}
	}
}

return this