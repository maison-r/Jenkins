Jenkinsfile
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "Building the code using Maven (Build automation tool)."
                echo 'Tool: Maven'
            }
            post {
                success{
                    mail to: "m.rovacsek@hotmail.com",
                    subject: "build status",
                    body: "build was successful"
                }
            }
        }
    }
}
         