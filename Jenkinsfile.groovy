node (label 'linux') {
    stage("Hello"){
        sh "echo Hello"
    }
}

node ('node2'){
    stage("Hello from second"){
        sh "echo Hello from second"
    }
}