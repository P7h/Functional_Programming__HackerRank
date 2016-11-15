
// https://www.hackerrank.com/challenges/fp-list-length

def f(arr:List[Int]):Int = arr match {
    case _ :: tail => 1 + f(tail)
    case Nil => 0
}