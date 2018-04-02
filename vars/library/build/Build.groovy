package library.build

def build(url) {
	git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: '${url}'
	gradle 'Gradle 2.3'
	sh 'gradle clean build'
}

return this