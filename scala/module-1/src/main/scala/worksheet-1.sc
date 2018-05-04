
val myList = List("Spark", "Hadoop","Hive","Kafka")
val mapping = myList.map( s => s.toUpperCase)

val text: String = "Text for scala"

def sayName(name: String) = {
  s"Hello my name is: $name!"
}

val name = sayName("hvallejos")

def sayHello(name: String)(myself: String) = {
  s"Hello $name, I'm $myself!"
}
val hello= sayHello("hvallejos")("Scala")

def test_Hello(name: String)(WhoAreYou: () => String) = {
  s"Hello $name, My name is ${WhoAreYou()}"
}

def other_test(name: String)(sayHelloTest: () => String) ={
  s"Hello $name, my name is ${sayHelloTest()}"
}
def provideName() = {"Scala"}

val other_name = test_Hello("hvallejos")(provideName)
val other_name2 = other_test("hvallejos")(provideName)
val test_name = test_Hello("hvallejos")( () => {"Spark"})
val test_name2 = other_test("hvallejos")( () => {"Spark and Hadoop"} )

/*
Fast Track to Scala: Language Features
 */

def sayHelloImplicit(name: String)(implicit myself: String) ={
  s"Hello $name, my name is $myself!"
}
def sayHelloWorld(name: String)(implicit implicit_func: () => String) = {
  s"Hello $name, my implicit function is: ${implicit_func()}"
}

implicit val other_myseft = "implicit"
implicit def implicit_func() = {"implicit function"}

val implicit_say = sayHelloImplicit("hvallejos")
val implicit_f = sayHelloWorld("hvallejos")(implicit_func)

/*
Classes
 */

class fastTrack(name: String, myself: String){
  def sayHello(name: String)(myself: String) = {
    s"Hello $name, I'm $myself!"
  }
  val greeting = sayHello(name)(myself)

  override def toString = s"$greeting"
}
val fast = new fastTrack("hvallejos","class in scala")

/*
Case classes
 */
case class person(names: String, last_name: String)

val me = person("Héctor", "Vallejos Sánchez")


