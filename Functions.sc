//Functions

//format def <function name>(parameterName : type ..) : returnType = { }

def sqaureIt(x : Int) : Int ={
  x * x;
}

def cubeIt(x : Int) : Int ={
  x * x * x;
}

println(sqaureIt(2));

println(cubeIt(2));

// Passing function in another function

def transformIt(x: Int, f: Int => Int): Int = {
  f(x)
}

val result = transformIt(2, cubeIt);
println(result)

transformIt(2, x => x * x * x) // inline function or anonymous function or inline lamed function

transformIt(10, x => x/2)

transformIt(2, x=> {val y = x * 2; y*y})

//Exercise
//Strings have a inbuilt toUpperCase method. For example, "foo".toUpperCase give you back "FOO"
//Write a function that converts a string to uppercase and use that function of a few test strings
//Then, do the same thing using a function literal instead of separate , named function

def upperCase(str : String) : String = {
  str.toUpperCase;
}

upperCase("hello")

def transformString(str : String, f : String => String): String ={
  f(str)
}

transformString("hello", upperCase)

transformString("HELLO", str => str.toLowerCase())


val myNums: List[Int] = (1 to 10).toList

// Not Inline
def addTwo(input: Int): Int = {
  input + 2
}

println("Not Inline", myNums.map(num => addTwo(num)))

// Inline
println("Inline", myNums.map(num => num + 2))