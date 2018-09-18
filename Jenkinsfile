<<<<<<< HEAD
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
=======
pipeline {

  agent any

   stages {
    stage('build') {
     steps {
       sh 'ant -f build.xml'
>>>>>>> 256383db599dfa905bbf86710b0a22eafcb0a4ac
}

}

}
post {
  always {
<<<<<<< HEAD
   archiveArtifacts artifacts:  'dist/*.jar', fingerprint: true
}

}
=======
   archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
}

}

>>>>>>> 256383db599dfa905bbf86710b0a22eafcb0a4ac
}
