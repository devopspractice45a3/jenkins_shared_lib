def call(Map args = [:]) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: args.branch ?: 'main']],
        userRemoteConfigs: [[url: args.url]]
    ])
}
