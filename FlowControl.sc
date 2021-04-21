// Flow control

// If else
if(1>3) println("Impossible") else println("The world makes sense")

if(1>3){
  println("Impossible")
  println("Really ?")
} else {
  println("The world makes sense")
  println("Still.")
}

// Matching - switch case
val number =3;
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}


//for loop
for( x <- 1 to 4){
  val squared = x*x;
  println(squared)
}

// while loop
var x =10;
while(x>=0) {
  println(x)
  x-=1;
}

//do while loop

x=0;
do { println(x); x+=1;} while(x<=10)

//Expressions
{val x = 10; x + 20}
println({val x = 10; x + 20})

// Exercise
//Write some code that print out the first ten values of the Fibonacci series
//This is the sequence where every number is the sum of the two numbers before it
// so the result should be 0,1,1,2,3,5,8,13,21,34

var a = 0
var b = 1
var i = 0
println(a);
println(b)
while(i < 10){
  val currentValue = a + b;
  a = b;
  b = currentValue;
  i = i+1;
  println(currentValue)
}
