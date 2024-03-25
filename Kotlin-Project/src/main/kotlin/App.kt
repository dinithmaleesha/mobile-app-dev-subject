fun main (args: Array<String>){
    println("Hello World")

    // Statements
    var x = 3
    val name = "Cormoran"
    x = x * 10
    print("X is $x")

    // loops
    while (x > 20){
        x = x - 1
        print("x is now $x")
    }

    for (i in 1..10){
        x = x + 1
        print("x is now $x")
    }

    var i = 1
    while (i <= 5){         // Print line 5 times
        println("Line $i")
        ++i
    }

    // Do-while loop
    var number = 6
    var factorial = 1
    do {
        factorial *= number
        number--
    }while (number > 0)
        println("Factorial of 6 is $factorial")

    // Condition
    if (x == 20) {
        println("x must be 20.")
    } else {
        println("x isn't 20.")
    }

    if (name.equals("Cormoran")){
        println("$name Strike")
    }

    // Using if to return a value
    // we can use if as an expression, so that it returns a value.
    if (5 > 10) "5 is greater than 10" else "5 is not greater than y"
}

/*
* Use Kotlin interactive shell - This allows us to quickly try out snippets of code outside your main code
* Tools menu -> Kotlin -> Kotlin REPL
* */