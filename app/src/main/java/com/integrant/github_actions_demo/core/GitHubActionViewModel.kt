package com.integrant.github_actions_demo.core

//TODO: add new functionality
class GitHubActionViewModel() {


    fun sumTwoNumbers(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun subTwoNumbers(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multipleTwoNumbers(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divTwoNumbers(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun multipleByTen(num: Int): Int {
        return num * 10
    }

    private fun unusedFunction() {}

}
