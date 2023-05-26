import java.io.*
import groovy.io.*

@NonCPS
def call(Map config=[:]){
def dir = "/home/jenkins/ben/workspace/HelloPipeline"

echo "Build number is : ${BUILD_NUMBER}"
new File(dir + '/releasenotes.txt').withWriter('utf-8')
        {
                writer ->
            dir.eachFileRecurse(FileType.ANY) { file ->
         if (file.isDirectory()){
                    writer.writeLine(file.name);
                }
                else
                {
                    writer.writeLine('\t' + file.name + '\t' + file.length());
                }
    }
  }
}
