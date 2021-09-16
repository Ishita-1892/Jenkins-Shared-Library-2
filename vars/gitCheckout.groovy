def checkout(String repoUrl)
{
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], 
            extensions: [], 
            userRemoteConfigs: [[credentialsId: 'fef46474-5723-4bd7-bdc8-34c888d2903a',url: repUrl]]])
  
}
        
  
