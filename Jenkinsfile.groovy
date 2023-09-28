pipeline {
    agent { 
    label 'windows'

    stages {
        stage('Checkout and Pull') {
            steps {
                script {
                    // Navigirajte do direktorijuma sa vašim Git repozitorijumom
                    dir('C:\\Users\\vboxuser\\Documents\\New folder\\br') {
                        // Izvršite git checkout na master granu
                        bat 'git checkout master'

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

        // Dodajte ostale faze i korake za vašu Jenkins Pipeline
    }
}
