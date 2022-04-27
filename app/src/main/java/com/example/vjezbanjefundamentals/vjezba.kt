package com.example.vjezbanjefundamentals

import java.lang.IllegalArgumentException

fun main() {
    val dominik = Person("Dominik", 23)

    var marko = White("Marko", 22)
    marko.fja2()
    marko.fja()


}

open class Person(name: String, age: Int) {
    lateinit var ime: String
    var speed: Int = 100
    init {
        println("You have created Person object with $name and $age of age.")
        this.ime = name
    }
     open fun fja() {
        println("Hey $ime")
    }
}
class White(name: String, age: Int): Person(name, age){
    var ime2: String = ime
    fun fja2(){
        println("Ovo je funkcija iz derivirane klase koja koristi ime $ime2")
    }
    override fun fja(){
        println("Hey $ime2")
    }
}

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("Breaking")
    }
}
open class Car(override val maxSpeed: Double):Drivable{
    override fun drive(): String {
        return "Ovo se vraća"
    }
}
