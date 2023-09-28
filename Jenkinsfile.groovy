pipeline {
    agent any

    stages {
        stage('Checkout and Pull') {
            steps {
                script {
                    // Navigirajte do direktorijuma sa vašim Git repozitorijumom
                    dir('C:\\Users\\vboxuser\\Documents\\New folder\\prouft') {
                        // Izvršite git checkout na master granu
                        sh 'git checkout master'

                        // Povucite najnovije promene sa udaljenog repozitorijuma
                        sh 'git pull'
                    }
                }
            }
        }
        
        stage('Run UFT Scenario') {
            steps {
                uftScenarioLoad(
                    testPaths: 'C:\\Users\\vboxuser\\Documents\\New folder\\prouft',
                    archiveTestResultsMode: 'doNotArchive'
                )
            }
        }

        // Dodajte ostale faze i korake za vašu Jenkins Pipeline
    }
}
