package co.com.sura.dsl

def build(url) {
	cleanWs()
	git credentialsId: '0df8e168-c5ab-452f-b993-29496cfbcd29', url: "${url}"
	sh 'gradle clean build'	
}

def publishJunitTest(path) {
	junit "${path}"
}

