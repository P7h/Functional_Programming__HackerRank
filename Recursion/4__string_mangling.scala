

// https://www.hackerrank.com/challenges/string-mingling/

// val c = a.zip(b).foreach{case (i,j) => print(i+""+j)}

// Got only 8.89 / 10 because of inefficiency of tail-recursion
object TailRecSolution {
  def main(args: Array[String]) {
    System.out.println("Enter first string: ")
    val firstString = scala.io.StdIn.readLine().toString
    System.out.println("Enter second string: ")
    val secondString = scala.io.StdIn.readLine().toString
    println(tailrecMangle(firstString, secondString).mkString)
  }

  import scala.annotation.tailrec
  @tailrec
  def tailrecMangle(p: String, q: String, acc: String = ""): String = {
    if (p.isEmpty || q.isEmpty) acc
    else tailrecMangle(p.tail, q.tail, acc + p.head + q.head)
  }
}

object Solution {
  def main(args: Array[String]) {
    System.out.println("Enter first string: ")
    val firstString = scala.io.StdIn.readLine().toList
    System.out.println("Enter second string: ")
    val secondString = scala.io.StdIn.readLine().toList
    println(mangle(firstString, secondString).mkString)
  }
  
  def mangle(p: List[Char], q: List[Char]) : List[Char] = {
    if (p.isEmpty) List()
    else (p.head :: q.head :: mangle (p.tail, q.tail))
  }
}
