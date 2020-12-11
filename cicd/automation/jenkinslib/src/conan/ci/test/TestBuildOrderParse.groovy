package conan.ci.test

import conan.ci.conan.BuildOrder
import conan.ci.util.DemoLogger
import net.sf.json.JSONArray
import net.sf.json.groovy.JsonSlurper
class TestBuildOrderParse {

    static void run(def currentBuild) {
        DemoLogger.debug(currentBuild, "running conanCreateAndUploadFromLockfiles")
        def jsonStr = """[
 [
  [
   "3",
   "libB/1.0@mycompany/stable#ddd949983d7d98ecff163e995530f655:df10e7c5c10b0aade71ef35fee88e6f75779b39f"
  ],
  [
   "5",
   "libC/1.0@mycompany/stable#2d72442493a73de4d5a04077194112a4:df10e7c5c10b0aade71ef35fee88e6f75779b39f"
  ]
 ],
 [
  [
   "2",
   "libD/1.0@mycompany/stable#e4b55773f5af3b54872da5cb3925481c:e0b8c47e930b65636d70aa71191b06d4cdc51120"
  ]
 ],
 [
  [
   "1",
   "App/1.0@mycompany/stable#0218ff21ca6ce217dbd7ad0129305878:9addeceb117b18112908457333a43de9c0283f51"
  ]
 ]
]"""
        JSONArray jsonArray = new JsonSlurper().parseText(jsonStr) as JSONArray
        jsonArray.withIndex().each { Tuple2 tuple -> currentBuild.echo("${tuple.first} : ${tuple.second}") }
        BuildOrder.fromSingleBuildOrder(jsonArray)

    }

}
