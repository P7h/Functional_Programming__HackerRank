
// https://www.hackerrank.com/challenges/fp-array-of-n-elements

// def f(num:Int) : List[Int] = {
// 	for (x <- (0 until num)) yield x
// }

List.fill(num)(num)
List.range(1, num)

// def f(num:Int) : List[Int] = {
//     num match {
//         case 0 => Nil
//         default => num :: f(num-1)
//     }
// }

// def f(num:Int) : List[Int] = if(num==0) Nil else num::f(num-1)
