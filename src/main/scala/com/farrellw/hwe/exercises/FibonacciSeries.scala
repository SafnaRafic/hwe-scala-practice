package com.farrellw.hwe.exercises
//Write some code that print out the first ten values of the Fibonacci series
//This is the sequence where every number is the sum of the two numbers before it
// so the result should be 0,1,1,2,3,5,8,13,21,34

object FibonacciSeries {
  def main(args: Array[String]): Unit = {
    var a = 0
    var b = 1
    var i = 0
    println(a);
    println(b)
    while (i < 10) {
      val currentValue = a + b;
      a = b;
      b = currentValue;
      i = i + 1;
      println(currentValue)
    }
  }
}
