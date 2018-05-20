node {
  stage('SCM Checkout') {
    git 'https://github.com/rukmanand/sample-java-project/new/master'
  }
  stage('Compile-package') {
    sh 'mvn pacakge'
  }
}
