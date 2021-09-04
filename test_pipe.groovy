node{
  stage('Prep') {
    git 'https://github.com/rodneymoila1217/pipeline.groovy.git'
   }
 stage('Build')
   {
     sh 'echo "Hello world"'
   
   }

 stage('Results')
  {
    sh 'echo "Results"'
  }

}
