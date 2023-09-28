pipeline {
    agent any
    stages {
        stage('Checkout and Pull') {
            steps {
                script {
                    // Navigirajte do direktorijuma sa vašim Git repozitorijumom
                    dir('C:\\Users\\vboxuser\\Documents\\New folder\\br') {

                        // Povucite najnovije promene sa udaljenog repozitorijuma
                        bat 'git pull'
                    }
                }
            }
        }
        
        stage('Run UFT Scenario') {
            steps {
                uftScenarioLoad(
                    testPaths: 'C:\\Users\\vboxuser\\Documents\\New folder\\br',
                    archiveTestResultsMode: 'doNotArchive'
                )
            }
        }

    }
}
