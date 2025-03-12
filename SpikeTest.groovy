// this test will simulate a spike test / a sudden surge in traffic to the server.

def userID = "user_" + (Math.random() * 1000).toInteger()
def requestTime = System.currentTimeMillis()

// log thie simulated spike test in the jmeter log
log.info("User $userID logging in at $requestTime ")

//simulate the response delay
def responseTime = (100 + Math.random() * 400).toInteger()
Thread.sleep(responseTime)

//log the completion of the request
log.info("User $userID completed login in $responseTime ms")

