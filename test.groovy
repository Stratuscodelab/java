println "hello world"

// define variables

def user = "testuser"
def age = 42

//conditional logic 

if (age > 18) {
    println "$user is an adult"
} else {
    println "$user is underage"
}

// loop example 

for (i in 1..5) {
    println "iteration: $i"
}

//gernerate random numbers 

def randomNumber = (Math.random() * 1000).toInteger()
println "random user ID: $randomNumber"