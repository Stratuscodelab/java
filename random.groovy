// Generating random username and email
def randomUser = "user_" + (Math.random() * 1000).toInteger()
def randomEmail = "user_" + (Math.random() * 1000).toInteger() + "@localhost"

// Store in JMeter variables
vars.put("randomUser", randomUser)
vars.put("randomEmail", randomEmail)

// Print for debugging
log.info("Generated user: " + randomUser)
log.info("Generated email: " + randomEmail)




//This script in groovy will create a random username and random email, then store them in JMeter variables.
// the output would be an error due to there not being any official domain, because it's @localhost
// an example of the output would be GET http://localhost/api/login?username=user_137email=user_399@localhost  within request body.
// the vars.put can only hold one set of variables same goes for the log.info
// this script should be run in the jmeter test plan and will not work if run in the groovy console.