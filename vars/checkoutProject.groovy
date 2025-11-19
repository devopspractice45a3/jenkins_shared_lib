def call(Map args = [:]) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: args.branch ?: 'master']],
        userRemoteConfigs: [[url: args.url]]
    ])
}
