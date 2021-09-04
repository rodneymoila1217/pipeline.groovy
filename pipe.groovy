job('Test PipeLine')
{
  scm {
      git('https://github.com/rodneymoila1217/pipeline.groovy.git'){

       }
    }
  triggers {
     scm('H/1 * * * *')
   }
  steps{
    sh echo "Hello There"
   }
  
}
