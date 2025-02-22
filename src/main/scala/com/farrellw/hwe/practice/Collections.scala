package com.farrellw.hwe.practice

import scala.collection.mutable

object Collections {
  /*
    Returns a new list, where every element in the incoming list is multiplied by 3.
  */
  def timesThree(l: List[Int]): List[Int] = {
    l.map(x=>x*3)

  }

  /*
     Returns a new list, where every letter of every element in the incoming list is capitalized.
  */
  def upper(l: List[String]): List[String] = {
    l.map(s => {
      s.toUpperCase();
    })
  }

  /*
    Flattens a two deep list to one level.
   */
  def flatten(l: List[List[Int]]): List[Int] = {
    l.flatten;
  }

  /*
    Returns a new list, where only elements of the list passed in that are 0 or positive numbers are kept.
   */
  def takeOutNegatives(l: List[Int]): List[Int] = {
    // l.filter(_ >=0)
    l.filter((x:Int)=>{
      x>=0;
    })
  }

  /*
    Returns a new list, where only the elements passed in containing "car" are kept to the new list.
   */
  def keepStringsContainingCar(l: List[String]): List[String] = {
    l.filter(_.toLowerCase.contains("car"))
  }

  /*
    Returns a new list, with the depth flattened to 1 and every element in the resulting list multiplied by 3.
   */
  def flattenAndMultiply(l: List[List[Int]]): List[Int] = {

    //l.flatMap(_.map(_*3))
    l.flatMap(x => {
      x.map(y =>{
        y*3;
      })
    })
  }

  /*
    Returns the sum of all numbers passed in.
   */
  def sumDigits(l: List[Int]): Int = {
    l.foldLeft(0)(_+_);
  }

  /*
    Uses .foldLeft to implement the map method.
    / Advanced Problem, feel free to skip /
   */
  def mapUsingFoldLeft(l: List[Int], f: Int => Int): List[Int] = {
    l.foldLeft(List[Int]())(_ :+ f(_))
  }

  /*
    Uses .foldLeft to implement the flatMap method.
    / Advanced Problem, feel free to skip /
   */
  def flatMapUsingFoldLeft(l: List[List[String]], f: String => String): List[String] = {
    l.foldLeft(List[String]())(_ ++ _.map(f(_)))
  }
}
