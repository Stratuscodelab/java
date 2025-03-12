//generating random username

def randomUser = "user_" + (Math.random() * 1000).toInteger()

//store in jmerter variable 
vars.put("randomUser", randomUser)

//print for debug
log.info("generated user: " + randomUser)