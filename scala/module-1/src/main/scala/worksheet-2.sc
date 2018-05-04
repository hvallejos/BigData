/*
Pattern Matching with case classes
 */

abstract class Person(fname: String, lname: String){
  def fullName()= {s"$fname-$lname"}
}

case class Student(fname: String, lname: String, id: Int)
    extends Person(fname, lname)

val student = Student("Full Name", "Last name", 25)

def getFullID[T <: Person](something: T) = {
  something match {
    case Student(fname,lname,id) => {s"$fname - $lname - $id"}
    case p: Person => p.fullName()
  }
}
getFullID(student)

/*
Implicit conversions
 */

implicit class StringUtils(myString: String){
  def scalaWordCount() = {
    val split = myString.split("\\s+")
    val grouped = split.groupBy(word => word)
    val countPerKey = grouped.mapValues(group => group.length)
    countPerKey
  }
}

"Spark collections mimic Scala collections".scalaWordCount()