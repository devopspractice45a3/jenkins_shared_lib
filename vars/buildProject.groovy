def call(Map args = [:]){
    def tool = args.tool ?: "maven"
    def phase = args.phase ?: "clean install" 
    def cmd = ""
    if (tool == 'maven'){
        cmd = "mvn ${phase}" 
    }else if (tool == 'gradle'){
        cmd = "./gradlew ${phase}"
    }else if (tool == "npm") {
        cmd = "npm ${phase}"
    }

bat cmd
}