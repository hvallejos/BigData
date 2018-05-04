/*
Collections
 */
val myList = List("Spark","mimics","collections","Scala")
val mapping = myList.map( s => s.toUpperCase())

val flatMapped = myList.flatMap { s =>
  val filters = List("mimics", "collections")
  if(filters.contains(s))
    None
  else
    Some(s)
}