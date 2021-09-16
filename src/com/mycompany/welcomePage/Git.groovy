package com.mycompany.welcomePage

class Git implements Serializable {

    private final def script

    Git(def script) {
        this.script = script
    }

    def checkout(String repoUrl) {
        this.script.git credentialsId: Constants.JENKINS_GITHUB_CREDENTIALS_ID, url:"$'repoUrl'"
    }

    String commitHash() {
        return this.script.sh(script: getLatestGitCommitHashCommand(), returnStdout: true).trim()
    }

    private static String getLatestGitCommitHashCommand() {
        return "git rev-parse HEAD"
    }
}
