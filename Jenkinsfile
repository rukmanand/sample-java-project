node {
  stage('SCM Checkout') {
    git 'https://github.com/rukmanand/sample-java-project'
  }
  stage('Compile-package') {
    sh 'mvn pacakge'
  }
}
