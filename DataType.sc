// VALUES are immutable constants
val hello: String = "Hola!";

//VARIABLES are mutable
var helloThere: String = hello
helloThere = hello + " There!"
println(helloThere);

val immutableHelloThere = hello + " There!";
println(immutableHelloThere)

val numberOne : Int =1;
val truth: Boolean = true;
val letterA: Char= 'a';
val pi:Double = 3.14159265;
val piSinglePrecision: Float = 3.14159265F;
val BigNumber: Long = 123456789
val smallNUmber: Byte =127

println("Here is a mess "+ numberOne+truth+letterA+pi+piSinglePrecision)

//3 decimal point %f
println(f"Pi is about $piSinglePrecision%.3f")

//5 precision point to number %d
println(f"Zero padding on the left: $numberOne%05d")

//Without using + sign to concatenate the string
println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

//Expression
println(s"The s prefix isn't limited to variables. I can include any expression like ${1+3}")

// Integer
val theUltimateAnswer: String = "To life, the universe, and everything is 42";
val pattern = """.* ([\d]+).*""".r
val pattern(answerString)=theUltimateAnswer;
val answer = answerString.toInt;
println(answer)

//Boolean
val isGreater = 1>2;
val isLesser = 1<2;
val impossible = isGreater & isLesser;
val anotherWay = isGreater && isLesser;

//Boolean String
val picard : String = "Picard";
val bestCaptain : String = "Picard";
val isBest = picard == bestCaptain;

// Exercise
// Write some code that takes the value of pi, doubles it,
//and then prints it within a string  with three decimal
//places of precision to the right

val piValue: Double = 3.14159265;
val piDoubles: Double = piValue *2;
println(f"Double the value of pi : $piDoubles%.3f")

var name;