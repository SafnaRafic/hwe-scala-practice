package com.farrellw.hwe.exercises

import scala.collection.mutable

object NumberDivByThree {
  def main(args: Array[String]):Unit = {
    val myNumList= (1 to 20).toList;
    var divByThree = mutable.MutableList[Int]();
    for(nums <- myNumList){
      if(nums%3 == 0){
        divByThree+=nums

      }
    }
    println(divByThree)
    println(myNumList.filter((x:Int)=> (x%3)== 0))

  }


}
