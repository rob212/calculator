pipeline {
    agent any
    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("Unit test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("Code coverage") {
            steps {
                sh "./gradlew test jacocoTestReport"
                publishHTML (target: [
                    reportDir: 'build/reports/jacoco/test/html',
                    reportfiles: 'index.html',
                    reportName: "Jacoco Code Coverage Report"
                ])
                sh "./gradlew test jacocoTestCoverageVerification"
            }
        }
    }
}