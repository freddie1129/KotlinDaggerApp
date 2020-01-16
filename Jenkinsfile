pipeline {
    agent any
    stages {
        stage('build') {
            steps {
		sh 'echo ########################################'
		sh 'echo $HOME'
                sh 'gradlew'
            }
        }
    }
}
