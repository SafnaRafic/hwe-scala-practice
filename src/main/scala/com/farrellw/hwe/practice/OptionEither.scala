package com.farrellw.hwe.practice

case class Item(description: String, price: Option[Int])

case class WeatherStation(name: String, temperature: Option[Int])

object OptionEither {
  /*
    Returns age of a dog when given a human age.
    Returns None if the input is None.
  */
  def dogAge(humanAge: Option[Int]): Option[Int] = {
    val petAge = humanAge.map(_ * 7);
    petAge match{
      case Some(s) =>
        println(s"Returned s: $s")
        petAge;
      case None =>
        None;
    }
  }

  /*
    Returns the total cost af any item.
    If that item has a price, then the price + 7% of the price should be returned.
  */
  def totalCost(item: Item): Option[Double] = {
//    item.price.map(_+(_*7))
    item.price.map(x=> x+(x*.07))
  }

  /*
    Given a list of weather temperatures, calculates the average temperature across all weather stations.
    Some weather stations don't report temperature
    Returns None if the list is empty or no weather stations contain any temperature reading.
   */
  def averageTemperature(temperatures: List[WeatherStation]): Option[Int] = {
    val temperature = temperatures.flatMap(x=> x.temperature);
    temperature match{
      case Nil => None
      case xs =>Some (xs.sum / xs.length)

    }


  }
}
