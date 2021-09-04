job('Test PipeLine')
{
  scm {
      git('https://github.com/rodneymoila1217/pipeline.groovy.git'){
        node / gitConfigName('rodneymoila1217')
        node / gitConfigEmail('rodneymoila@gmail.com')

       }
    }
  triggers {
     scm('H/1 * * * *')
   }
  steps{
    sh echo "Hello There"
   }
  
}
