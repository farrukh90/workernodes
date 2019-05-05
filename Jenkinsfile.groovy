node ('linux') {
    stage("Hello"){
        sh "echo Hello"
    }
}

node ('linux'){
    stage("Hello from second"){
        sh "echo Hello from second"
    }
}