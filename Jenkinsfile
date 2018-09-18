pipeline
agent any
options{

buildDiscards(logRotator(numTokeepstr: '2', artifactsNumTokeepstr: '1'))
}
stages {
stage('build') {
steps {
sh 'ant sh 'ant -f build.xml'
}
}
stage('unit Test'){
steps{
junit 'reports/results.xml'
}

}

}
post {
  always {
   archiveArtifacts artifacts:  'dist/*.jar', fingerprint: true
}

}
}
