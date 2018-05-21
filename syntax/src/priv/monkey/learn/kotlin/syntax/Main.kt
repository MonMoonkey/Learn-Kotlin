package priv.monkey.learn.kotlin.syntax

import java.util.*

fun main(args: Array<String>) {
    var a:Int = 5
    var b:Int = 4
    var max = if (a > b) {
        println("choose a")
        a

    } else {
        println("choose b")
        b
    }
}

class Main {

/*  关键字
    public / protected / private / internal
    expect / actual
    final / open / abstract / sealed / const
    external
    override
    lateinit
    tailrec
    vararg
    suspend
    inner
    enum / annotation
    companion
    inline
    infix
    operator
    data*/

    val a: Int = 1
    val b = 1

    var d:Double = 0.002
    var f:Float = 0.2F
    var l:Long =588888888
    var i:Int =9
    var s:Short=5
    var bype:Byte=4

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    val n:Int? = null


    fun sum(a: Int, b: Int): Int {
        val c: Int
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int) = a + b + c

    //Unit代表无返回值，可以省略不写
    fun printSum(a: Int, b: Int): Unit {
        println("$a + $b = ${a + b}")
    }

    fun maxof(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxof2(a: Int, b: Int): Int = if (a > b) a else b
}