package library.build

def call(body) {
	def config = [:]
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = config
	body()
	
	pipeline {
		agent any
		
		stages {
			stage('Build') {
				steps{
					echo ${config.url}

					/*git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: '${config.url}'
					gradle 'Gradle 2.3'
					sh 'gradle clean build'*/
				}
			}
		}
	}
}