package com.example.pascuajulynmobcom1

fun main(){

    do {
        println("=========================================================")
        println("MENU:")
        println("[J] Juice 12.50                   [1] Cake 35.00")
        println("[H] Hot Choco 18.50               [2] Pudding 12.50")
        println("[C] Coffee 10.00                  [3] Flan 10.00")
        println("[S] Soda 25.50                    [4] Salad 20.50")
        print("Your beverage: ")
        var beverage = readLine()
        var beveragePrice = 0.00
        var dessertPrice = 0.00
        when (beverage) {
            "J", "j" -> {
                beveragePrice = 12.50
                println("You will be given a glass of juice, which costs $beveragePrice")
            }
            "H", "h" -> {
                beveragePrice = 18.50
                println("You will be given a cup of hot choco, which costs $beveragePrice")
            }
            "C", "c" -> {
                beveragePrice = 10.00
                println("You will be given a cup of coffee, which costs $beveragePrice")
            }
            "S", "s" -> {
                beveragePrice = 25.50
                println("You will be given a glass of soda, which costs $beveragePrice")
            }
            else -> {
                println("Invalid input")
            }
        }

        print("Enter dessert: ")
        var dessert = readLine()!!.toInt()

        when (dessert) {
            1 -> {
                dessertPrice = 35.00
                println("That is cake, which costs $dessertPrice")
            }
            2 -> {
                dessertPrice = 12.50
                println("That is pudding, which costs $dessertPrice")
            }
            3 -> {
                dessertPrice = 10.00
                println("That is flan, which costs $dessertPrice")
            }
            4 -> {
                dessertPrice = 20.50
                println("That is salad, which costs $dessertPrice")
            }
            else -> {
                println("Invalid input")
            }
        }

        var total = beveragePrice + dessertPrice
        println("Total: $total")
        print("Enter cash tendered: ")
        var cash = readLine()!!.toInt()
        if (total > cash) {
            var lack = total - cash.toDouble()
            println("You lack $lack")
        } else {
            var change = cash.toDouble() - total
            println("Change is $change")
        }

        print("Another order? [Y]Yes [N]No: ")
        var choice = readLine()
    }while(choice=="y" || choice=="Y")

    println("Bye!")

}