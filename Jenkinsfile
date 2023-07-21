pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git url: "https://github.com/pittour/maven_jenkins.git", branch: 'main'
                echo "Repétoire vidé"
            }
            
        }
        stage('Build') {
            steps {
                sh "mvn clean install compile test package verify"
                echo "l'app a été buildée"
            }
            
        }
        stage('Run') {
            steps {
                sh "java -jar target/demo-0.1.jar"
                echo "L'app est run"
            }
            
        }
    }
}