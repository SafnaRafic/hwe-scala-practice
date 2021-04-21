package com.farrellw.hwe.exercises
// Exercise
// Write some code that takes the value of pi, doubles it,
//and then prints it within a string  with three decimal
//places of precision to the right

object DoublePiValue {
  def main(args: Array[String]): Unit = {
    val piValue: Double = 3.14159265;
    val piDoubles=doublePiValues(piValue)
    println(f"Double the value of pi : $piDoubles%.3f")
  }

  def doublePiValues(piValue: Double): Double = {
    piValue *2;
  }
}
