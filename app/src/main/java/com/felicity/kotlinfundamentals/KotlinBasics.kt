package com.felicity.kotlinfundamentals

fun main()
{
    println("Hi this Tendai with new code")
    variablesfun();
    datatypes();
}

// TODO: The Variable Function, contains basic code declarations
fun variablesfun()
{
    //Basic declaration of variables
    var userName= "Tendai"; //mutable variable var that variable declaration  and userName is variable name
    // the "Tendai" thats our variable value(Inferred String)
    // as you can see theres no data type hence Kotlin will check the value set to the variable and this will be our variable type.
    val password = 123456; //immutable variable val that variable declaration and password is variable name once  the value is set it cannot be changed
   //Examples
    val popcorn = 5;    // There are 5 boxes of popcorn
    val hotdog = 7;     // There are 7 hotdogs
    var customers = 10; // There are 10 customers in the queue

// Some customers leave the queue
    customers = 8;
    println(customers)
// 8
    val customer = 10;
    println("There are $customer customers");
// There are 10 customers
    println("There are ${customer + 1} customers");
// There are 11 customers
}
fun datatypes()
{
    //integers Byte, Short, Int, Long

    val year: Int = 2020

  //  Unsigned integers UByte, UShort, UInt, ULong

    val score: UInt = 100u

   // Floating-point numbers  Float, Double

    val currentTemp: Float = 24.5f;
    val price: Double = 19.99;

    //Booleans Boolean

    val isEnabled: Boolean = true;

   // Characters Char

    val separator: Char = ',';

   // Strings  String

    val message: String = "Hello, world!"

    // Variable declared without initialization
    val d: Int=0;
// Triggers an error
    println(d.toString());
// Variable 'd' must be initialized
    val age: UInt= 2u;
// Triggers an error
    println(d.toString());
// Variable 'd' must be initialized
}