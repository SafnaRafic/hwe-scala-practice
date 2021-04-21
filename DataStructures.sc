//Data Structures

//Tuples - can contain differnt types of data type
//Immutable lists

val captainStuff = ("Picard", "Enterprise-D","NCC-1701-D") // It considers as a single object
println(captainStuff)

//refer tot he individual fields with a ONE-BASED index

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

//key value pair
val picardShip = "Picard" -> "Enterpise-D";
println(picardShip._2)

val aBunchOfStuff = ("Kirk", 1964, true)

//Lists - has more collection objects as functionality
// cannot hold different data type
//Like a tuple, more functionality
//Must be of same data type
//ZERO BASED index

val shipList = List("Enterprise", "Defiant","Voyager", "Deep Space Nine")
//zero based
println(shipList(1))

//head and tail operable
println(shipList.head)
println(shipList.tail)

//for loop to iterate the list
for(ship <- shipList) { println(ship)}

//function literal to list
val backwardShip = shipList.map((ship:String) =>{ship.reverse})
for(ship <- backwardShip) {println(ship)}

//reduce() to combine together all the items in a collection using some function
val numberList = List(1,2,3,4,5)
val sum = numberList.reduce((x:Int, y:Int) => x+y)

//filter() removes stuff
val iHateFives = numberList.filter((x:Int)=> x!= 5)
val iHateThrees = numberList.filter(_ !=3)

//Concatenate Lists - ++
val moreNumbers = List(6,7,8)
val LotOfNumbers = numberList ++ moreNumbers

//reverse
val reversed = numberList.reverse;

//sort
val sorted = reversed.sorted

//Distinct values
val lotsOfNumbers = numberList ++ numberList
val distictValues = lotsOfNumbers.distinct

//Max
val maxValue = numberList.max;

//Total
val total = numberList.sum;

//check element exist in the list
val hasThree = iHateThrees.contains(3)

//MAPS
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D","Sisko"->"Deep Space Nine","Janeway"->"Voyager")
println(shipMap("Janeway"))
println(shipMap.contains("Archer"))
//missing values in the map using TRY CATCH
val archerShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archerShip);

//Exercise
//Create a list of numbers 1-20. your job is print put the numbers that are divisible by 3
//Scala modula operator like other language is %. Do this first by iterating through all the items in the list
//and testing each one as you go. then do it again by using filter function on the list instead

val numberList20 = (1 to 20).toList;
for(nums <- numberList20){
  if(nums%3 == 0){
    println(nums)
  }
}
//val numberDivByThree = numberList20.map((num: Int)=> (num%3))





