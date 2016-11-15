
// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list
// def f(arr:List[Int]):List[Int] = {
//     arr.zipWithIndex.filter { case (i,j) =>
//         j % 2 == 1
//     }.map{case (i,j) => i}
// }

// def f(arr:List[Int]):List[Int] = {
//     if(arr.size == 0) List[Int]()
//     arr match {
//         case x::y::xs => List(y) ::: f(xs)
//     }
// }