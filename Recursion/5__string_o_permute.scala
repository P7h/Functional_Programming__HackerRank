

// https://www.hackerrank.com/challenges/string-o-permute

object Solution {

    def main(args: Array[String]) {
        io.Source.stdin.getLines.drop(1).toList
            .map(_.grouped(2).map(_.reverse).mkString(""))
            .map(println)
    }
}